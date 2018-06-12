package com.tech.lfy.mapper;

import com.tech.lfy.model.EnglishTestEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("EnglishTestMapper")
public interface EnglishTestMapper {
    List<EnglishTestEntity> getEnglishTest(String test) throws Exception;

    List<EnglishTestEntity> getEnglishTestByTestkey(String testkey) throws  Exception;
}
