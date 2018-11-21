package com.yzz.cloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by yzz on 2018/11/15.
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long 	deptNo; // 主键
    private String 	dName; // 部门名称
    private String 	dbSource;// 来自那个数据库

    public Dept(String dName) {
        this.dName = dName;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
    }

}
