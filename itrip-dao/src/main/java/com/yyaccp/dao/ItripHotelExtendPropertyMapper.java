package com.yyaccp.dao;

import com.yyaccp.beans.pojo.ItripHotelExtendProperty;

public interface ItripHotelExtendPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated
     */
    int insert(ItripHotelExtendProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated
     */
    int insertSelective(ItripHotelExtendProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated
     */
    ItripHotelExtendProperty selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItripHotelExtendProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_hotel_extend_property
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItripHotelExtendProperty record);
}