package com.tech.lfy.service;

import com.tech.lfy.mapper.EnglishWordMapper;
import com.tech.lfy.model.EnglishWordEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnglishWordService {

    @Resource
    private EnglishWordMapper englishWordMapper;

    public List<EnglishWordEntity> getEnglishWord(String word) throws Exception{
        return englishWordMapper.getEnglishWord(word);
    }

    public List<EnglishWordEntity> getEnglishWordByState(String state) throws Exception {
        return englishWordMapper.getEnglishWordByState(state);
    }
}
