package com.tech.lfy.controller;


import com.tech.lfy.model.PhoneEntity;
import com.tech.lfy.service.PhoneService;
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
@RequestMapping("qd")
public class EntryController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PhoneService phoneService;

    @RequestMapping(value="/phone",method= RequestMethod.GET)
    public String toEntryPage(){
        try {
            return "phone";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value="/dati",method= RequestMethod.GET)
    public String dati(){
        try {
            return "dt";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }


    @RequestMapping(value="/showphone",method= RequestMethod.GET)
    public String showphone(){
        try {
            return "showPhone";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }


    @RequestMapping(value="/doPhone",method= RequestMethod.POST)
    @ResponseBody
    public  Map<String,Object>  doEntry(PhoneEntity phoneEntity){
        Map<String,Object> map = new HashMap<>();
        try {
            logger.info(phoneEntity.getUserName());
            logger.info(phoneEntity.getIdentity());
            logger.info(phoneEntity.getPhoneNO());
            if(phoneService.getPhones(phoneEntity).size()>0){
                map.put("code","1");
                return map;
            }
            phoneService.insertPhone(phoneEntity);
            map.put("code","0");
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }
    @RequestMapping(value="/getPhones",method= RequestMethod.GET)
    @ResponseBody
    public  Map<String,Object>  getPhone(){
        Map<String,Object> map = new HashMap<>();
        try {
            PhoneEntity phoneEntity = new PhoneEntity();
            map.put("code","0");
            map.put("msg",phoneService.getPhones(phoneEntity));
            map.put("count",phoneService.getPhoneCount(phoneEntity));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }
}
