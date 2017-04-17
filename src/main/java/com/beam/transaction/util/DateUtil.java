package com.beam.transaction.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 说明：日期处理
 *
 * @author zhuzh
 */
public class DateUtil {

    public final static SimpleDateFormat sdfYear  = new SimpleDateFormat("yyyy");
    public final static SimpleDateFormat sdfDay   = new SimpleDateFormat("yyyy-MM-dd");
    public final static SimpleDateFormat sdfDays  = new SimpleDateFormat("yyyyMMdd");
    public final static SimpleDateFormat sdfTime  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public final static SimpleDateFormat sdfTimes = new SimpleDateFormat("yyyyMMddHHmmss");
    public final static SimpleDateFormat sdfMin   = new SimpleDateFormat("yyyyMMddHHmm");
    public final static SimpleDateFormat sdfMins  = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    /**
     * 获取当前时间的Unix时间戳
     */
    public static Long unixTimestamp() {
        return System.currentTimeMillis() / 1000;
    }

    /**
     * 获取Unix时间戳
     */
    public static Long unixTimestamp(Date date) {
        return date.getTime() / 1000;
    }

    /**
     * 获取Unix时间戳
     */
    public static Long unixTimestamp(String dateStr, DateFormat df) throws ParseException {
        Date date = df.parse(dateStr);
        return date.getTime() / 1000;
    }

    /**
     * Unix时间戳转时间格式
     */
    public static String unixTimestampToDateStr(Long unixTimeStamp, DateFormat df) {
        return df.format(new Date(unixTimeStamp*1000));
    }

    public static void main(String[] args) {
        System.out.println(unixTimestampToDateStr(1484630944l, sdfTime));
    }

    /**
     * 获取yyyyMMddHHmmss格式
     *
     * @return
     */
    public static String getSdfTimes() {
        return sdfTimes.format(new Date());
    }

    /**
     * 获取yyyyMMddHHmmss格式
     *
     * @return
     */
    public static String getSdfTimes(Date date) {
        return sdfTimes.format(date);
    }

    /**
     * 获取YYYY格式
     *
     * @return
     */
    public static String getYear() {
        return sdfYear.format(new Date());
    }

    /**
     * 获取YYYY-MM-DD格式
     *
     * @return
     */
    public static String getDay() {
        return sdfDay.format(new Date());
    }

    /**
     * 获取YYYYMMDD格式
     *
     * @return
     */
    public static String getDays() {
        return sdfDays.format(new Date());
    }

    /**
     * 获取当天零时的秒数
     *
     * @return
     */
    public static Long getStarSecond() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis() / 1000;
    }

    /**
     * 获取YYYY-MM-DD HH:mm:ss格式
     *
     * @return
     */
    public static String getTime() {
        return sdfTime.format(new Date());
    }

    /**
     * 获取YYYY-MM-DD HH:mm:ss格式
     *
     * @return
     */
    public static String getTime(Date date) {
        return sdfTime.format(date);
    }

    /**
     * @param s
     * @param e
     * @return boolean
     * @throws
     * @Title: compareDate
     * @Description: TODO(日期比较，如果s>=e 返回true 否则返回false)
     */
    public static boolean compareDate(String s, String e) {
        if (fomatDate(s) == null || fomatDate(e) == null) {
            return false;
        }
        return fomatDate(s).getTime() >= fomatDate(e).getTime();
    }

    /**
     * 格式化日期
     *
     * @return
     */
    public static Date fomatDate(String date) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return fmt.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 校验日期是否合法
     *
     * @return
     */
    public static boolean isValidDate(String s) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fmt.parse(s);
            return true;
        } catch (Exception e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return false;
        }
    }

    /**
     * @param startTime
     * @param endTime
     * @return
     */
    public static int getDiffYear(String startTime, String endTime) {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //long aa=0;
            int years = (int) (((fmt.parse(endTime).getTime() - fmt.parse(startTime).getTime()) / (1000 * 60 * 60 * 24)) / 365);
            return years;
        } catch (Exception e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return 0;
        }
    }

    /**
     * <li>功能描述：时间相减得到天数
     *
     * @param beginDateStr
     * @param endDateStr
     * @return long
     * @author Administrator
     */
    public static long getDaySub(String beginDateStr, String endDateStr) {
        long             day       = 0;
        SimpleDateFormat format    = new SimpleDateFormat("yyyy-MM-dd");
        Date             beginDate = null;
        Date             endDate   = null;

        try {
            beginDate = format.parse(beginDateStr);
            endDate = format.parse(endDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
        //System.out.println("相隔的天数="+day);

        return day;
    }

    /**
     * 得到n天之后的日期
     *
     * @param days
     * @return
     */
    public static String getAfterSecondDate(String days) {
        int daysInt = Integer.parseInt(days);

        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();

        SimpleDateFormat sdfd    = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String           dateStr = sdfd.format(date);

        return dateStr;
    }

    /**
     * 得到n天之后是周几
     *
     * @param days
     * @return
     */
    public static String getAfterDayWeek(String days) {
        int      daysInt   = Integer.parseInt(days);
        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date             date    = canlendar.getTime();
        SimpleDateFormat sdf     = new SimpleDateFormat("E");
        String           dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * 得到n秒之后的日期
     *
     * @param second
     * @return
     */
    public static Date getAfterSecondDate(Date now, Integer second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.SECOND, second);
        return calendar.getTime();
    }
    /*
     * 获取当前时间这就是距离1970年1月1日0点0分0秒的毫秒数
     * */

    public static long getCurrentTime() {
        Date dt = new Date();
        return dt.getTime();
    }

}
