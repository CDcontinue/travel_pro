package com.example.dema.service;

import com.example.dema.entity.View;

import java.util.List;

public interface ViewService {
    //查找热门目的地前六个
    public abstract List<View> findSixDestination() throws Exception;
}
