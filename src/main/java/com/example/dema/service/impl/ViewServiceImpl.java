package com.example.dema.service.impl;


import com.example.dema.dao.ViewDao;
import com.example.dema.entity.View;
import com.example.dema.service.ViewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ViewServiceImpl implements ViewService {
    @Resource
    private ViewDao viewDao;

    //查找热门目的地前六个
    @Override
    public List<View> findSixDestination() throws Exception {
        return viewDao.findSixDestination();
    }

//    //查找所有热门目的地
//    @Override
//    public List<Destination> findAllDestination(Integer page,Integer size) throws Exception {
//        PageHelper.startPage(page,size);
//        return destinationDao.findAllDestination();
//    }
//
//    //修改目的地信息
//    @Override
//    public int updateDestination(Destination destination) throws Exception {
//        return destinationDao.updateDestination(destination);
//    }
//
//    //修改信息时查询目的地名是否已被使用
//    @Override
//    public int findDesNameIsUsed(Integer desId, String desName) throws Exception {
//        return destinationDao.findDesNameIsUsed(desId,desName);
//    }
//
//    //根据传过来的目的地名进行模糊查询
//    @Override
//    public List<Destination> fuzzyQuery(String desName) throws Exception {
//        return destinationDao.fuzzyQuery(desName);
//    }
//
//    //添加新目的地时判断新名字是否被使用过
//    @Override
//    public int findNewDesNameIsUsed(String newDesName) throws Exception {
//        return destinationDao.findNewDesNameIsUsed(newDesName);
//    }
//
//    //执行添加目的地操作
//    @Override
//    public int addDestination(Destination destination) throws Exception {
//        return destinationDao.addDestination(destination);
//    }
//
//    //根据id删除目的地
//    @Override
//    public int deleteDestination(Integer desId) throws Exception {
//        return destinationDao.deleteDestination(desId);
//    }
//
//    //旅游网站首页查找所有热门目的地
//    @Override
//    public List<Destination> findAll() throws Exception {
//        return destinationDao.findAll();
//    }
//
//    //根据目的地名查询目的地
//    @Override
//    public Destination findByDestName(String destName) throws Exception {
//        return destinationDao.findByDestName(destName);
//    }

}
