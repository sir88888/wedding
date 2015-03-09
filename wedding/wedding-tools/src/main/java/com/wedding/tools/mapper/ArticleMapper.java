package com.wedding.tools.mapper;

import com.wedding.tools.pojo.Article;
import com.wedding.tools.pojo.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int countByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int deleteByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int insertSelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    List<Article> selectByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    Article selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_article
     *
     * @mbggenerated Fri Sep 26 13:50:20 CST 2014
     */
    int updateByPrimaryKey(Article record);
}