package com.tech.lfy.mapper;

import com.tech.lfy.model.PhoneEntity;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("PhoneMapper")
public interface PhoneMapper {


    void insertPhone(PhoneEntity phoneEntity);

    List<PhoneEntity> getPhones(PhoneEntity phoneEntity);

    Integer getPhoneCount(PhoneEntity phoneEntity);
}
