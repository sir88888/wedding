package com.wedding.seller.mapper;

import com.wedding.seller.pojo.Shop;
import com.wedding.seller.pojo.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int countByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int deleteByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    Shop selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_shop
     *
     * @mbggenerated Tue Dec 16 14:31:00 CST 2014
     */
    int updateByPrimaryKey(Shop record);
}