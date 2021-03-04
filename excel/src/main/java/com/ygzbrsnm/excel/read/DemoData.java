package com.ygzbrsnm.excel.read;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

/**
 * 基础数据类
 *
 * @author Jiaju Zhuang
 **/
@Data
public class DemoData {
    @ExcelProperty("字符串标题")
    private String string;
//    @ExcelProperty("数字标题")
//    private Double doubleData;
}
