package edu.ezd.control.app;

import edu.ezd.model.Post;
import edu.ezd.service.PostService;
import edu.ezd.util.GsonUtil;
import edu.ezd.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/24.
 */
@Controller
@RequestMapping("/post")
public class PostControler {
    @Resource
    private PostService postService;

    @GetMapping
    public String index(){
        return "post/index";
    }

    @GetMapping("/postinfo")
    public String postInfo(){
        return "post/postinfo";
    }

    @GetMapping(value = "/findAll", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String findAll(){
        List<Post> posts = postService.findAll();

        String json = GsonUtil.toJson(posts);
        System.out.println(json);
        return json;
    }

    @GetMapping( value = "/find/{id}", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String find(@PathVariable int id){
        Post post = postService.getPostInfo(id);
        String json = GsonUtil.toJson(post);
        return json;
    }



}
