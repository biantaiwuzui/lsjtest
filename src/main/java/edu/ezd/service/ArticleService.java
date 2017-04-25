package edu.ezd.service;

import edu.ezd.dao.ArticleDao;
import edu.ezd.model.Article;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ArticleService {
    @Resource
    private ArticleDao articleDao;

    /**
     * 查询所有的文章信息
     * @return 文章的相关信息
     */
    public List<Article> findAll(){
        List<Article> articleList = articleDao.findAll();
        return articleList;
    }

    /**
     * 修改文章的状态 显示/隐藏
     * @param status 要修改文章的状态
     * @param id 要修改文章的id
     * @return
     */
    public boolean update(int status,int id){
        try{
            articleDao.updateStatu(status,id);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除文章（修改用户为删除的状态，这里定义为2）
     * @param id 要删除的文章的id
     * @return
     */
    public boolean del(int id){
        try{
            articleDao.updateStatu(2,id);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据id查找出所属文章的详情
     * @param id 要查看的文章
     * @return 文章的内容
     */
    public Article getArticleByID(int id){
        try{
            Article article = articleDao.queryById(id);
            return article;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void addArticle(Article article){
        articleDao.save(article);
    }
}
