package com.wedding.tools.mapper;

import com.wedding.tools.pojo.AddressesView;
import com.wedding.tools.pojo.AddressesViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressesViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_addresses_view
     *
     * @mbggenerated Fri Oct 10 14:42:56 CST 2014
     */
    int countByExample(AddressesViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_addresses_view
     *
     * @mbggenerated Fri Oct 10 14:42:56 CST 2014
     */
    int deleteByExample(AddressesViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_addresses_view
     *
     * @mbggenerated Fri Oct 10 14:42:56 CST 2014
     */
    int insert(AddressesView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_addresses_view
     *
     * @mbggenerated Fri Oct 10 14:42:56 CST 2014
     */
    int insertSelective(AddressesView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_addresses_view
     *
     * @mbggenerated Fri Oct 10 14:42:56 CST 2014
     */
    List<AddressesView> selectByExample(AddressesViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_addresses_view
     *
     * @mbggenerated Fri Oct 10 14:42:56 CST 2014
     */
    int updateByExampleSelective(@Param("record") AddressesView record, @Param("example") AddressesViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_addresses_view
     *
     * @mbggenerated Fri Oct 10 14:42:56 CST 2014
     */
    int updateByExample(@Param("record") AddressesView record, @Param("example") AddressesViewExample example);
}