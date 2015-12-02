package com.zhaochao.model;

import java.util.Date;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.zhaochao.bean.Pager;


public class BaseModel {
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createTime; 
	private Integer [] ids;
    public Integer[] getIds() {
		return ids;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	private Integer page  = 1;
    private Integer rows  = 10;
    private String  sorter;
    private String  order;
    /**
     * 分页导航
     */
    private Pager   pager = new Pager();

    public Pager getPager() {

        pager.setPageId(getPage());
        pager.setPageSize(getRows());
        String orderField = "";
        if (!StringUtils.isEmpty(sorter)) {
            orderField = sorter;
        }
        if (!StringUtils.isEmpty(orderField) && !StringUtils.isEmpty(order)) {
            orderField += " " + order;
        }
        pager.setOrderField(orderField);
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSorter() {
        return sorter;
    }

    public void setSorter(String sorter) {
        this.sorter = sorter;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}
