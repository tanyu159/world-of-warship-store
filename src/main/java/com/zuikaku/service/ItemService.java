package com.zuikaku.service;

import com.zuikaku.bean.ItemInfo;
import com.zuikaku.bean.ItemInfoVo;

import java.util.List;

public interface ItemService {

    //1查询全部
    public List<ItemInfo> selectAll ();
    //2查询全部并按规则排序，后台的.根据ItemInfoVo进行查询
    public List<ItemInfo> selectItemInfoByVo(ItemInfoVo vo);
    //3添加一条数据
    public void save(ItemInfo itemInfo);
    //4根据Id查询一条记录
    public ItemInfo selectItemInfoById(String id);
    //5更新一条记录
    public void update(ItemInfo itemInfo);
    //6物理删除一条记录
    public void delete(String id);
    //有关前台页面
    //7根据 新品 标识位进行排序
    public List<ItemInfo> selectItemInfoSortByIs_new();
    //8根据 特卖 标识位查询排序
    public List<ItemInfo> selectItemInfoSortByIs_specials();
    //9根据 即将上架 标识位查询
    public List<ItemInfo> selectItemInfoSortByIs_upcoming();
}
