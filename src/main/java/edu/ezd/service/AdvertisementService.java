package edu.ezd.service;

import edu.ezd.dao.AdvertisementDao;
import edu.ezd.model.Advertisement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class AdvertisementService {
    @Resource
    private AdvertisementDao advertisementDao;

    public void save(Advertisement advertisement){
        advertisementDao.save(advertisement);
    };
}
