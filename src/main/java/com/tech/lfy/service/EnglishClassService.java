package com.tech.lfy.service;

import com.tech.lfy.mapper.EnglishClassMapper;
import com.tech.lfy.model.EnglishClassEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnglishClassService {

    @Resource
    private EnglishClassMapper englishClassMapper;

    public List<EnglishClassEntity> getEnglishClass(EnglishClassEntity englishClassEntity) throws Exception{

        return  englishClassMapper.getEnglishClass(englishClassEntity);
    }
}
