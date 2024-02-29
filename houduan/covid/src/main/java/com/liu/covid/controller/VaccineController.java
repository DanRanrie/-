package com.liu.covid.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liu.covid.entity.Department;
import com.liu.covid.entity.EmpIs;
import com.liu.covid.entity.EmpVaccine;
import com.liu.covid.entity.Vaccine;
import com.liu.covid.mapper.VaccineMapper;
import com.liu.covid.mapper.EmpVaccineMapper;
import com.liu.covid.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
@RestController
@RequestMapping("/vaccine")
public class VaccineController {

    @Autowired
    VaccineMapper mapper;

    @GetMapping("/findAll")
    private List<String> findAll(){
        List<Vaccine> list;
        List<String> name=new ArrayList<>();
        list=mapper.selectList(null);
        for (Vaccine v:list){
            name.add(v.get疫苗种类());
        }
        return name;
    }
}
