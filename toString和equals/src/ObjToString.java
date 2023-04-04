/**
 * @ClassName：ObjToString
 * @description：toString
 * @date：2023-03-29 06:06
 */
public class ObjToString {
    public static void main(String[] args) {
        ObjToString objToString = new ObjToString();
        System.out.println(objToString.toString());//ObjToString@1b6d3586
        System.out.println(objToString);//ObjToString@1b6d3586
        // 结论：输出一个引用的时候，会自动调用toString方法
    }
}
