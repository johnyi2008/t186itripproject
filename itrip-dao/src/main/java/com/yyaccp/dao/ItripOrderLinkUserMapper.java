package com.yyaccp.dao;

import com.yyaccp.beans.pojo.ItripOrderLinkUser;

public interface ItripOrderLinkUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated
     */
    int insert(ItripOrderLinkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated
     */
    int insertSelective(ItripOrderLinkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated
     */
    ItripOrderLinkUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItripOrderLinkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_order_link_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItripOrderLinkUser record);
}