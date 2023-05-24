package com.example.dema.service.impl;

import com.example.dema.dao.UserDao;
import com.example.dema.entity.Role;
import com.example.dema.entity.UserInfo;
import com.example.dema.service.UserService;

import com.github.pagehelper.PageHelper;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    //登录后台管理系统SpringSecurity一定会调用的方法
    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        UserInfo userI = userDao.findUserByUsername(account);
        if (userI == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        UserDetails userDetails = new User(userI.getAccount(),"{noop}"+userI.getPassword(),getAuthority(userI.getRoles()));
        return userDetails;
    }

    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles){
        List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
        for (Role role : roles){
            list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }
        return list;
    }

    //用户登录旅游网站查询用户名密码是否正确
    @Override
    public UserInfo findUser(String account, String password) throws Exception {
        return userDao.findUser(account,password);
    }

    //根据用户名查询用户
    @Override
    public UserInfo findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    //根据id查询用户
    @Override
    public UserInfo findByUserId(Integer userId) throws Exception {
        return userDao.findByUserId(userId);
    }

    @Override
    public List<Role> findOtherRoles(Integer userId) throws Exception {
        return null;
    }

    @Override
    public void addRoleToUser(Integer userId, Integer[] roleIds) throws Exception {

    }

    @Override
    public int updateUserInfo(Integer userId, String phoneNum, String email) throws Exception {
        return 0;
    }

    @Override
    public int findPhoneNumIsUsed(Integer userId, String phoneNum) throws Exception {
        return 0;
    }

    @Override
    public int findEmailIsUsed(Integer userId, String email) throws Exception {
        return 0;
    }

    @Override
    public List<UserInfo> fuzzyQuery(String userName, String phoneNum, String emial) throws Exception {
        return null;
    }


    //查询全部用户信息
    @Override
    public List<UserInfo> findAllUser(Integer page, Integer size) throws Exception {
        PageHelper.startPage(page,size);
        return userDao.findAllUser();
    }

    @Override
    public int forbidById(Integer id) throws Exception {
        return 0;
    }

    @Override
    public int openById(Integer id) throws Exception {
        return 0;
    }

//    //禁用用户
//    @Override
//    public int forbidById(Integer id) throws Exception {
//        return userDao.forbidById(id);
//    }
//
//    //启用用户
//    @Override
//    public int openById(Integer id) throws Exception {
//        return userInfoDao.openById(id);
//    }
//
//    //查询当前用户没有的角色
//    @Override
//    public List<Role> findOtherRoles(Integer userId) throws Exception {
//        return userInfoDao.findOtherRoles(userId);
//    }
//
//    //为当前用户赋予新角色
//    @Override
//    public void addRoleToUser(Integer userId, Integer[] roleIds) throws Exception {
//        for (Integer roleId : roleIds) {
//            userInfoDao.addRoleToUser(userId,roleId);
//        }
//    }
//
//    //修改用户信息
//    @Override
//    public int updateUserInfo(Integer userId, String phoneNum, String email) throws Exception {
//        return userInfoDao.updateUserInfo(userId,phoneNum,email);
//    }
//
//    //修改用户信息时判断电话号，是否已被使用过
//    @Override
//    public int findPhoneNumIsUsed(Integer userId, String phoneNum) throws Exception {
//        return userInfoDao.findPhoneNumIdUsed(userId,phoneNum);
//    }
//
//    //修改用户信息时判断电子邮箱，是否已被使用过
//    @Override
//    public int findEmailIsUsed(Integer userId, String email) throws Exception {
//        return userInfoDao.findEmailIsUsed(userId,email);
//    }
//
//    //根据传过来的用户名，电话号码，电子邮箱进行模糊查询
//    @Override
//    public List<UserInfo> fuzzyQuery(String userName, String phoneNum, String emial) throws Exception {
//        return userInfoDao.fuzzyQuery(userName,phoneNum,emial);
//    }

}
