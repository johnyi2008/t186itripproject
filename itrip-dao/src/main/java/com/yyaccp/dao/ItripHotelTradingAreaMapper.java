package com.yyaccp.dao;

import com.yyaccp.beans.pojo.ItripHotelTradingArea;

public interface ItripHotelTradingAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_trading_area
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_trading_area
     *
     * @mbggenerated
     */
    int insert(ItripHotelTradingArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_trading_area
     *
     * @mbggenerated
     */
    int insertSelective(ItripHotelTradingArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_trading_area
     *
     * @mbggenerated
     */
    ItripHotelTradingArea selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_trading_area
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItripHotelTradingArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_trading_area
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItripHotelTradingArea record);
}