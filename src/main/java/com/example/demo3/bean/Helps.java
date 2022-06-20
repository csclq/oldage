package com.example.demo3.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Helps {
    private Integer id;
    private String name;
    private String town;
    private String village;
    private String serial;
    private Integer alarmAt;
    private String device;
    private String deviceType;
    private String handler;
    private Integer handleAt;
    private String area;
    private String fallType;
    private String alarmType;
    private int status;
    private long createdAt = System.currentTimeMillis();
    private long updatedAt = System.currentTimeMillis();

}
