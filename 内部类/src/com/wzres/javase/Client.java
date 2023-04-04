package com.wzres.javase;

/**
 * @ClassName：Shop
 * @description：引出匿名内部类：写法二
 * @date：2023-03-24 23:09
 */
public class Client {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.myShop(new Commodity(){
            @Override
            public void doPurchase(String name, String goods) {
                System.out.println(name+"正在购买"+goods);
            }
        },"张三","圆珠笔");
    }
}

interface Commodity{
    void doPurchase(String name,String goods);

}

/*class CommodityImpl implements Commodity{

    @Override
    public void doPurchase(String name, String goods) {
        System.out.println(name+"正在购买"+goods+"商品...");
    }
}*/



class Shop{
    public void  myShop(Commodity c,String name,String goods){
        c.doPurchase("张三", "水果");
    }
}

