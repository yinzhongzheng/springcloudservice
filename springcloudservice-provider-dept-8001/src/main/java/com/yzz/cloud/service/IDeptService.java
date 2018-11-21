package com.yzz.cloud.service;

import com.yzz.cloud.entities.Dept;

import java.util.List;

/**
 * author:yzz
 * date:2018/11/21
 * E-mail:yzzstyle@163.com
 * com.yzz.cloud.service
 * 注释:
 */
public interface IDeptService {
    /**
     * 增加部门
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 获取一个部门通过 id
     * @param id
     * @return
     */
    Dept getOneDept(long id);

    /**
     * 获取所有的Dept
     * @return
     */
    List<Dept> getDepts();

    /**
     * 删除deptId
     * @param id
     * @return
     */
    boolean removeDept(long id);

}
