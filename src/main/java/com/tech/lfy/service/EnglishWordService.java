package com.tech.lfy.service;

import com.tech.lfy.mapper.EnglishWordMapper;
import com.tech.lfy.model.EnglishWordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EnglishWordService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private EnglishWordMapper englishWordMapper;

    public EnglishWordEntity getEnglishWord(String word) {
        EnglishWordEntity englishWordEntity = null;
        try {
            englishWordEntity = englishWordMapper.getEnglishWord(word);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return englishWordEntity;
    }

}
