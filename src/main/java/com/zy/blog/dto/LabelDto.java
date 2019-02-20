package com.zy.blog.dto;

import com.zy.blog.common.AlertMessage;
import com.zy.blog.common.PageModel;
import com.zy.blog.po.ArticleLabel;

public class LabelDto {
    private ArticleLabel articleLabel;
    private int id;
    private PageModel pageModel;
    private AlertMessage alertMessage;

    public AlertMessage getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(AlertMessage alertMessage) {
        this.alertMessage = alertMessage;
    }

    public ArticleLabel getArticleLabel() {
        return articleLabel;
    }

    public void setArticleLabel(ArticleLabel articleLabel) {
        this.articleLabel = articleLabel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }
}
