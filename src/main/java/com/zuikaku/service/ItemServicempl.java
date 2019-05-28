package com.zuikaku.service;

import com.zuikaku.DAO.ItemMapper;
import com.zuikaku.bean.ItemInfo;
import com.zuikaku.bean.ItemInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemServicempl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    //1查询全部【已经不使用了】
    @Override
    public List<ItemInfo> selectAll()
    {
        return itemMapper.selectAll();
    }


    //2查询全部并按规则排序，后台的.根据ItemInfoVo进行查询
    @Override
    public List<ItemInfo> selectItemInfoByVo(ItemInfoVo vo)
    {
        //先存储下所有结果，然后按照查询弹出层的条件[平台/标签]进一步筛选,先选完条件后，再按查询
        List<ItemInfo> queryList= itemMapper.selectItemInfoByVo(vo);

        //判断vo是否为空
        if(null ==vo)
        {
            //前台页面默认查询时筛出掉下架的记录【新增】
            List<ItemInfo> queryListQianTaiView=new ArrayList<ItemInfo>();
            for(ItemInfo itemInfo:queryList)
            {
                if(itemInfo.getIs_enable()!=null&&itemInfo.getIs_enable()==true)
                {
                    queryListQianTaiView.add(itemInfo);
                }
            }
            return queryListQianTaiView;//没有查询条件时，直接返回出去
        }


        //判断标签和平台字符串是否为空
        if(null!=vo.getItem_tagids()&&!vo.getItem_tagids().equals("")||
                null!=vo.getItem_platform()&&!vo.getItem_platform().equals(""))
        {
            //将满足条件的结果 放入这个列表中并返回
            List<ItemInfo> resList=new ArrayList<ItemInfo>();
            //获取并拆分前台查询弹窗层中选定的条件的数组
            String[] voTagids=vo.getItem_tagids().split("#");
            String[] voPlatform=vo.getItem_platform().split("#");
            //根据条件便利
            for(ItemInfo itemInfo:queryList)
            {
                //该标识为如果到最后都还是 true则把他添加到resList中
                boolean isContain=true;

                //处理标签的筛选
                if(!vo.getItem_tagids().equals(""))
                {
                    String[] itemInfoTagids=itemInfo.getItem_tagids().split("#");
                    //将上面那个数组转化为列表
                    List<String> itemInfoTagidsList= Arrays.asList(itemInfoTagids);
                    for(String voTag:voTagids)
                    {
                        //判断是否包含
                        isContain=itemInfoTagidsList.contains(voTag);
                        if(!isContain)
                            //如果其中有一个不包含，就没有继续遍历的必要了，直接break
                            break;
                    }
                }

                //处理平台筛选
                if(!vo.getItem_platform().equals("")&&isContain)
                {
                    String[] itemInfoPlatform=itemInfo.getItem_platform().split("#");
                    //将上面那个数组转化为列表
                    List<String> itemInfoPlatformList= Arrays.asList(itemInfoPlatform);
                    for(String voplatform:voPlatform)
                    {
                        //判断是否包含
                        isContain=itemInfoPlatformList.contains(voplatform);
                        if(!isContain)
                            //如果其中有一个不包含，就没有继续遍历的必要了，直接break
                            break;
                    }
                }

                //最后筛选成功的加入结果列表
                if(isContain)
                {
                    resList.add(itemInfo);
                }
            }
            return resList;
        }else{
            return queryList;//查询条件为空时也直接返回
        }
    }

    //3添加一条数据
    @Override
    public void save(ItemInfo itemInfo)
    {
        itemMapper.save(itemInfo);
    }

    //4根据id查询一条记录
    @Override
    public ItemInfo selectItemInfoById(String id)
    {
        return itemMapper.selectItemInfoById(id);
    }

    //5更新一条记录
    @Override
    public void update(ItemInfo itemInfo)
    {
        itemMapper.update(itemInfo);
    }

    //6物理删除一条记录
    @Override
    public void delete(String id)
    {
        itemMapper.delete(id);
    }

    //关于前台页面的查询
    //7根据 新品 标识位查询
    @Override
    public List<ItemInfo> selectItemInfoSortByIs_new()
    {
        return itemMapper.selectItemInfoSortByIs_new();
    }

    //8根据 特卖 标志位查询
    @Override
    public List<ItemInfo> selectItemInfoSortByIs_specials()
    {
        return itemMapper.selectItemInfoSortByIs_specials();
    }

    //9根据 即将上线 标志位查询
    @Override
    public List<ItemInfo> selectItemInfoSortByIs_upcoming()
    {
        return itemMapper.selectItemInfoSortByIs_upcoming();
    }
}
