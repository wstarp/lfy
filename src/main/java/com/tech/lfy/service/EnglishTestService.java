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

    public List<String> getEnglishTest(String test) throws Exception{
        return englishTestMapper.getEnglishTest(test);
    }

    public List<EnglishTestEntity> getEnglishTestByTestid(String testid) throws Exception {
        return englishTestMapper.getEnglishTestByTestid(testid);
    }
}
