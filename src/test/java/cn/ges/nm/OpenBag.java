package cn.ges.nm;

import org.junit.Test;

import java.util.*;

/**
 * @author gespent@163.com
 * @date 2018/4/30
 * 模拟卡包算法
 * 假设五级稀有程度 普通->稀有->神器->传说->史诗
 * 一个卡包有五张卡 开出卡牌几率从高到低对应为：1%->4%->8%->15%->72%
 * 每个卡包最少会开出一张稀有卡
 */
public class OpenBag {
    @Test
    public void ts() {
        // 开启次数
        int turn = 5;

        // 开启次数循环
        for (int i = 1; i <6 ; i++) {
            ArrayList<String> result = ts2();
            System.out.println("第"+i+"次的结果为："+result.toString());
        }
    }

    /**
     * 每包模拟方法
     */
    private ArrayList<String> ts2() {
        ArrayList<String> result = new ArrayList<>();
        Random ran = new Random();
        boolean noHighCard = true;

        // 前4次循环
        for (int i = 0; i < 4; i++) {
            // 获取这个随机数,并处理
            boolean getHighCard = cardCheck(result, ran, 99);

            // 如果该包开出高级卡 且之前未开出 修改标记
            // 先判断用户未开出高级卡
            if (noHighCard) {
                // 再判断 该次是不是开出高级卡
                if (getHighCard) {
                    noHighCard = false;
                }
            }
        }

        // 第五次保底循环
        //未开出高级卡，进行特殊循环，否则进行正常循环
        if (noHighCard) {
            // 特殊循环
            ArrayList<String> temp = new ArrayList<>();
            boolean getHighCard = cardCheck(temp, ran, 99);
            // 如果开出高级卡，进行数组合并
            if (getHighCard) {
                result.addAll(temp);
            } else {
                // 未开出高级卡，直接补偿一张稀有卡
                result.add("稀有");
            }
        }else {
            // 如果已经开出高级卡，正常进行一次开启
            cardCheck(result, ran, 99);
        }

        // 返回打乱顺序的 list
        Collections.shuffle(result);
        return result;

    }

    /**
     * 根据结果获得卡片品级方法
     * @param result 用于放置结果,可以为null 为null时不进行List元素操作
     * @param ran Random对象 可以为null 为null时会自动创建一个
     * @param Range Random对象范围 不能为null
     * @Return 是否开出高级卡
     */
    private boolean cardCheck(List result,Random ran,int Range) {

        ran = Optional.ofNullable(ran).orElse(new Random());
        // 获得随机数
        var rd=ran.nextInt(Range);
        // 几率 由小到大排列
        if (rd == 0) {
            Optional.ofNullable(result).ifPresent(temp -> result.add("史诗"));
            return true;
        }
        if (rd < 4) {
            Optional.ofNullable(result).ifPresent(temp -> result.add("传说"));
            return true;
        }
        if (rd < 12) {
            Optional.ofNullable(result).ifPresent(temp -> result.add("神器"));
            return true;
        }
        if (rd < 27) {
            Optional.ofNullable(result).ifPresent(temp -> result.add("稀有"));
            return true;
        }
        Optional.ofNullable(result).ifPresent(temp -> result.add("普通"));
        return false;
    }
}
