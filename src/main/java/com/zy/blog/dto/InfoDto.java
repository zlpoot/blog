package com.zy.blog.dto;

import com.zy.blog.po.ArticleInfo;

public class InfoDto extends CommonDto {
    private ArticleInfo articleInfo;

    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(ArticleInfo articleInfo) {
        this.articleInfo = articleInfo;
    }
}
