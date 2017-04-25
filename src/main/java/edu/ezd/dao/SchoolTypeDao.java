package edu.ezd.dao;

import edu.ezd.model.SchoolType;

import java.util.List;

/**
 * Created by JayJay on 2017/4/11.
 */
public interface SchoolTypeDao {
    List<SchoolType> findAll();

    void save(SchoolType schoolType);

    void update(SchoolType schoolType);
}
