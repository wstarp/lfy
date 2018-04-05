package com.tech.lfy.service;

import com.tech.lfy.mapper.PhoneMapper;
import com.tech.lfy.model.PhoneEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class PhoneService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private PhoneMapper phoneMapper;



    public void insertPhone(PhoneEntity phoneEntity) {
        phoneMapper.insertPhone(phoneEntity);
    }

    public List<PhoneEntity> getPhones(PhoneEntity phoneEntity) {
        return phoneMapper.getPhones(phoneEntity);
    }

    public Object getPhoneCount(PhoneEntity phoneEntity) {
        return phoneMapper.getPhoneCount(phoneEntity);
    }
}
