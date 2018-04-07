package com.tech.lfy.mapper;

import com.tech.lfy.model.EnglishWordEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("EnglishWordMapper")
public interface EnglishWordMapper {
EnglishWordEntity getEnglishWord(String word);
}
