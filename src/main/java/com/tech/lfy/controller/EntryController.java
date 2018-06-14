package com.tech.lfy.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
//@RequestMapping("qd")
public class EntryController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping(value="/user",method= RequestMethod.GET)
    public String dati(){
        try {
            return "user";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(){
        return "index";
    }

}
