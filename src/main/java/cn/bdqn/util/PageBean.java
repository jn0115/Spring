package cn.bdqn.util;

import java.util.List;

public class PageBean<Users> {
    private int totalPageCount = 0;
    private Integer pageSize;
    private Integer totalCount;
    private Integer currPageNo;
    private List<Users> lists;

    public List<Users> getLists() {
        return lists;
    }

    public void setLists(List<Users> lists) {
        this.lists = lists;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(Integer currPageNo) {
        this.currPageNo = currPageNo;
    }


}
