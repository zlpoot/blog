package com.zy.blog.common;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 日期操作类
 */
public class DateTools {
    /**
     * 
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getAllDate(){
        SimpleDateFormat   lFormat;
        lFormat   =     new   SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String   gRtnStr   =   lFormat.format(new Date()); 
        return gRtnStr;
    }

    /**
     *
     * @return yyyy-MM-dd
     */
    public static String getDate(){
        SimpleDateFormat   lFormat;
        lFormat   =     new   SimpleDateFormat("yyyy-MM-dd");
        String   gRtnStr   =   lFormat.format(new Date());
        return gRtnStr;
    }

    /**
     *
     * @return yyyy-MM-dd
     */
    public static String getFormatDate(Date date){
        SimpleDateFormat   lFormat;
        lFormat   =     new   SimpleDateFormat("yyyy-MM-dd");
        String   gRtnStr   =   lFormat.format(date);
        return gRtnStr;
    }

    public static void main(String args[]){
        System.out.println(DateTools.getDate());
        
    }
}