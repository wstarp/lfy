package com.tech.lfy.mapper;

import com.tech.lfy.model.DownloadEntity;
import com.tech.lfy.model.EnglishClassEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("DownloadMapper")
public interface DownloadMapper {
    List<DownloadEntity>  getDownload(String state) throws Exception;
}
