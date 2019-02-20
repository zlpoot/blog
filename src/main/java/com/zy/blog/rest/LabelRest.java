package com.zy.blog.rest;

import com.zy.blog.common.PageModel;
import com.zy.blog.dto.LabelDto;
import com.zy.blog.service.LabelServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zy.blog.po.ArticleLabel;

import java.awt.*;

@RequestMapping("labelRest")
@RestController
public class LabelRest {

    @Autowired
    private LabelServer labelServer;

    @RequestMapping("saveOrUpdate")
    public LabelDto saveOrUpdate(ArticleLabel articleLabel) {
        LabelDto dto = new LabelDto();
        dto.setArticleLabel(articleLabel);
        labelServer.saveOrUpdate(dto);
        return dto;
    }

    @RequestMapping("list")
    public PageModel list(PageModel pageModel) {
        LabelDto dto = new LabelDto();
        dto.setPageModel(pageModel);
        labelServer.list(dto);
        return dto.getPageModel();
    }

    @RequestMapping("delete")
    public LabelDto delete(int id) {
        LabelDto dto = new LabelDto();
        dto.setId(id);
        labelServer.delete(dto);
        return dto;
    }

}
