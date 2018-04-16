package com.tech.lfy.mapper;

import com.tech.lfy.model.EnglishWordEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("EnglishWordMapper")
public interface EnglishWordMapper {
    List<EnglishWordEntity> getEnglishWord(String word) throws Exception;

    List<EnglishWordEntity> getEnglishWordByState(String state) throws  Exception;
}
