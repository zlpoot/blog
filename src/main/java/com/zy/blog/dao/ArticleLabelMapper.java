package com.zy.blog.dao;

import com.zy.blog.common.PageModel;
import com.zy.blog.po.ArticleLabel;
import com.zy.blog.po.ArticleLabelExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleLabelMapper {
    long countByExample(ArticleLabelExample example);

    int deleteByExample(ArticleLabelExample example);

    int insert(ArticleLabel record);

    int insertSelective(ArticleLabel record);

    List<ArticleLabel> selectByExample(ArticleLabelExample example);

    int updateByExampleSelective(@Param("record") ArticleLabel record, @Param("example") ArticleLabelExample example);

    int updateByExample(@Param("record") ArticleLabel record, @Param("example") ArticleLabelExample example);

    List<ArticleLabel> list(PageModel pageModel);
}