package com.tech.lfy.controller;

import com.tech.lfy.model.EnglishArticleEntity;
import com.tech.lfy.model.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tech.lfy.service.EnglishArticleService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("EnglishArticleController")
public class EnglishArticleController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnglishArticleService englishArticleService;

    @RequestMapping(value = "/toEnglishArticle", method = RequestMethod.GET)
    public String toEnglishArticlePage() {
        try {
            return "EnglishArticle";
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "/doEnglishArticle", method = RequestMethod.POST)
    @ResponseBody
    public Object doEnglishArticlettr(String state) {
        Map<String, Object> map = new HashMap<>();
        try {
            EnglishArticleEntity englishArticleEntity = englishArticleService.getEnglishArticle(state);
            map.put("code", "0");
            map.put("msg", "OK");
            map.put("data", englishArticleEntity);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }

}
