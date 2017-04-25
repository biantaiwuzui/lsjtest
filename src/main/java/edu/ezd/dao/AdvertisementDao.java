package edu.ezd.dao;

import edu.ezd.model.Advertisement;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AdvertisementDao {
    /**
     * 查询所有
     * @return 所有广告
     */
    List<Advertisement> findAll();
    /**
     * 添加广告
     */
    void save(Advertisement advertisement);

    /**
     * 修改或者删除数据
     */
    void update(Advertisement advertisement);
    /**
     * 根据id查询某个广告
     */
    Advertisement getAdvertisement(int id);
}
