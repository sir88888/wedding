package com.wedding.user.mapper;

import com.wedding.user.pojo.UserEvaluate;
import com.wedding.user.pojo.UserEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEvaluateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int countByExample(UserEvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int deleteByExample(UserEvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int insert(UserEvaluate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int insertSelective(UserEvaluate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    List<UserEvaluate> selectByExample(UserEvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    UserEvaluate selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int updateByExampleSelective(@Param("record") UserEvaluate record, @Param("example") UserEvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int updateByExample(@Param("record") UserEvaluate record, @Param("example") UserEvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int updateByPrimaryKeySelective(UserEvaluate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_user_evaluate
     *
     * @mbggenerated Sun Oct 05 21:08:33 CST 2014
     */
    int updateByPrimaryKey(UserEvaluate record);
}