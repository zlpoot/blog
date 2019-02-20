package com.zy.blog.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zy.blog.po.ArticleLabel;

@RequestMapping("lableRest")
@RestController
public class LableRest {

    @RequestMapping("saveOrUpdate")
    public void SaveOrUpdate(ArticleLabel articleLabel) {
        System.out.println(articleLabel.getName());
    }

}
