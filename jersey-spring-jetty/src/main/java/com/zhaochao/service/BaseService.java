package com.zhaochao.service;

import java.util.List;

import com.zhaochao.mapper.BaseMapper;
import com.zhaochao.model.BaseModel;

public abstract class BaseService<T> {

    public abstract BaseMapper<T> getMapper();

    public void add(T t) throws Exception {
        getMapper().add(t);
    }

    public void update(T t) throws Exception {
        getMapper().update(t);
    }

    public void updateBySelective(T t) {
        getMapper().updateBySelective(t);
    }

    public void delete(Object... ids) throws Exception {
        if (ids == null || ids.length < 1) {
            return;
        }
        for (Object id : ids) {
            getMapper().delete(id);

        }
    }

    public int queryByCount(BaseModel model) throws Exception {
        return getMapper().queryByCount(model);
    }

    public List<T> queryByList(BaseModel model) throws Exception {
        Integer rowCount = queryByCount(model);
        model.getPager().setRowCount(rowCount);
        return getMapper().queryByList(model);
    }

    public T queryById(Object id) throws Exception {
        return getMapper().queryById(id);
    }

    public int queryCountByWhere(String where) {
        // TODO Auto-generated method stub
        return getMapper().queryCountByWhere(where);
    }

    public List<T> queryListByWhere(String where) throws Exception {

        return getMapper().queryListByWhere(where);
    }

    public void updateByWhere(String where) throws Exception {
        getMapper().updateByWhere(where);
    }

    public List<T> queryAllByList(BaseModel model) throws Exception {
        return getMapper().queryAllByList(model);
    }
}
