package com.zuikaku.controller;
/*
商品相关
 */

import com.zuikaku.bean.ItemInfo;
import com.zuikaku.bean.ItemInfoVo;
import com.zuikaku.bean.SysDict;
import com.zuikaku.service.DictService;
import com.zuikaku.service.ItemService;
import com.zuikaku.tools.FormatTool;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("/admin/items")
public class ItemController {

    @Autowired
    private ItemService itemService;
    @Autowired
    private DictService dictService;


    @RequestMapping("")
    public String list(Model model, ItemInfoVo vo)
    {

        //List<ItemInfo> itemInfoList= itemService.selectAll();
        // 为了实现按条件排序，这里使用ItemInfoVo
        List<ItemInfo> itemInfoList= itemService.selectItemInfoByVo(vo);
        //实现平台和标签有哪些种类的动态获取显示在后台前端页面上
        List<SysDict> tagidsList=dictService.selectSysDictByTypeid("01");//数据库中的dict_type_id字段01对应Sysdict表中的舰艇标签
        List<SysDict> platformList=dictService.selectSysDictByTypeid("02");//数据库中的dict_type_id字段02对应Sysdict表中的舰艇平台
        List<SysDict> flagList=dictService.selectSysDictByTypeid("03");//数据库中的dict_type_id字段03对应Sysdict表中的标识位
        //将平台。标签列表 保存到model中，动态获取，通过数据库，显示有哪些标签和平台
        model.addAttribute("tagidsList",tagidsList);
        model.addAttribute("platformList",platformList);
        //将标志位，如是否热卖，是否即将上架 保存到model中，动态获取，通过数据库，显示有哪些标签和平台
        model.addAttribute("flagList",flagList);

        //vo回显，保证ID两次点击的正常
        model.addAttribute("itemVo",vo);
        //System.out.println(itemInfoList);
        model.addAttribute("itemList",itemInfoList);
        return "admin/item_list";
    }

    //根据词典id查询返回对应的dict_item_name
    @RequestMapping("adminTags")
    @ResponseBody
    public  List<String> tagName(@RequestBody List<String> idList)
    {
        List<String> nameList=dictService.selectTagName(idList);
        return nameList;
    }

    //添加商品
    @RequestMapping("/save")
    @ResponseBody
    public String save(ItemInfo itemInfo, MultipartFile upload_image) throws Exception
    {
        //测试，获取后台页面前端输入Item
        System.out.print(itemInfo);
        //实现文件上传,这个参数upload_image刚好与jsp页面中对应
        //文件名字 扩展名 路径
        String name=System.currentTimeMillis()+"";
        String endName= FilenameUtils.getExtension(upload_image.getOriginalFilename());
        String path="E:\\SpringMVCprojects\\WorldofWarshipsStore_new\\target\\World of Warships Store\\uploadImg\\";
        String fileName=name+"."+endName;
        //保存图片,【有图片才保存，否则会生成空文件】
        if(endName!=null&&!endName.equals("")) {
            upload_image.transferTo(new File(path + fileName));
            //保存图片文件名称到itemInfo中
            itemInfo.setItem_cap_image(fileName);
        }
        //修改日期类型,调用工具类
        itemInfo.setItem_release_date(FormatTool.DateConvert(itemInfo.getItem_release_date()));
        itemService.save(itemInfo);

        return "OK";
    }

    //修改按钮点击，回显当前记录的数据
    @RequestMapping("/edit")
    @ResponseBody
    public ItemInfo edit(String id)
    {
       return itemService.selectItemInfoById(id);
    }

    //确认修改按钮点击，执行数据库的修改
    @RequestMapping("/update")
    @ResponseBody
    public String update(ItemInfo itemInfo, MultipartFile upload_image, HttpServletRequest request) throws Exception
    {
        System.out.println(request.getParameter("testname"));
        System.out.println("更新了");
        if(upload_image!=null && !upload_image.getOriginalFilename().equals(""))
        {
            //实现文件上传,这个参数upload_image刚好与jsp页面中对应
            //文件名字 扩展名 路径
            String name=System.currentTimeMillis()+"";
            String endName= FilenameUtils.getExtension(upload_image.getOriginalFilename());
            String path="E:\\SpringMVCprojects\\WorldofWarshipsStore_new\\target\\World of Warships Store\\uploadImg\\";
            String fileName=name+"."+endName;
            //保存图片
            upload_image.transferTo(new File(path+fileName));
            //保存图片文件名称到itemInfo中
            itemInfo.setItem_cap_image(fileName);

        }
        //测试，获取后台页面前端输入Item
        //System.out.print(itemInfo);

        System.out.println(itemInfo);
        //修改日期类型,调用工具类
        itemInfo.setItem_release_date(FormatTool.DateConvert(itemInfo.getItem_release_date()));
        itemService.update(itemInfo);

        return "OK";
    }

    //按id物理删除一条记录
    @RequestMapping("/delete")
    public String delete(String id)
    {
        System.out.println("删除记录 id为"+id);
        itemService.delete(id);
        return "admin/item_list";
    }
}
