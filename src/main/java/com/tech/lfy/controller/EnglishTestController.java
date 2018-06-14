package com.tech.lfy.controller;

import com.tech.lfy.model.EnglishTestEntity;
import com.tech.lfy.service.EnglishTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("EnglishTest")
public class EnglishTestController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnglishTestService englishTestService;

    /**
     * 英语题目查询列表
     * @return
     */
    @RequestMapping(value="/doEnglishTest",method= RequestMethod.POST)
    @ResponseBody
    public Object doEnglishTest(String selectType){
        Map<String,Object> map = new HashMap<>();
        try {
            List<String> englishTestEntity = englishTestService.getEnglishTest(selectType);
            map.put("code","0");
            map.put("msg","OK");
            map.put("data",englishTestEntity);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }



    /**
     * 英语题目查询
     * @param testid
     * @return
     */
    @RequestMapping(value="/doTestKey",method= RequestMethod.POST)
    @ResponseBody
    public Object getEnglishTestByTestkey(String testid){
        Map<String,Object> map = new HashMap<>();
        try {
//            if(StringUtils.isEmpty(testkey)){
//                Random random = new Random();
//                testkey = (random.nextInt(3)+1)+"";
//            }
            List<EnglishTestEntity> englishTestEntity = englishTestService.getEnglishTestByTestid(testid);
            map.put("code","0");
            map.put("msg","OK");
            map.put("data",englishTestEntity);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return map;
    }
}
