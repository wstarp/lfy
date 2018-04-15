package com.tech.lfy.service;

import com.tech.lfy.mapper.EnglishArticleMapper;
import com.tech.lfy.model.EnglishArticleEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class EnglishArticleService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private EnglishArticleMapper englishArticleMapper;
//article,state
    public EnglishArticleEntity getEnglishArticle(String state) {
        EnglishArticleEntity englishArticleEntity = null;
        try {

            englishArticleEntity = englishArticleMapper.getEnglishArticle(state);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return englishArticleEntity;
    }
}
