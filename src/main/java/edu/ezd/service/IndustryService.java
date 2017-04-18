package edu.ezd.service;

import edu.ezd.dao.IndustryDao;
import edu.ezd.model.Industry;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/17.
 */
@Service
@Transactional
public class IndustryService {
    @Resource
    private IndustryDao industryDao;

    public List<Industry> findAll(){
        return industryDao.findAll();
    }

    public Industry getIndustry(int industryId){
        return industryDao.getIndustry(industryId);
    }


}
