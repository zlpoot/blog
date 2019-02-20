package com.zy.blog.dto;

import com.zy.blog.po.ArticleLabel;

public class LabelDto extends CommonDto {
    private ArticleLabel articleLabel;

    public ArticleLabel getArticleLabel() {
        return articleLabel;
    }

    public void setArticleLabel(ArticleLabel articleLabel) {
        this.articleLabel = articleLabel;
    }
}
