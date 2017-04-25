package edu.ezd.dao;

import edu.ezd.model.RecruitmentDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by JayJay on 2017/4/11.
 */
public interface RecruitmentDetailsDao {
    List<RecruitmentDetails> findAll();

    RecruitmentDetails getRecruitmentDetails(@Param(value="postId")int postId);
}
