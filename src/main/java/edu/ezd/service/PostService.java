package edu.ezd.service;

import edu.ezd.dao.EnterpriseDao;
import edu.ezd.dao.PostBrowseDao;
import edu.ezd.dao.PostDao;
import edu.ezd.dao.RecruitmentDetailsDao;
import edu.ezd.model.Enterprise;
import edu.ezd.model.Post;
import edu.ezd.model.PostBrowse;
import edu.ezd.model.RecruitmentDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/24.
 */
@Service
@Transactional
public class PostService {
    @Resource
    private PostDao postDao;
    @Resource
    private RecruitmentDetailsDao recruitmentDetailsDao;
    @Resource
    private EnterpriseDao enterpriseDao;
    @Resource
    private PostBrowseDao postBrowseDao;

    public List<Post> findAll(){
        List<Post> posts = postDao.findAll();
        for (Post p : posts){
            Enterprise enterprise = enterpriseDao.getEnterprise(p.getEnterpriseId());
            RecruitmentDetails recruitmentDetails = recruitmentDetailsDao.getRecruitmentDetails(p.getPostId());
            List<PostBrowse> postBrowses = postBrowseDao.getSome(p.getPostId());
            p.setEnterprise(enterprise);
            p.setRecruitmentDetails(recruitmentDetails);
            p.setPostBrowses(postBrowses);

        }
        return posts;
    }

    public Post getPostInfo(int postId){
        return postDao.getPostInfo(postId);
    }
}
