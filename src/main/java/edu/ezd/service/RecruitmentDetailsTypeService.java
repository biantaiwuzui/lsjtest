package edu.ezd.service;

import edu.ezd.dao.RecruitmentDetailsTypeDao;
import edu.ezd.model.RecruitmentDetailsType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/20.
 */
@Service
@Transactional
public class RecruitmentDetailsTypeService {

    @Resource
    private RecruitmentDetailsTypeDao recruitmentDetailsTypeDao;

    public List<RecruitmentDetailsType> findAll(){
        return recruitmentDetailsTypeDao.findAll();
    }

    public void save(RecruitmentDetailsType recruitmentDetailsType){
        System.out.println("Service前:>>>>>>"+recruitmentDetailsType.getRecruitmentDetailsTypeId());
        recruitmentDetailsTypeDao.save(recruitmentDetailsType);
        System.out.println("Service后:>>>>>>"+recruitmentDetailsType.getRecruitmentDetailsTypeId());
    }

    public void update(RecruitmentDetailsType recruitmentDetailsType){
        recruitmentDetailsTypeDao.update(recruitmentDetailsType);
    }
}
