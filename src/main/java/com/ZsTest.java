package com;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

/**
 * @author zhangwenhao
 * @date 2023-07-24 00:21
 */
public class ZsTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("12:30:20");
        list.add("12:15:10");
        list.add("12:31:01");
        list.add("11:33:50");
        list.add("11:32:50");
        list.add("12:00:56");
        ArrayList<String> strings = timeSort(list);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(18&15);
        Collection<String> list2 = Collections.synchronizedCollection(list);
    }


    public static ArrayList<String> timeSort(ArrayList<String> times) {
        // write code here
        if(times == null) {
            return null;
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String time1, String time2) {
                String[] timeArray1 = time1.split(":");
                String[] timeArray2 = time2.split(":");
                int compare1 = Integer.compare(Integer.parseInt(timeArray1[2]), Integer.parseInt(timeArray2[2]));
                if (compare1 != 0) {
                    return compare1;
                }
                int compare2 = Integer.compare(Integer.parseInt(timeArray1[1]), Integer.parseInt(timeArray2[1]));
                if (compare2 != 0) {
                    return compare2;
                }
                return Integer.compare(Integer.parseInt(timeArray1[0]), Integer.parseInt(timeArray2[0]));
            }
        };
        Collections.sort(times, comparator);
        return times;
    }
}
