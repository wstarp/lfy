package com.tech.lfy.service;

import com.tech.lfy.mapper.TalkMapper;
import com.tech.lfy.model.TalkEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TalkService {

    @Resource
    private TalkMapper talkMapper;

    public List<TalkEntity> getTalk() throws Exception{
        return  talkMapper.getTalk();
    }

    public List<TalkEntity> findTalk(String find) throws Exception{
        return  talkMapper.findTalk(find);
    }

    public void addTalk(TalkEntity talkEntity)throws Exception{
        talkMapper.addTalk(talkEntity);
    }
}
