package com.zy.blog.dto;

import com.zy.blog.po.ArticleType;

public class TypeDto extends CommonDto {
    private ArticleType articleType;

    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }
}
