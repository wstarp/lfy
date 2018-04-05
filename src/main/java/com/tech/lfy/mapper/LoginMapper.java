package com.tech.lfy.mapper;

import com.tech.lfy.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component("loginMapper")
public interface LoginMapper {

    UserEntity getLoginUser(Map<String,String> params);

}
