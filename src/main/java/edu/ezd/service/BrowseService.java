package edu.ezd.service;

import edu.ezd.dao.BrowseDao;
import edu.ezd.model.Browse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class BrowseService {
    @Resource
    private BrowseDao browseDao;

    public boolean add(Browse browse){
        try{
            browseDao.addBrowse(browse);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
