package edu.ezd.control.backgroup;

import edu.ezd.model.Article;
import edu.ezd.model.Browse;
import edu.ezd.model.Users;
import edu.ezd.service.ArticleService;
import edu.ezd.util.Upload;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 就业文章表的控制层
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    private static final Logger log = Logger.getLogger(ArticleController.class);
    @Resource
    private ArticleService articleService;

    @GetMapping
    public String index(Model model){
        List<Article> articles = articleService.findAll();

        for (Article a:articles){
           log.info(">>>>"+a.getBrowses().toString());
        }
        model.addAttribute("articles",articles);
        return "Article/index";
    }


    @PostMapping(value = "/updateStatus/{article_statue}/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String updateStatusByArticle(@PathVariable int article_statue,@PathVariable int id){
        log.info("article_statue="+article_statue+"&&&&&&&"+"id="+id);
        boolean bl = articleService.update(article_statue,id);
        if(bl){
            return "ok";
        }else{
            return "error";
        }
    }
    @PostMapping(value = "/del/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String delArticle(@PathVariable int id){
        log.info("要删除的文章的id="+id);
        boolean bl = articleService.del(id);
        if(bl){
            return "del";
        }else{
            return "error";
        }
    }

    @GetMapping(value = "/{id}")
    public String getArticleByid(@PathVariable int id,Model model){
        log.info("要查看的文章的id"+id);
        Article article = articleService.getArticleByID(id);
        if(article != null){
            model.addAttribute("article",article);
            return "Article/info";
        }
        return "";
    }
    @GetMapping(value = "/add")
    public String addArticleIndex(Article article){

        return "Article/add";
    }

    @PostMapping(value = "/add")
    public String addArticle(Article article,MultipartFile file, HttpServletRequest request){
        try {
            String url = Upload.upload(file,request,2);
            article.setArticleImg(url);
            article.setSendDate(new Date());
            article.setArticle_statue(0);
            article.setSendByUser_email("123@qq.com");
            article.setSendByUser(1);
            articleService.addArticle(article);
            return "redirect:/article";
        } catch (IOException e) {
            e.printStackTrace();
            log.info("添加失败");
            return "";
        }

    }
}
