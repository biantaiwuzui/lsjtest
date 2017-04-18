package edu.ezd.service;

import edu.ezd.dao.EnterpriseTypeDao;
import edu.ezd.model.EnterpriseType;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/17.
 */
@Service
@Transactional
public class EnterpriseTypeService {

    private static final Logger log = Logger.getLogger(EnterpriseTypeService.class);
    @Resource
    EnterpriseTypeDao enterpriseTypeDao;

    public List<EnterpriseType> getEnterpriseList(){
        return enterpriseTypeDao.findAll();
    }

}
