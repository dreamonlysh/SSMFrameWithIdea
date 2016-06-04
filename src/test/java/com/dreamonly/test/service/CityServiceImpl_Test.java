package com.dreamonly.test.service;

import com.alibaba.fastjson.JSON;
import com.dreamonly.db.model.City;
import com.dreamonly.service.impl.CityServiceImpl;
import com.dreamonly.service.itf.ICityService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(
        locations = {"classpath:config/spring/applicationContext-service.xml",
                "classpath:config/spring/applicationContext-dao.xml"})

public class CityServiceImpl_Test {
    private static Logger logger = Logger.getLogger(CityServiceImpl_Test.class);

    @Resource
    private ICityService userService = null;

    @Test
    public void testGetCityById() {
        City oneCity = userService.getCityById(10);
        logger.info(JSON.toJSONString(oneCity));
        org.junit.Assert.assertEquals(oneCity.getName(), "Tilburg");
    }

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }
}
