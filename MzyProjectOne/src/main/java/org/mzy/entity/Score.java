package org.mzy.entity;

import lombok.Data;

/**
 * @Author: mzy
 * @Date: 2021/2/4 23:37
 */
@Data
public class Score {

    /**
     * 主键id
     */
    private long id ;

    /**
     * 学号
     */
    private String studentNumber;

    /**
     * 学科
     */
    private String subject;

    /**
     * 成绩
     */
    private int score;
}
