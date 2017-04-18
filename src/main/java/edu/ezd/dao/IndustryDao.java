package edu.ezd.dao;

import edu.ezd.model.Industry;

import java.util.List;

/**
 * Created by JayJay on 2017/4/11.
 */
public interface IndustryDao {

    List<Industry> findAll();

    Industry getIndustry(int IndustryId);
}
