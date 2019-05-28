package com.zuikaku.service;

import com.zuikaku.DAO.DictMapper;
import com.zuikaku.bean.SysDict;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServicempl implements DictService {

    @Autowired
    private DictMapper dictMapper;
    @Override
    public List<String> selectTagName(List<String> idList)
    {
        return dictMapper.selectTagName(idList);
    }
    @Override
    public List<SysDict> selectSysDictByTypeid(String typeid){ return dictMapper.selectSysDictByTypeid(typeid);}

}
