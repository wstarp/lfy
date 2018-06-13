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
//@RequestMapping("login")
public class LoginController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginService loginService;

    /**
     * 跳转到登录页
     * @return
     */
    @RequestMapping(value = "login/toLogin", method = RequestMethod.GET)
    public String toLoginPage() {
        try {
            return "englishTest";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     *  注册
     * @param user
     * @return
     */
    @RequestMapping(value = "regist/doRegist", method = RequestMethod.POST)
    @ResponseBody
    public Object register(UserEntity user) {
        /**
         登录方式normal为用户名密码，codeAuth为短信验证码方式
         **/
        Map<String, Object> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "注册信息不能为空");
        try {
            if (user != null)
                if (!"".equals(user.getUserName())) {
                    if (loginService.checkUserName(user.getUserName())) {
                        map.put("code", "-1");
                        map.put("msg", "用户名重复");
                        return map;
                    }
                }
            if ("normal".equals(user.getLoginType())) {
                loginService.registerUser(user.getUserName(), user.getPass());
                map.put("code", "0");
                map.put("msg", "OK");

            } else if ("codeAuth".equals(user.getLoginType())) {
                loginService.registerPhoneNO(user.getTel(), user.getMsgCode());

                map.put("code", "0");
                map.put("msg", "OK");

            }

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @RequestMapping(value = "login/dologin", method = RequestMethod.POST)
    @ResponseBody
    public Object doLogin(UserEntity user) {
        /**
         登录方式normal为用户名密码，codeAuth为短信验证码方式
         **/
        Map<String, Object> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "登录信息不能为空");
        try {
            if (user != null)
                if ("normal".equals(user.getLoginType())) {
                    UserEntity userEntity = loginService.getLoginUser(user);
                    if (userEntity != null) {
                        map.put("code", "0");
                        map.put("msg", "OK");
                    } else {
                        map.put("code", "-1");
                        map.put("msg", "用户名或密码错误");
                    }
                } else if ("codeAuth".equals(user.getLoginType())) {
                    UserEntity userEntity = loginService.getLoginUser(user);
                    if (userEntity != null) {
                        map.put("code", "0");
                        map.put("msg", "OK");
                    } else {
                        map.put("code", "-1");
                        map.put("msg", "手机验证码错误");
                    }
                }

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }


    /**
     * 校验手机是否注册过
     * @param tel
     * @return
     */
    @RequestMapping(value = "regist/verifyTelRegisted", method = RequestMethod.POST)
    @ResponseBody
    public Object verifyTelRegisted(String tel) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "手机号不能为空");
        try {
            if (!"".equals(tel)) {
                if (loginService.checkTel(tel)) {
                    map.put("code", "-1");
                    map.put("msg", "手机号已注册");
                    return map;
                }else {
                    map.put("code", "0");
                    map.put("msg", "OK");
                    map.put("hasRegisted", true);
                    return map;
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }
}
