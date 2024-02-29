package com.liu.covid.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.EmpVaccine;
import com.liu.covid.mapper.EmpVaccineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.liu.covid.entity.Enum.GenderEnum;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
@RestController
@RequestMapping("/empvaccine")
public class EmpVaccineController {
    @Autowired
    private EmpVaccineMapper mapper;

    //分页查询
    @GetMapping("/findAll/{page}/{size}")
    public Page<EmpVaccine> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Page<EmpVaccine> page1= new Page<>(page,size);
        Page<EmpVaccine> result=mapper.selectPage(page1,null);
        System.out.println(result);
        return result;
    }

    @GetMapping("/findById/{id}")
    public EmpVaccine findById(@PathVariable("id") Integer id){
        return mapper.selectById(id);
    }

    @GetMapping("/search/{searchkey}/{stext}")
    public List<EmpVaccine> search(@PathVariable("searchkey")String searchkey, @PathVariable("stext")String stext){
        QueryWrapper<EmpVaccine> userQueryWrapper = Wrappers.query();
        userQueryWrapper.like(searchkey,stext);
        return mapper.selectList(userQueryWrapper);
    }
    @PostMapping("/save")
    public String save(@RequestBody EmpVaccine empVaccine) throws ParseException {
        //把性别列改为可迭代对象，令属性相对应
        if(empVaccine.getSex().toString()=="男")
            empVaccine.setSex(GenderEnum.男);
        else if(empVaccine.getSex().toString()=="女")
            empVaccine.setSex(GenderEnum.女);

        //计算差值时间
        int diff = 0;
        //按年份及月份相减
        //未知错误 2023年的getyear是123  月份从0开始，0为第一月
        diff = (123-empVaccine.getBevaccinedtime().getYear())*12+empVaccine.getBevaccinedtime().getMonth();
        if(diff>12)
            empVaccine.setDifference(diff);
        else
            empVaccine.setDifference(empVaccine.getBevaccinedtime().getMonth());


        //因为insert插入值，也会对自定义生成列插入值
        //产生报错
        //所以 最终决定！放弃生成列，改为后端计算操作插入，属性int
        int result = mapper.insert(empVaccine);
        if (result==1){
            return "success";
        }else {
            return "error";
        }
    }
}
