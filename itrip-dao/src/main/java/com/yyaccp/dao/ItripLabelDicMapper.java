package com.yyaccp.dao;

import com.yyaccp.beans.pojo.ItripLabelDic;

public interface ItripLabelDicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_label_dic
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_label_dic
     *
     * @mbggenerated
     */
    int insert(ItripLabelDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_label_dic
     *
     * @mbggenerated
     */
    int insertSelective(ItripLabelDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_label_dic
     *
     * @mbggenerated
     */
    ItripLabelDic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_label_dic
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ItripLabelDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table itrip_label_dic
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ItripLabelDic record);
}