package com.tech.lfy.controller;

import com.tech.lfy.model.EnglishArticleEntity;
import com.tech.lfy.model.EnglishClassEntity;
import com.tech.lfy.service.EnglishArticleService;
import com.tech.lfy.service.EnglishClassService;
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
@RequestMapping("EnglishClassController")
public class EnglishClassController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnglishClassService englishClassService;

    /**
     * 跳转课程分类
     * @return
     */
    @RequestMapping(value = "/toEnglishClass", method = RequestMethod.GET)
    public String toEnglishClass() {
        try {
            return "EnglishClass";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     * 课程分类（阅读+听力）
     * @return
     */
    @RequestMapping(value = "/doEnglishClass", method = RequestMethod.POST)
    @ResponseBody
    public Object doEnglishClass(EnglishClassEntity englishClassEntity) {
        Map<String, Object> map = new HashMap<>();
        try {
            List<EnglishClassEntity> englishArticleEntity = englishClassService.getEnglishClass(englishClassEntity);
            map.put("code", "0");
            map.put("msg", "OK");
            map.put("data", englishArticleEntity);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }

}
