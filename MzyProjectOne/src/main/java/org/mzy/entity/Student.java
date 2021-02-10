package org.mzy.entity;

import lombok.Data;

/**
 * @Author: mzy
 * @Date: 2021/2/4 0:38
 */
@Data
public class Student {

    /**
     * 主键id
     */
    private long id ;

    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 所在班级
     */
    private String className;
}
