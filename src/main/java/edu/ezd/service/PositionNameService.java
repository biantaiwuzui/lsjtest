package edu.ezd.service;

import edu.ezd.dao.PositionNameDao;
import edu.ezd.model.PositionName;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/18.
 */
@Service
@Transactional
public class PositionNameService {

    @Resource
    private PositionNameDao positionNameDao;
    public List<PositionName> getPositionName(int industry_id){
        return positionNameDao.getPositionName(industry_id);
    }
}
