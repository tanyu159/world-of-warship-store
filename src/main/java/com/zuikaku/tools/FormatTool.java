package com.zuikaku.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
格式转换工具类
 */
public class FormatTool {
    public static String DateConvert(String source) throws ParseException
    {
        if(source.contains("/"))
        {
            //原日期中有/则说明需要转换
            SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
            Date newDate=sdf.parse(source);
            SimpleDateFormat formatSdf =new SimpleDateFormat("yyyy-MM-dd");
            String formatDateStr=formatSdf.format(newDate);
            return formatDateStr;
        }else{
            //否则直接返回
            return source;
        }
    }

}
