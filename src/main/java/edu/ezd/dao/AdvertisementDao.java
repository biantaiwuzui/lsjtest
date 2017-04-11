package edu.ezd.dao;

import edu.ezd.model.Advertisement;

import java.util.List;

/**
 * Created by JayJay on 2017/4/10.
 */
public interface AdvertisementDao {
    /**
     * 查询所有
     * @return 所有广告
     */
    List<Advertisement> findAll();
    /**
     * 修改或者删除数据
     */
    void save();

    /**
     * 修改或者删除数据
     */
    void update();
    /**
     * 修改或者删除数据
     */
    Advertisement getAdvertisement();
}
