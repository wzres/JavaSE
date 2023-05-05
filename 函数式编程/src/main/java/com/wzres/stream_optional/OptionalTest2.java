package com.wzres.stream_optional;

import java.util.Optional;

/**
 * @ClassName：OptionalTest2
 * @description：
 * @date：2023-05-05 17:55
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Optional<Author> authors = getAuthors();
        //System.out.println(authors.get()); //不推荐，null值会空指针异常

        //安全获取值①
        //如果为空，就把传入的参数设为默认值，否则输出数据
        Author author = authors.orElseGet(() -> new Author(1L, "威仔", 33, "一个从菜刀中明悟哲理的祖安人", null));
        System.out.println(author.getName());

        //安全获取值②
        //如果为空，就抛出一个异常，否则输出数据
        Author aThrow = authors.orElseThrow(() -> new RuntimeException("没有该值"));
        System.out.println(aThrow.getName());

    }

    private static Optional<Author> getAuthors() {
        //数据初始化
        Author author = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
         return Optional.ofNullable(null); //即使返回空，也不会出现空指针异常
         //return Optional.ofNullable(author);
    }

}
