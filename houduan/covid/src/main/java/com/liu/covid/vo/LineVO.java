package com.liu.covid.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class LineVO {
    private List<String> month;
    private Map<String,List> status;

    public List<String> getMonth() {
        return month;
    }

    public void setMonth(List<String> month) {
        this.month = month;
    }

    public Map<String, List> getStatus() {
        return status;
    }

    public void setStatus(Map<String, List> status) {
        this.status = status;
    }
}
