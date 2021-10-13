package com.geekfaith.demo.daily;


import java.util.*;

public class TestDemo1 {

    public static void main(String[] args) {
        Map<Long, List<Double>> data = new HashMap<>();
        data.put(1L, Arrays.asList(1.0, 2.0, 3.0));
        data.put(2L, Arrays.asList(2.0, 1.0, 3.0));
        data.put(3L, Arrays.asList(3.0, 6.0, 9.0));
        List<Double> avg = avg(data);
        System.out.println(avg);
    }

    public static List<Double> avg(Map<Long, List<Double>> data) {
        int peopleCnt = data.size();
        List<Double> result = new ArrayList<>();
        data.values().forEach(it -> {
            if (result.isEmpty()) {
                result.addAll(it);
            } else {
                for (int i = 0; i < it.size(); i++) {
                    //数据累加
                    result.set(i, it.get(i) + Optional.ofNullable(result.get(i)).orElse(0.0));
                }
            }
        });
        //求平均数
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) / peopleCnt);
        }
        return result;
    }

}
