package net.sunrise22.priapos.utils;

import java.text.SimpleDateFormat;

public class DateUtils {

    public static String TIME_PATTERN_1_TO_DAY = "yyyy-MM-dd";
    public static String TIME_PATTERN_2_TO_HOUR = "yyyy-MM-dd HH";
    public static String TIME_PATTERN_3_TO_MIN = "yyyy-MM-dd HH:mm";
    public static String TIME_PATTERN_4_TO_MINUTE = "yyyy-MM-dd HH:mm";
    public static String TIME_PATTERN_5_TO_SECOND = "yyyy-MM-dd HH:mm:ss";
    public static String TIME_PATTERN_6_TO_MILLSECOND = "yyyy-MM-dd HH:mm:ss:S";
    public static String TIME_PATTERN_7_TO_SECOND_SIMPLE = "yyyyMMddHHmmssS";
    public static String TIME_PATTERN_8_ISO = "yyyy-MM-dd HH:mm:ss:S E zZ";
    public static String TIME_PATTERN_9_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.S'Z'";
    public static String TIME_PATTERN_10_ZH = "yyyy年MM月dd日HH时mm分ss秒";
    public static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
}
