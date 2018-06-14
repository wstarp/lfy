package com.tech.lfy.service;

import com.tech.lfy.mapper.DownloadMapper;
import com.tech.lfy.mapper.EnglishClassMapper;
import com.tech.lfy.model.DownloadEntity;
import com.tech.lfy.model.EnglishClassEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DownloadService {

    @Resource
    private DownloadMapper downloadMapper;

    public List<DownloadEntity> getDownload(String state) throws Exception{

        return  downloadMapper.getDownload(state);
    }
}
