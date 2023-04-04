import java.util.Scanner;

/**
 * @ClassName：Test01
 * @description：
 * @date：2023-03-31 01:07
 */
public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 6){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.print("请输入布尔值:");
        Scanner s = new Scanner(System.in);
        boolean b = s.nextBoolean();

        String m = m(b);
        System.out.println("m = " + m);
    }

    public static String m(boolean code){
        //return code? "真":"假";
        if(code){
            return "真";
        }
        return "假";
    }
}
