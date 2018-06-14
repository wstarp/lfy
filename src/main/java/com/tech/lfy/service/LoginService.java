package com.tech.lfy.service;

import com.tech.lfy.mapper.LoginMapper;
import com.tech.lfy.model.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService {


    @Resource
    private LoginMapper loginMapper;

    public UserEntity getLoginUser(UserEntity user) throws  Exception {
        return loginMapper.getLoginUser(user);
    }

    public void registerUser(String userName, String pass,String tel)  throws  Exception{
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginType("normal");
        userEntity.setPass(pass);
        userEntity.setTel(tel);
        userEntity.setUserName(userName);
        loginMapper.registerUser(userEntity);
    }

    public boolean checkUserName(String userName) throws  Exception {
       Integer integer = loginMapper.checkUserName(userName);
       if(integer>0)
           return true;
       else
           return false;
    }

    public boolean checkTel(String tel) throws  Exception {
        Integer integer = loginMapper.checkTel(tel);
        if(integer>0)
            return true;
        else
            return false;
    }

    public void registerPhoneNO(String tel, String msgCode)  throws  Exception{
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginType("codeAuth");
        userEntity.setTel(tel);
        userEntity.setMsgCode(msgCode);
        loginMapper.registerPhoneNO(userEntity);
    }

    public List<UserEntity> getUserList() throws Exception{
        return loginMapper.getUserList();
    }

    public void updateUser(UserEntity user) throws Exception{
        loginMapper.updateUser(user);
    }

    public void delete(String id)  throws Exception{
        loginMapper.delete(id);
    }
}
