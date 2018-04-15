package com.tech.lfy.controller;

import com.tech.lfy.model.UserEntity;
import com.tech.lfy.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("login")
public class LoginController {

       protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/toLogin",method= RequestMethod.GET)
    public String toLoginPage(){
        try {
            return "login";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value="/doLogin",method= RequestMethod.POST)
    @ResponseBody
    public Object doLogin(String userName,String password){
        Map<String,Object> map = new HashMap<>();
        try {
            UserEntity userEntity = loginService.getLoginUser(userName,password);
            map.put("code","0");
            map.put("msg","OK");
            map.put("data",userEntity);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }
}
