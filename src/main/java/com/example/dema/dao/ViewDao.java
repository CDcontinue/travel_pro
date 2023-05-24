package com.example.dema.dao;

import com.example.dema.entity.View;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.print.attribute.standard.Destination;
import java.util.List;

@Mapper
public interface ViewDao {
    //查找热门目的地前六个
    @Select("select * from View limit 0,6")
    public abstract List<View> findSixDestination() throws Exception;
}
