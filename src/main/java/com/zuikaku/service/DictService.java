package com.zuikaku.service;

import com.zuikaku.bean.SysDict;

import java.util.List;

public interface DictService {
    //实现标签/平台的id到中文的转换对应，到数据库Sysdict表里面查对应的中文
    public List<String> selectTagName(List<String> idList);
    //根据词典类型id获取所有词典对象
    public List<SysDict> selectSysDictByTypeid(String typeid);
}
