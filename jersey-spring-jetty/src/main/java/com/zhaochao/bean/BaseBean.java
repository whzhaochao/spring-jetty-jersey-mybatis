package com.zhaochao.bean;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * @author luozejun
 *
 */
public class BaseBean {
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createTime; 
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	private Integer [] ids;

    public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	/**
     * 状态枚举
     * @author lu
     *
     */
    public static enum STATE {
        ENABLE(0, "可用"), DISABLE(1, "禁用");
        public int    key;
        public String value;

        private STATE(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public static STATE get(int key) {
            STATE[] values = STATE.values();
            for (STATE object : values) {
                if (object.key == key) {
                    return object;
                }
            }
            return null;
        }
    }

    /**
     * 删除枚举
     * @author lu
     *
     */
    public static enum DELETED {
        NO(0, "未删除"), YES(1, "已删除");
        public int    key;
        public String value;

        private DELETED(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public static DELETED get(int key) {
            DELETED[] values = DELETED.values();
            for (DELETED object : values) {
                if (object.key == key) {
                    return object;
                }
            }
            return null;
        }
    }

}
