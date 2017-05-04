package edu.ezd.service;

import edu.ezd.dao.EnterpriseDao;
import edu.ezd.dao.EnterpriseTypeDao;
import edu.ezd.dao.PostDao;
import edu.ezd.model.Enterprise;
import edu.ezd.model.EnterpriseType;
import edu.ezd.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/5/4.
 */
@Service
@Transactional
public class EnterpriseService {
    @Resource
    private EnterpriseDao enterpriseDao;
    @Resource
    private EnterpriseTypeDao enterpriseTypeDao;
    @Resource
    private PostDao postDao;

    public List<Enterprise> findAll(){
        List<Enterprise> enterprises = enterpriseDao.findAll();
        for (Enterprise e:
             enterprises) {
            EnterpriseType enterpriseType = enterpriseTypeDao.getEnterpriseType(e.getEnterpriseTypeId());
            e.setEnterpriseType(enterpriseType);
            List<Post> enterprisePost = postDao.getEnterprisePost(e.getEnterpriseId());
            e.setPosts(enterprisePost);
        }
        return enterprises;
    }
}
