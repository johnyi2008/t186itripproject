package com.yyaccp.biz.service;

import com.yyaccp.beans.vo.StoreVo;
import com.yyaccp.dao.ItripHotelTempStoreMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ItripHotelTempStoreServiceImpl implements ItripHotelTempStoreService {
    @Resource
    private ItripHotelTempStoreMapper itripHotelTempStoreMapper;

    /**
     *
     * @param map
     * startTime
     * endTime
     * hotelId
     * roomId
     * count
     * @return
     */
    @Override
    public boolean validateRoomStore(Map map) {
        //调用存储过程刷新实时库存
        itripHotelTempStoreMapper.flushStore(map);
        //获取实时库存的列表
        List<StoreVo> list = itripHotelTempStoreMapper.queryRoomStore(map);
        Integer count = (Integer) map.get("count");
        for (StoreVo vo : list) {
            if(vo.getStore()<count) {
                return false;
            }
        }
        return true;
    }
}
