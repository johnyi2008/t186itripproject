package com.yyaccp.dao;

import com.yyaccp.beans.pojo.ItripTradeEnds;

public interface ItripTradeEndsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated
     */
    int insert(ItripTradeEnds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated
     */
    int insertSelective(ItripTradeEnds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated
     */
    ItripTradeEnds selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItripTradeEnds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_trade_ends
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItripTradeEnds record);
}