package com.geekfaith.demo.daily;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class TestDemo2 {

    public static List<Integer> waitSortList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    public static List<Integer> weightList = Lists.newArrayList(10, 3, 1, 1, 5, 1, 7, 9);//[10,3,1, 5, 7, 9]

    static {

    }


    public static void main(String[] args) {
        //weightList 去重
        LinkedHashSet<Integer> dup = new LinkedHashSet<>(weightList);
        ArrayList<Integer> dupArr = new ArrayList<>(dup);

        //
        int index = 0;
        ArrayList<Integer> retains = new ArrayList<>();
        for (int i = 0; i < dupArr.size(); i++) {
            Integer weightVal = dupArr.get(i);
            boolean isMatch = false;
            for (int j = index; j < waitSortList.size(); j++) {
                Integer comVal = waitSortList.get(j);
                if (weightVal.equals(comVal)) {
                    int t = j;
                    while (t > index) {
                        waitSortList.set(t, waitSortList.get(t - 1));
                        t--;
                    }
                    waitSortList.set(index, comVal);
                    index++;
                    isMatch = true;
                }
            }
            if (!isMatch) {
                retains.add(weightVal);
            }
        }
        waitSortList.addAll(retains);
        System.out.println(waitSortList);
    }


}
