package edu.ezd.dao;

import edu.ezd.model.Enterprise;

import java.util.List;

/**
 * Created by JayJay on 2017/4/11.
 */
public interface EnterpriseDao {
    List<Enterprise> findAll();

    Enterprise getEnterprise(int enterpriseId);
}
