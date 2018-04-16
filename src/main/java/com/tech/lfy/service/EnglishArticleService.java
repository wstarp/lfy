package com.tech.lfy.service;

import com.tech.lfy.mapper.EnglishArticleMapper;
import com.tech.lfy.model.EnglishArticleEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnglishArticleService {

    @Resource
    private EnglishArticleMapper englishArticleMapper;
//article,state
    public List<EnglishArticleEntity> getEnglishArticle(String state) throws Exception{

        return  englishArticleMapper.getEnglishArticle(state);
    }
}
