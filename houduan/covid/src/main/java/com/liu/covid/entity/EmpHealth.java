package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.GenderEnum;
import lombok.Data;

import java.util.Date;

@Data
public class EmpHealth {

    //健康人的信息
    @TableId(type = IdType.AUTO)
    //id
    private Long id;
    //姓名
    private String name;
    //性别
    private GenderEnum sex;
    //手机号
    private Long phonenum;
    //体温
    private float temp;
    //是否到达高风险地区
    private String risk;
    //健康状况
    private String health;
    //备注
    private String content;
    //所属部门
    private String depart;
    @TableField(value = "createTime" ,fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    //创建时间
    private Date createTime;
}
