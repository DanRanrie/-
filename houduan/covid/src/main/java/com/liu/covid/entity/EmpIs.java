package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.GenderEnum;
import lombok.Data;

import java.util.Date;

@Data
public class EmpIs {
    @TableId(type = IdType.AUTO)
    //id
    private Long id;
    //姓名
    private String name;
    //性别
    private GenderEnum sex;
    //电话
    private Long phone;
    //体温
    private float temp;
    //隔离方式
    private String type;
    //所在地
    private String place;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    //开始时间
    private Date begin;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    //结束时间
    private  Date end;
    //离开的地点
    private String leaved;
    //备注
    private String content;
    //目的地
    private String arrived;
    //所属部门
    private String depart;
}
