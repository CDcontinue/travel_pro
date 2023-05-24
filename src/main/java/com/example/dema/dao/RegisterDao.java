package com.example.dema.dao;

import com.example.dema.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegisterDao {

    //注册
    @Insert("insert into user(account,password,nickname,phone) values(#{account},#{password},#{nickname},#{phone})")
    public abstract int register(UserInfo userInfo) throws Exception;

    //注册时判断用户名是否已被使用过
    @Select("select count(*) from user where account=#{account}")
    public abstract int findUsernameIsUsed(String account) throws Exception;

    //注册时判断电话号码是否被使用过
    @Select("select count(*) from user where account=#{account}")
    public abstract int findPhoneNumIsUsed(String account) throws Exception;

}
