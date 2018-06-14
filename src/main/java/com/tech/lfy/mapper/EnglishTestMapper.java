package com.tech.lfy.mapper;

import com.tech.lfy.model.EnglishTestEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("EnglishTestMapper")
public interface EnglishTestMapper {
    List<String> getEnglishTest(String test) throws Exception;

    List<EnglishTestEntity> getEnglishTestByTestid(String testid) throws  Exception;
}
