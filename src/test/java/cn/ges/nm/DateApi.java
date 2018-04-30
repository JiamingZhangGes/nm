package cn.ges.nm;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author gespent@163.com
 * @date 2018/4/30
 * 测试1.8 date API
 */
public class DateApi {

    @Test
    public void ts() {
        // LocalDateTime格式化
        // 输出结果 2018/04/30 22:48:39
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(df.format(LocalDateTime.now()));


        /*
         *  String 格式化
         *  LocalDateTime的toString 函数为return date.toString() + 'T' + time.toString();
         * 需要手动 替换掉T
         * 输出结果 1996-06-02T12:23:23
         */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒");
        LocalDateTime parse = LocalDateTime.parse("1996年06月02日12时23分23秒", dateTimeFormatter);
        System.out.println(parse.toString());




    }
}
