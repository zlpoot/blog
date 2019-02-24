package com.zy.blog.service.Impl;

import com.zy.blog.common.AlertMessage;
import com.zy.blog.common.MsgType;
import com.zy.blog.common.PageModel;
import com.zy.blog.dao.ArticleLabelMapper;
import com.zy.blog.dto.LabelDto;
import com.zy.blog.po.ArticleLabel;
import com.zy.blog.po.ArticleLabelExample;
import com.zy.blog.service.LabelServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelServer {

    @Autowired
    private ArticleLabelMapper articleLabelMapper;

    @Override
    public void saveOrUpdate(LabelDto dto) {
        ArticleLabel articleLabel = dto.getArticleLabel();
        if(StringUtils.isEmpty(articleLabel.getId())){
            articleLabelMapper.insert(articleLabel);
            AlertMessage alertMessage = new AlertMessage("新增成功", MsgType.SUCCESS);
            dto.setAlertMessage(alertMessage);
        }else {
            ArticleLabelExample example = new ArticleLabelExample();
            example.createCriteria().andIdEqualTo(articleLabel.getId());
            articleLabelMapper.updateByExample(articleLabel,example);
            AlertMessage alertMessage = new AlertMessage("修改成功", MsgType.SUCCESS);
            dto.setAlertMessage(alertMessage);
        }
    }

    @Override
    public void list(LabelDto dto) {
        PageModel pageModel = dto.getPageModel();
        int currentPage = pageModel.getCurrentPage();
        int pageSize = pageModel.getPageSize();
        int startNum = (currentPage-1)*pageSize;
        pageModel.setStartNum(startNum);
        ArticleLabelExample example = new ArticleLabelExample();
        int total = (int) articleLabelMapper.countByExample(example);
        pageModel.setTotal(total);
        List<ArticleLabel> tableData = articleLabelMapper.list(pageModel);
        pageModel.setTableData(tableData);
        dto.setPageModel(pageModel);
    }

    @Override
    public void delete(LabelDto dto) {
        int id = dto.getId();
        ArticleLabelExample example = new ArticleLabelExample();
        example.createCriteria().andIdEqualTo(id);
        articleLabelMapper.deleteByExample(example);
        AlertMessage alertMessage = new AlertMessage("删除成功", MsgType.SUCCESS);
        dto.setAlertMessage(alertMessage);
    }
}
