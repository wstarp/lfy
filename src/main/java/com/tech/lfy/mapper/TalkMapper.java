package com.tech.lfy.mapper;

import com.tech.lfy.model.DownloadEntity;
import com.tech.lfy.model.TalkEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("TalkMapper")
public interface TalkMapper {
    List<TalkEntity>  getTalk() throws Exception;
    List<TalkEntity>  findTalk(String find) throws Exception;
    void addTalk(TalkEntity talkEntity)throws Exception;
}
