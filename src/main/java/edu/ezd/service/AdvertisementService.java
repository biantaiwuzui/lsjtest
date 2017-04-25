package edu.ezd.service;

import edu.ezd.dao.AdvertisementDao;
import edu.ezd.model.Advertisement;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AdvertisementService {

    private static final Logger log = Logger.getLogger(AdvertisementService.class);
    @Resource
    private AdvertisementDao advertisementDao;

    public void save(Advertisement advertisement){
        advertisementDao.save(advertisement);
    };

    public List<Advertisement> findAll(){
        List<Advertisement> advertisement_list = advertisementDao.findAll();
        return advertisement_list;
    }

    public boolean delAdvertisement(int id){
        try{
            Advertisement advertisement = new Advertisement();
            advertisement.setAdvertisementId(id);
            advertisement.setAdvertisingStatue(1);
            log.info("要删除的类得信息"+advertisement.toString());
            advertisementDao.update(advertisement);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
