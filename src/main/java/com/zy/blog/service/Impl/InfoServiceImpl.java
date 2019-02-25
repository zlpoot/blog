package com.zy.blog.service.Impl;

import com.zy.blog.common.AlertMessage;
import com.zy.blog.common.MsgType;
import com.zy.blog.common.PageModel;
import com.zy.blog.dao.ArticleInfoMapper;
import com.zy.blog.dto.InfoDto;
import com.zy.blog.po.ArticleInfo;
import com.zy.blog.po.ArticleInfoExample;
import com.zy.blog.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private ArticleInfoMapper articleInfoMapper;

    @Override
    public void saveOrUpdate(InfoDto dto) {
        ArticleInfo articleInfo = dto.getArticleInfo();
        if(StringUtils.isEmpty(articleInfo.getId())){
            articleInfo.setCreateDate(new Date());
            articleInfo.setUpdateDate(new Date());
            String content = articleInfo.getContent();
            String viewDesc;
            if(content.length() > 80) {
            	viewDesc = content.substring(0, 80);           	
            }else {
            	viewDesc = content.substring(0, content.length());
            }
            viewDesc += "……";
            articleInfo.setViewDesc(viewDesc);
            articleInfo.setViewCount(0);
            articleInfoMapper.insert(articleInfo);
            AlertMessage alertMessage = new AlertMessage("新增成功", MsgType.SUCCESS);
            dto.setAlertMessage(alertMessage);
        }else {
        	String content = articleInfo.getContent();
            String viewDesc;
            if(content.length() > 80) {
            	viewDesc = content.substring(0, 80);           	
            }else {
            	viewDesc = content.substring(0, content.length());
            }
            viewDesc += "……";
            articleInfo.setViewDesc(viewDesc);
            ArticleInfoExample example = new ArticleInfoExample();
            articleInfo.setUpdateDate(new Date());
            example.createCriteria().andIdEqualTo(articleInfo.getId());
            articleInfoMapper.updateByExample(articleInfo,example);
            AlertMessage alertMessage = new AlertMessage("修改成功", MsgType.SUCCESS);
            dto.setAlertMessage(alertMessage);
        }
    }

    @Override
    public void list(InfoDto dto) {
        PageModel pageModel = dto.getPageModel();
        int currentPage = pageModel.getCurrentPage();
        int pageSize = pageModel.getPageSize();
        int startNum = (currentPage-1)*pageSize;
        pageModel.setStartNum(startNum);
        ArticleInfoExample example = new ArticleInfoExample();
        int total = (int) articleInfoMapper.countByExample(example);
        pageModel.setTotal(total);
        List<ArticleInfo> tableData = articleInfoMapper.list(pageModel);
        pageModel.setTableData(tableData);
        dto.setPageModel(pageModel);
    }

    @Override
    public void delete(InfoDto dto) {
        int id = dto.getId();
        ArticleInfoExample example = new ArticleInfoExample();
        example.createCriteria().andIdEqualTo((long) id);
        articleInfoMapper.deleteByExample(example);
        AlertMessage alertMessage = new AlertMessage("删除成功", MsgType.SUCCESS);
        dto.setAlertMessage(alertMessage);
    }
    
}
