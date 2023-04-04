/**
 * @ClassName：CommodityTest
 * @description：
 * @date：2023-04-02 01:23
 */
public class CommodityTest {
    public static void main(String[] args) {
        Commodity commodity = new Commodity();
        commodity.setNumber(110);
        commodity.setName("相机");
        commodity.setPrice(5.12);
        //输出一个对象的引用会自动调用toString方法，类简名@内存地址
        System.out.println(commodity);

        //==，当比较引用类型，默认比较它们的内存地址，equals，这是obj的一个，专门用于对象比较，但是obj的equals方法比较的也是对象内存地址

        Commodity commodity1 = new Commodity(110,"相机",5.12);
        System.out.println(commodity==commodity1);//false，new了两次，内存地址不一样

        //我们应该比较两个对象的内容;
        System.out.println(commodity.equals(commodity1));

        //重写后，两个对象的内容相等，所以是true
        System.out.println(commodity.equals(commodity1));
    }
}
