package com.wzres.stream_optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName：StreamTest4
 * @description：终结操作之查找与匹配
 * @date：2023-05-05 11:44
 */
public class StreamTest4 {

    public static void main(String[] args) {
        test17(); //findAny：获取流中的第一元素
        test16(); //findAny：获取流中的任意一个元素
        test15(); //noneMatch：都不符合条件，结果才为true
        test14(); //allMatch：所有条件都符合，结果才为true
        test13(); //anyMatch：任意符合一个，结果就为true

    }

    private static void test17() {
        //获取一个年龄最小的作家，并输出他的姓名。
        List<Author> authors = getAuthors();
        Optional<Author> optionalAuthor2 = authors.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .findFirst();

        optionalAuthor2.ifPresent(author -> System.out.println(author.getName()));
    }

    private static void test16() {
        // 获取任意一个年龄大于18的作家，如果存在就输出他的名字
        List<Author> authors = getAuthors();
        Optional<Author> optionalAuthor1 = authors.stream()
                .filter(author -> author.getAge() > 18)
                .findAny();
        //ifPresent：如果存在年龄大于18的作家就输出，否则不会输出，避免空指针异常
        optionalAuthor1.ifPresent(author -> System.out.println(author.getName()));

    }

    private static void test15() {
        List<Author> authors = getAuthors();
        boolean flag3 = authors.stream()
                .noneMatch(author -> author.getAge() == 20);
        System.out.println(flag3);
    }

    private static void test14() {
        List<Author> authors = getAuthors();
        boolean flag2 = authors.stream()
                .allMatch(author -> author.getAge()>=18);

        System.out.println(flag2); //false
    }

    private static void test13() {
        List<Author> authors = getAuthors();
        boolean flag1 = authors.stream()
                .anyMatch(author -> author.getAge()>25);


        System.out.println(flag1); //true
    }


    private static List<Author> getAuthors() {
        //数据初始化
        Author author = new Author(1L,"蒙多",33,"一个从菜刀中明悟哲理的祖安人",null);
        Author author2 = new Author(2L,"亚拉索",15,"狂风也追逐不上他的思考速度",null);
        Author author3 = new Author(3L,"易",14,"是这个世界在限制他的思维",null);
        Author author4 = new Author(3L,"易",14,"是这个世界在限制他的思维",null);

        //书籍列表
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L,"刀的两侧是光明与黑暗","哲学,爱情",88,"用一把刀划分了爱恨"));
        books1.add(new Book(2L,"一个人不能死在同一把刀下","个人成长,爱情",99,"讲述如何从失败中明悟真理"));

        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(4L,"吹或不吹","爱情,个人传记",56,"一个哲学家的恋爱观注定很难把他所在的时代理解"));

        books3.add(new Book(5L,"你的剑就是我的剑","爱情",56,"无法想象一个武者能对他的伴侣这么的宽容"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));

        author.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        List<Author> authorList = new ArrayList<>(Arrays.asList(author,author2,author3,author4));
        return authorList;
    }
}
