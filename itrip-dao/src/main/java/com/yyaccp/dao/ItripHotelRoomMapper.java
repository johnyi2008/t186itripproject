package com.yyaccp.dao;

import com.yyaccp.beans.pojo.ItripHotelRoom;

public interface ItripHotelRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_room
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_room
     *
     * @mbggenerated
     */
    int insert(ItripHotelRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_room
     *
     * @mbggenerated
     */
    int insertSelective(ItripHotelRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_room
     *
     * @mbggenerated
     */
    ItripHotelRoom selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_room
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItripHotelRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_room
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItripHotelRoom record);
}