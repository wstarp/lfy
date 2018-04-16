package com.tech.lfy.controller;

import com.tech.lfy.model.TalkEntity;
import com.tech.lfy.service.TalkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("TalkController")
public class TalkController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TalkService talkService;


    /**
     * 学习论坛显示列表
     * @return
     */
    @RequestMapping(value = "/doTalk", method = RequestMethod.POST)
    @ResponseBody
    public Object doTalk() {
        Map<String, Object> map = new HashMap<>();
        try {
            List<TalkEntity> talk = talkService.getTalk();
            map.put("code", "0");
            map.put("msg", "OK");
            map.put("data", talk);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }


    /**
     * 用户学习论坛增加页面
     * @param talkEntity
     * @return
     */
    @RequestMapping(value = "/doAdd", method = RequestMethod.POST)
    @ResponseBody
    public Object doAdd(TalkEntity talkEntity) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "error");
        try {
            talkService.addTalk(talkEntity);
            map.put("code", "0");
            map.put("msg", "OK");
        } catch (Exception e) {
            logger.error(e.getMessage());
            map.put("msg", e.getMessage());
        }
        return map;
    }


    /**
     * 学习论坛查找列表
     * @return
     */
    @RequestMapping(value = "/doFind", method = RequestMethod.POST)
    @ResponseBody
    public Object doFind(String find) {
        Map<String, Object> map = new HashMap<>();
        try {
            List<TalkEntity> talk = talkService.findTalk(find);
            map.put("code", "0");
            map.put("msg", "OK");
            map.put("data", talk);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }

}
