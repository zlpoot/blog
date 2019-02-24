package com.zy.blog.rest;

import com.zy.blog.common.PageModel;
import com.zy.blog.dto.InfoDto;
import com.zy.blog.po.ArticleInfo;
import com.zy.blog.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("infoRest")
@RestController
public class InfoRest {

    @Autowired
    private InfoService infoService;

    @RequestMapping("saveOrUpdate")
    public InfoDto saveOrUpdate(ArticleInfo articleInfo) {
        InfoDto dto = new InfoDto();
        dto.setArticleInfo(articleInfo);
        infoService.saveOrUpdate(dto);
        return dto;
    }

    @RequestMapping("list")
    public PageModel list(PageModel pageModel) {
        InfoDto dto = new InfoDto();
        dto.setPageModel(pageModel);
        infoService.list(dto);
        return dto.getPageModel();
    }

    @RequestMapping("delete")
    public InfoDto delete(int id) {
        InfoDto dto = new InfoDto();
        dto.setId(id);
        infoService.delete(dto);
        return dto;
    }
    
}
