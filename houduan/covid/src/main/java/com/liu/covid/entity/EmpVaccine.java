package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.GenderEnum;
import lombok.Data;

import java.util.Date;

@Data
public class EmpVaccine {
    @TableId(type = IdType.AUTO)
    //id
    private int id;
    //姓名
    private String name;
    //性别
    //项目中用的是可迭代变量，原列属性是int
    //通过1、0迭代实现男女
    //可以用字符串实现，但后续写入可能很麻烦，所以选择迭代
    private GenderEnum sex;
    //电话
    private Long phonenum;
    //体温
    private String vaccine;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    //接种疫苗时间
    private Date bevaccinedtime;
    //距离上次疫苗，已经过去多少时间
    private int difference ;
    private String depart;
}
