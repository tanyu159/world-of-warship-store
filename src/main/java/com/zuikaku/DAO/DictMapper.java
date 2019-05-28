package com.zuikaku.DAO;

import com.zuikaku.bean.SysDict;

import java.util.List;

public interface DictMapper {

    public List<String> selectTagName(List<String> idList);

    public List<SysDict> selectSysDictByTypeid(String typeid);
}
