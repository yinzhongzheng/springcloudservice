package com.yzz.cloud.service.impl;

import com.yzz.cloud.dao.IDeptDao;
import com.yzz.cloud.entities.Dept;
import com.yzz.cloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:yzz
 * date:2018/11/21
 * E-mail:yzzstyle@163.com
 * com.yzz.cloud.service.impl
 * 注释:
 */

@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept getOneDept(long id) {
        return deptDao.getOneDept(id);
    }

    @Override
    public List<Dept> getDepts() {
        return deptDao.getDepts();
    }

    @Override
    public boolean removeDept(long id) {
        return deptDao.removeDept(id);
    }
}
