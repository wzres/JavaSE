package com.wzres.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @ClassName：StreamTest1
 * @description：集合、数组转换流
 * @date：2023-05-01 23:00
 */
public class StreamTest1 {
    public static void main(String[] args) {
        // 单列集合 ➟ 流
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Stream<Integer> stream = list.stream();//集合转换成流
        stream.distinct()
                .filter(integer -> integer%2==0)
                .forEach(integer -> System.out.println(integer));
        // 双列集合 ➟ 流
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "星期一");
        map.put(3, "星期二");
        map.put(2, "星期三");
        map.put(4, "星期四");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Stream<Map.Entry<Integer, String>> stream1 = entries.stream();
        stream1.distinct()
                .filter(new Predicate<Map.Entry<Integer, String>>() {
                    @Override
                    public boolean test(Map.Entry<Integer, String> node) {
                        return node.getValue().contains("三");
                    }
                })
                .forEach(new Consumer<Map.Entry<Integer, String>>() {
                    @Override
                    public void accept(Map.Entry<Integer, String> node) {
                        System.out.println(node.getKey()+node.getValue());
                    }
                });

    }
}
