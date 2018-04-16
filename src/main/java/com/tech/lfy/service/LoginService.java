package com.tech.lfy.service;

import com.tech.lfy.mapper.LoginMapper;
import com.tech.lfy.model.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


@Service
public class LoginService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private LoginMapper loginMapper;

    public UserEntity getLoginUser(UserEntity user) {
        UserEntity userEntity = null;
        try {
            userEntity = loginMapper.getLoginUser(user);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return userEntity;
    }

    public void registerUser(String userName, String pass) {
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginType("normal");
        userEntity.setPass(pass);
        userEntity.setUserName(userName);
        loginMapper.registerUser(userEntity);
    }

    public boolean checkUserName(String userName) {
       Integer integer = loginMapper.checkUserName(userName);
       if(integer>0)
           return true;
       else
           return false;
    }

    public boolean checkTel(String tel) {
        Integer integer = loginMapper.checkTel(tel);
        if(integer>0)
            return true;
        else
            return false;
    }

    public void registerPhoneNO(String tel, String msgCode) {
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginType("normal");
        userEntity.setPass(tel);
        userEntity.setUserName(msgCode);
        loginMapper.registerPhoneNO(userEntity);
    }
}
