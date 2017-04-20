package edu.ezd.service;

import edu.ezd.dao.SchoolTypeDao;
import edu.ezd.model.SchoolType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/20.
 */
@Service
@Transactional
public class SchoolTypeService {

    @Resource
    private SchoolTypeDao schoolTypeDao;

    public List<SchoolType> findAll(){
        return schoolTypeDao.findAll();
    }

    public void save(SchoolType schoolType){
        schoolTypeDao.save(schoolType);
    }

    public void update(SchoolType schoolType){
        schoolTypeDao.update(schoolType);
    }

}
