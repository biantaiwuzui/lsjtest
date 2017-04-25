package edu.ezd.dao;

import com.sun.rowset.internal.BaseRow;

import java.util.List;

    /**
     * Created by JayJay on 2017/4/11.
     */
    public interface BrowseDao {

        List<BaseRow> getSome(int articleId);
}
