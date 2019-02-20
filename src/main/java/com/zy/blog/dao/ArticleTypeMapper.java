package com.zy.blog.dao;

import com.zy.blog.po.ArticleType;
import com.zy.blog.po.ArticleTypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ArticleTypeMapper {
    long countByExample(ArticleTypeExample example);

    int deleteByExample(ArticleTypeExample example);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    List<ArticleType> selectByExample(ArticleTypeExample example);

    int updateByExampleSelective(@Param("record") ArticleType record, @Param("example") ArticleTypeExample example);

    int updateByExample(@Param("record") ArticleType record, @Param("example") ArticleTypeExample example);
}