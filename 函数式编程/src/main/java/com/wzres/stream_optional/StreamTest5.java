package com.wzres.stream_optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName：SteamTest5
 * @description：终结操作之reduce归并
 * @date：2023-05-05 16:38
 */
public class StreamTest5 {
    public static void main(String[] args) {

        //reduce归并：对流中的数据按照你指定的计算方式计算出一个结果。（缩减操作）
        //一种参数：不需要设置初始值，初始值默认为流中的第一个元素
        test21();// 使用reduce求所有作者中年龄的最小值

        // 两种参数：需要设置初始值
        test20(); // 使用reduce求所有作者中年龄的最小值
        test19(); // 使用reduce求所有作者中年龄的最大值
        test18(); // 使用reduce求所有作者年龄的和

        //总结，两个参数与一个参数，就是少了一个初始化值，返回值也不一样，计算方式自己定义

        
    }

    private static void test21() {
        List<Author> authors = getAuthors();
        Optional<Integer> optionalInteger = authors.stream()
                .map(author -> author.getAge())
                .reduce((result, element) -> result > element ? element : result);

        optionalInteger.ifPresent(age-> System.out.println(age));
    }

    private static void test20() {
        List<Author> authors = getAuthors();
        Integer min = authors.stream()
                .map(author -> author.getAge())
                .reduce(Integer.MAX_VALUE, (result, element) -> result > element ? element : result);
        System.out.println(min);
    }

    private static void test19() {
        List<Author> authors = getAuthors();
        Integer max = authors.stream()
                .map(author -> author.getAge())
                .reduce(Integer.MIN_VALUE, (result, element) -> result < element ? element : result);
        System.out.println(max);
    }

    private static void test18() {
        List<Author> authors = getAuthors();
        Integer sum = authors.stream()
                .map(author -> author.getAge())
                .distinct()
                .reduce(0, (result, element) -> result + element);
        System.out.println(sum);
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
