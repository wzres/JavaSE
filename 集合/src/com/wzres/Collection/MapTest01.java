package com.wzres.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName：MapTest01
 * @description：
 * @date：2023-04-25 21:48
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "赵六");
        map.put(5, "陆七");

        String s = map.get(3);
        System.out.println(s);

        System.out.println(map.size());

        //Collection<String> values = map.values();

        //第一种遍历
        for (int i = 0; i < map.size(); i++) {
            String s1 = map.get(i);
            System.out.println(s1);
        }

        //第二种遍历(1)，先获取所有的kev，然后使用迭代器map.get(kev)

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            //取出其中一个key
            Integer key = iterator.next();
            //通过key拿value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("-------");
        //第二种遍历(2) for循环
        for (Integer key:keys){
            System.out.println(key+"-->"+map.get(key));
        }

        //第三种
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            //Map集合通过entrySet（）方法转换成的这个Set集合，Set集合中元素的类型是map.Entry(静态内部类)
            //每遍历一次，得到是每一个node对象，每个对象都有一个key和value属性
            Map.Entry<Integer, String> node = iterator1.next();
            System.out.println(node.getKey()+"--"+node.getValue());
        }

        for(Map.Entry<Integer, String> node:entries){
            System.out.println(node.getKey()+"---"+node.getValue());
        }

    }


}


