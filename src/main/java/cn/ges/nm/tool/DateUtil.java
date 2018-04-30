package cn.ges.nm.tool;

import java.time.format.DateTimeFormatter;

/**
 * @author gespent@163.com
 * @date 2018/4/30
 */
public class DateUtil {
    public static String getFormatDate() {
        // 按照1994-04-01 21:00:00 的模版格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return null;
    }

}
