package com.yyaccp.dao;

import com.yyaccp.beans.pojo.ItripImage;

public interface ItripImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_image
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_image
     *
     * @mbggenerated
     */
    int insert(ItripImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_image
     *
     * @mbggenerated
     */
    int insertSelective(ItripImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_image
     *
     * @mbggenerated
     */
    ItripImage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_image
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItripImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_image
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItripImage record);
}