/**
 * @ClassName：Test03
 * @description：
 * @date：2023-04-02 00:33
 */
public class Test03 {
    public static void main(String[] args) {
        int test = test();
        System.out.println(test);
    }
    public static  int test(){
        int a = 10;
        if(a<3){
            return 5;
        }
        for (int i = 0; i < 10; i++) {
            if(i ==5){
                break;
            }
            System.out.println("i = " + i);
        }
        return 7;


    }
}
