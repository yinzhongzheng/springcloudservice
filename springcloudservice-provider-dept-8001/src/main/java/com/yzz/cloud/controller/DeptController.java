package com.yzz.cloud.controller;

import com.yzz.cloud.entities.Dept;
import com.yzz.cloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author:yzz
 * date:2018/11/21
 * E-mail:yzzstyle@163.com
 * com.yzz.cloud.controller
 * 注释:
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @RequestMapping(method = RequestMethod.POST)
    public Object addDept(Dept dept){
        try {
            System.out.println(dept);
            return deptService.addDept(dept);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Object getOneDept(@PathVariable long id){
        try {
            return deptService.getOneDept(id);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public Object getDepts(){
        try {
            return deptService.getDepts();
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Object addDept(@PathVariable long id){
        try {
            return deptService.removeDept(id);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
