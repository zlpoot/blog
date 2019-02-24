package com.zy.blog.dto;

import com.zy.blog.common.AlertMessage;
import com.zy.blog.common.PageModel;

import java.io.Serializable;

public class CommonDto implements Serializable {
    private static final long serialVersionUID = 2234103214448822086L;
    private int id;
    private PageModel pageModel;
    private AlertMessage alertMessage;

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

    public AlertMessage getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(AlertMessage alertMessage) {
        this.alertMessage = alertMessage;
    }
}
