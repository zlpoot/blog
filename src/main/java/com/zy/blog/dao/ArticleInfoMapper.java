package com.zy.blog.dao;

import com.zy.blog.po.ArticleInfo;
import com.zy.blog.po.ArticleInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleInfoMapper {
    long countByExample(ArticleInfoExample example);

    int deleteByExample(ArticleInfoExample example);

    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    List<ArticleInfo> selectByExampleWithBLOBs(ArticleInfoExample example);

    List<ArticleInfo> selectByExample(ArticleInfoExample example);

    int updateByExampleSelective(@Param("record") ArticleInfo record, @Param("example") ArticleInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleInfo record, @Param("example") ArticleInfoExample example);

    int updateByExample(@Param("record") ArticleInfo record, @Param("example") ArticleInfoExample example);
}