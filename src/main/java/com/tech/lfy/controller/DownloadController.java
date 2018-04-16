package com.tech.lfy.controller;

import com.tech.lfy.model.DownloadEntity;
import com.tech.lfy.model.EnglishClassEntity;
import com.tech.lfy.service.DownloadService;
import com.tech.lfy.service.EnglishClassService;
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
@RequestMapping("download")
public class DownloadController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DownloadService downloadService;


    /**
     * 下载列表
     * @return
     */
    @RequestMapping(value = "/doDownload", method = RequestMethod.POST)
    @ResponseBody
    public Object doDownload() {
        Map<String, Object> map = new HashMap<>();
        try {
            List<DownloadEntity> download = downloadService.getDownload();
            map.put("code", "0");
            map.put("msg", "OK");
            map.put("data", download);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return map;
    }

}
