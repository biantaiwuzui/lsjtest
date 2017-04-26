package edu.ezd.dao;

import edu.ezd.model.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {

    /**
     * 查询文章所有
     * @return 文章表相关的信息
     */
    List<Article> findAll();

    Article queryById(int id);

    void save(Article article);

    /**
     * 对文章进行管理，目的，将其状态变为显示或隐藏还有对其进行删除操作
     */
    void updateStatu(@Param("article_statue") int status, @Param("articleId") int id);


}
