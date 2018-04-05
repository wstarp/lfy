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

    public UserEntity getLoginUser(String userName, String password) {
        UserEntity userEntity = null;
        try {
            Map<String,String> params = new HashMap<>();
            params.put("userName",userName);
            params.put("password",password);
            userEntity = loginMapper.getLoginUser(params);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return userEntity;
    }
}
