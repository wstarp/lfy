package com.tech.lfy.controller;

import com.tech.lfy.model.EnglishWordEntity;
import com.tech.lfy.service.EnglishWordService;
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
@RequestMapping("EnglishWord")
public class EnglishWordController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnglishWordService englishWordService;



    @RequestMapping(value="/doEnglishWord",method= RequestMethod.POST)
    @ResponseBody
    public Object doEnglishWord(String word){
        Map<String,Object> map = new HashMap<>();
        try {
            EnglishWordEntity englishWordEntity = englishWordService.getEnglishWord(word);
            map.put("code","0");
            map.put("msg","OK");
            map.put("data",englishWordEntity);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }

}
