package com.tech.lfy.mapper;

import com.tech.lfy.model.EnglishArticleEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component("EnglishArticleMapper")
public interface EnglishArticleMapper {
    List<EnglishArticleEntity>  getEnglishArticle(String state) throws Exception;
}
