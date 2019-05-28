package com.zuikaku.DAO;

import com.zuikaku.bean.ItemInfo;
import com.zuikaku.bean.ItemInfoVo;

import java.util.List;

public interface ItemMapper {
    //1查询全部
    public List<ItemInfo> selectAll();
    //2查询全部并按规则排序，后台的.根据ItemInfoVo进行查询
    public List<ItemInfo> selectItemInfoByVo(ItemInfoVo vo);
    //3添加一条数据
    public void save(ItemInfo itemInfo);
    //4根据id查询一条记录
    public ItemInfo selectItemInfoById(String id);
    //5更新一条数据
    public void update(ItemInfo itemInfo);
    //6物理删除一条数据
    public void delete(String id);
    //关于前台页面的查询函数
    //7根据新品标志位查询
    public List<ItemInfo> selectItemInfoSortByIs_new();
    //8根据特卖标识位查询
    public List<ItemInfo> selectItemInfoSortByIs_specials();
    //9根据即将上线标志位查询
    public List<ItemInfo> selectItemInfoSortByIs_upcoming();
}
