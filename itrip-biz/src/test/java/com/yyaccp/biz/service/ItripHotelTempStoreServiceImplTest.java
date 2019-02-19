package com.yyaccp.biz.service;

import com.yyaccp.common.DateUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ItripHotelTempStoreServiceImplTest {
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    private ItripHotelTempStoreService itripHotelTempStoreService;
    @Before
    public void before() {
        itripHotelTempStoreService = (ItripHotelTempStoreService) ctx.getBean("itripHotelTempStoreServiceImpl");
    }

    @Test
    public void validateRoomStore() {
        Map<String,Object> map = new HashMap<>();
        map.put("startTime", DateUtils.parseDate("2019-02-15","yyyy-MM-dd"));
        map.put("endTime", DateUtils.parseDate("2019-02-20","yyyy-MM-dd"));
        map.put("hotelId", 1);
        map.put("roomId", 1);
        map.put("count",6);
        boolean ret = itripHotelTempStoreService.validateRoomStore(map);
        Assert.assertFalse(ret);
        map.put("startTime", DateUtils.parseDate("2019-02-17","yyyy-MM-dd"));
        ret = itripHotelTempStoreService.validateRoomStore(map);
        Assert.assertTrue(ret);
    }
}