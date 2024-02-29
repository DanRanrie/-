package com.liu.covid.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.liu.covid.entity.Enum.ImpEnum;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "material_manage")
public class MaterialManage {

    //物资信息
    @TableId(type = IdType.AUTO)
    //id
    private Long id;
    //物资名称
    private String name;
    //物资数量
    private int count;
    //物资单位
    private String type;
    @TableField(value = "isImp")
    //是否为重点物资
    private ImpEnum isImp;
    //负责人
    private String charge;
    //负责人电话
    private Long cnum;
    @TableField(value = "updateTime" ,fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public ImpEnum getIsImp() {
//        return isImp;
//    }
//
//    public void setIsImp(ImpEnum isImp) {
//        this.isImp = isImp;
//    }
//
//    public String getCharge() {
//        return charge;
//    }
//
//    public void setCharge(String charge) {
//        this.charge = charge;
//    }
//
//    public Long getCnum() {
//        return cnum;
//    }
//
//    public void setCnum(Long cnum) {
//        this.cnum = cnum;
//    }
//
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
}
