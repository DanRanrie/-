package com.liu.covid.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liu.covid.entity.Department;
import org.springframework.stereotype.Repository;
import com.liu.covid.entity.Vaccine;

import java.util.List;

@Repository
public interface VaccineMapper extends BaseMapper<Vaccine> {
}