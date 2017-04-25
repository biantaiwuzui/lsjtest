package edu.ezd.dao;

import edu.ezd.model.Article;

import java.util.List;

/**
 * Created by JayJay on 2017/4/11.
 */
public interface ArticleDao {

    List<Article> findAll();

    Article getArticle();

    void save();

    void update();


}
