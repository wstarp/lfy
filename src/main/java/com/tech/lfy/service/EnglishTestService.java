package com.tech.lfy.service;

import com.tech.lfy.mapper.EnglishTestMapper;
import com.tech.lfy.model.EnglishTestEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnglishTestService {

    @Resource
    private EnglishTestMapper englishTestMapper;

    public List<EnglishTestEntity> getEnglishTest(String test) throws Exception{
        return englishTestMapper.getEnglishTest(test);
    }

    public List<EnglishTestEntity> getEnglishTestByTestkey(String testkey) throws Exception {
        return englishTestMapper.getEnglishTestByTestkey(testkey);
    }
}
