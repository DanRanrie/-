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
public class EmpIden {

    //疑似/确诊人员信息
    @TableId(type = IdType.AUTO)
    //id
    private Long id;
    //名字
    private String name;
    //目前状态
    private String status;
    //性别
    private GenderEnum sex;
    //身份证号
    private Long idcard;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    //就诊日期
    private Date idate;
    //就诊医院
    private String place;
    //所属部门
    private String depart;
    //手机号
    private Long phonenum;

    @TableField(value = "register" ,fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    //登记时间
    private Date register;

}

