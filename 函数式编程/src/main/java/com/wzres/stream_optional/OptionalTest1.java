package com.wzres.stream_optional;

import java.util.Optional;

/**
 * @ClassName：OptionalTest1
 * @description：
 * @date：2023-05-05 17:44
 */
public class OptionalTest1 {
    public static void main(String[] args) {
        Author authors = getAuthors();
        Optional<Author> optionalAuthor = Optional.ofNullable(authors);
        //安全消费值
        //ifPresent：如果数据存在就输出，否则不会输出，避免空指针异常
        optionalAuthor.ifPresent(author -> author.getName());
    }

    private static Author getAuthors() {
        //数据初始化
        Author author = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
        return null; //即使返回空，也不会出现空指针异常
    }

}


