package com.tech.lfy.mapper;

import com.tech.lfy.model.EnglishClassEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("EnglishClassMapper")
public interface EnglishClassMapper {
    List<EnglishClassEntity>  getEnglishClass(EnglishClassEntity englishClassEntity) throws Exception;
}
