package com.ajin.springdemo.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName :
 * @Description TODO
 * @Author :
 * @Date :
 * @Version V1.0
 */
public class DateUtils {
    /**
     * 指定返回当天的前几天 正数往后推 负数往前推
     * @auther: niugengyun
     * @param date
     * @param day
     * @return
     */
    public static Date returnPre(Date date, int day) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, day);
        return calendar.getTime();
    }
}
