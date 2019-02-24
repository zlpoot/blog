package com.zy.blog.rest;

import com.zy.blog.common.PageModel;
import com.zy.blog.dto.TypeDto;
import com.zy.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zy.blog.po.ArticleType;

@RequestMapping("typeRest")
@RestController
public class TypeRest {

    @Autowired
    private TypeService typeService;

    @RequestMapping("saveOrUpdate")
    public TypeDto saveOrUpdate(ArticleType articleType) {
        TypeDto dto = new TypeDto();
        dto.setArticleType(articleType);
        typeService.saveOrUpdate(dto);
        return dto;
    }

    @RequestMapping("list")
    public PageModel list(PageModel pageModel) {
        TypeDto dto = new TypeDto();
        dto.setPageModel(pageModel);
        typeService.list(dto);
        return dto.getPageModel();
    }

    @RequestMapping("delete")
    public TypeDto delete(int id) {
        TypeDto dto = new TypeDto();
        dto.setId(id);
        typeService.delete(dto);
        return dto;
    }

}
