/**
 * @ClassName：Test02
 * @description：
 * @date：2023-03-31 01:07
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 20;
        for (int i = a; i > 0; i--) {
            if(i == 5){
                break;
            }
            System.out.println("i = " + i);
        }

        boolean m = m();
        System.out.println("m = " + m);
    }

    public static boolean m(){
        boolean s = true;
        if(s){
            return true;
        }
        return false;
    }
}
