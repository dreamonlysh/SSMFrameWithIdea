package com.dreamonly.service.impl;

import com.dreamonly.db.dao.CityMapper;
import com.dreamonly.db.model.City;
import com.dreamonly.service.itf.ICityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dream on 04/27/16.
 */
@Service("userService")
public class CityServiceImpl implements ICityService {
    @Resource
    private CityMapper cityMapper;

    public City getCityById(int cityId) {
        return this.cityMapper.selectByPrimaryKey(cityId);
    }
}
