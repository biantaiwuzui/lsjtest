package edu.ezd.dao;

import edu.ezd.model.PostBrowse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by JayJay on 2017/4/24.
 */
public interface PostBrowseDao {
    List<PostBrowse> findAll();

    List <PostBrowse> getSome(@Param(value="postId") int postId);
}
