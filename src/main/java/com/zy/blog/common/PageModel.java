package com.zy.blog.common;

import java.util.List;

public class PageModel {
    private int currentPage;
    private int total;
    private int pageSize;
    private int startNum;

    private List<?> tableData;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<?> getTableData() {
        return tableData;
    }

    public void setTableData(List<?> tableData) {
        this.tableData = tableData;
    }

    public int getStartNum() {
        return startNum;
    }

    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }
}
