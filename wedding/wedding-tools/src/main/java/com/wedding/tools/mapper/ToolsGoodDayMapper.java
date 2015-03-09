package com.wedding.tools.mapper;

import com.wedding.tools.pojo.ToolsGoodDay;
import com.wedding.tools.pojo.ToolsGoodDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolsGoodDayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int countByExample(ToolsGoodDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int deleteByExample(ToolsGoodDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int insert(ToolsGoodDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int insertSelective(ToolsGoodDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    List<ToolsGoodDay> selectByExample(ToolsGoodDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    ToolsGoodDay selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByExampleSelective(@Param("record") ToolsGoodDay record, @Param("example") ToolsGoodDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByExample(@Param("record") ToolsGoodDay record, @Param("example") ToolsGoodDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByPrimaryKeySelective(ToolsGoodDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_tools_good_day
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByPrimaryKey(ToolsGoodDay record);
}