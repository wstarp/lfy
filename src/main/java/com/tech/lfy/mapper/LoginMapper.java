package com.tech.lfy.mapper;

import com.tech.lfy.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("loginMapper")
public interface LoginMapper {

    UserEntity getLoginUser(UserEntity user)throws  Exception;

    void registerUser(UserEntity userEntity)throws  Exception;

    Integer checkUserName(String userName)throws  Exception;

    Integer checkTel(String tel)throws  Exception;

    void registerPhoneNO(UserEntity userEntity)throws  Exception;

    List<UserEntity> getUserList()throws  Exception;

    void updateUser(UserEntity user)throws  Exception;

    void delete(String id)throws  Exception;
}
