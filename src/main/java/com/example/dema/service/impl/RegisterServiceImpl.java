package com.example.dema.service.impl;


import com.example.dema.dao.RegisterDao;
import com.example.dema.entity.UserInfo;
import com.example.dema.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterDao registerDao;

    //用户注册
    @Override
    public int register(UserInfo userInfo) throws Exception {
        return registerDao.register(userInfo);
    }

    //注册时判断用户名是否已被使用过
    @Override
    public int findUsernameIsUsed(String account) throws Exception {
        return registerDao.findUsernameIsUsed(account);
    }

    //注册时判断电话号码是否被使用过
    @Override
    public int findPhoneNumIsUsed(String phone) throws Exception {
        return registerDao.findPhoneNumIsUsed(phone);
    }


}
