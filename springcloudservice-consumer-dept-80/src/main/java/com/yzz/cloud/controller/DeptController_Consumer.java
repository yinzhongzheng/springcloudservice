package com.yzz.cloud.controller;

import com.yzz.cloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * author:yzz
 * date:2018/11/21
 * E-mail:yzzstyle@163.com
 * com.yzz.cloud.controller
 * 注释:
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController_Consumer {

    public static final String URL = "http://localhost:8001/dept/";

    public static final String EUREKA_URL = "http://springcloudservice-dept/";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Object getDept(@PathVariable long id){
        Dept dept = restTemplate.getForObject(EUREKA_URL+"dept/"+id,Dept.class);
        return dept;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Object getDepts(){
        return restTemplate.getForEntity(EUREKA_URL+"dept",List.class);
    }
}
