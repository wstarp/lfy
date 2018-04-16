package com.tech.lfy.mapper;

import com.tech.lfy.model.UserEntity;
import org.springframework.stereotype.Component;



@Component("loginMapper")
public interface LoginMapper {

    UserEntity getLoginUser(UserEntity user);

    void registerUser(UserEntity userEntity);

    Integer checkUserName(String userName);

    Integer checkTel(String tel);

    void registerPhoneNO(UserEntity userEntity);
}
