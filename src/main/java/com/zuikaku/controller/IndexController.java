package com.zuikaku.controller;

import com.zuikaku.bean.ItemInfo;
import com.zuikaku.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/*
前台页面相关,前台首页
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ItemService itemService;//注入

    @RequestMapping("")
    public String list(Model model)
    {
        List<ItemInfo> itemList=itemService.selectItemInfoByVo(null);//不传条件代表查询所有
        model.addAttribute("itemList",itemList);
        return "index";
        //注意还要回到素材提供的Index.jsp，把路径的static修改为${pageContext.request.contextPath}
        //再到web.xml增加对gif，jpg文件的放行
    }
    //按标志位排序查询【新增】
    @RequestMapping("/sort")
    @ResponseBody
    public List<ItemInfo> sort(String name)
    {
        List<ItemInfo> resList=new ArrayList<ItemInfo>();
        System.out.println("name="+name);
        switch (name)
        {
            case "is_new":
                resList=itemService.selectItemInfoSortByIs_new();
                break;
            case "is_specials":
                resList=itemService.selectItemInfoSortByIs_specials();
                break;
            case "is_upcoming":
                resList=itemService.selectItemInfoSortByIs_upcoming();
                break;
        }
        System.out.println("前台页面查询了");
        return resList;
        //还要处理个地方，解决前台页面第一次默认查询时把下架的商品也显示出来的问题，去service的selectiteminfobyvo进行处理
    }

}
