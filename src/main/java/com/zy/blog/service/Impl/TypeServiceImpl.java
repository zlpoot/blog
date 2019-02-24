package com.zy.blog.service.Impl;

import com.zy.blog.common.AlertMessage;
import com.zy.blog.common.MsgType;
import com.zy.blog.common.PageModel;
import com.zy.blog.dao.ArticleTypeMapper;
import com.zy.blog.dto.TypeDto;
import com.zy.blog.po.ArticleType;
import com.zy.blog.po.ArticleTypeExample;
import com.zy.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private ArticleTypeMapper articleTypeMapper;

    @Override
    public void saveOrUpdate(TypeDto dto) {
        ArticleType articleType = dto.getArticleType();
        if(StringUtils.isEmpty(articleType.getId())){
            articleTypeMapper.insert(articleType);
            AlertMessage alertMessage = new AlertMessage("新增成功", MsgType.SUCCESS);
            dto.setAlertMessage(alertMessage);
        }else {
            ArticleTypeExample example = new ArticleTypeExample();
            example.createCriteria().andIdEqualTo(articleType.getId());
            articleTypeMapper.updateByExample(articleType,example);
            AlertMessage alertMessage = new AlertMessage("修改成功", MsgType.SUCCESS);
            dto.setAlertMessage(alertMessage);
        }
    }

    @Override
    public void list(TypeDto dto) {
        PageModel pageModel = dto.getPageModel();
        int currentPage = pageModel.getCurrentPage();
        int pageSize = pageModel.getPageSize();
        int startNum = (currentPage-1)*pageSize;
        pageModel.setStartNum(startNum);
        ArticleTypeExample example = new ArticleTypeExample();
        int total = (int) articleTypeMapper.countByExample(example);
        pageModel.setTotal(total);
        List<ArticleType> tableData = articleTypeMapper.list(pageModel);
        pageModel.setTableData(tableData);
        dto.setPageModel(pageModel);
    }

    @Override
    public void delete(TypeDto dto) {
        int id = dto.getId();
        ArticleTypeExample example = new ArticleTypeExample();
        example.createCriteria().andIdEqualTo(id);
        articleTypeMapper.deleteByExample(example);
        AlertMessage alertMessage = new AlertMessage("删除成功", MsgType.SUCCESS);
        dto.setAlertMessage(alertMessage);
    }
}
