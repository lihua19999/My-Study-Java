/**
 * @ClassName: ${Annotation}
 * @Description:这个类是为了练习相关注释要求而写的，没有实际功能
 * @author ${liwenjian}
 * @data ${2022/8/24}
 */

public class Annotation {
    public static void main(String[] args) {
        System.out.println("这是一段练习注释要求的代码"); //输出该段代码的说明
        int result = addition(1,2); //进行加法运算
        System.out.println("1 + 2 的结果是" + result); //输出运算结果
    }

    /**
     * @Title: ${addition}
     * @Package ${Annotation}
     * @Description: 这个方法的功能是接收两个加数，然后返回两者之和
     * @author ${liwenjian}
     * @data ${2022/8/24}
     * @param a 第一个加数
     * @param b 第二个加数
     * @return 两个加数的和
     */
    public static int addition(int a,int b){
        int c = a + b; //执行加法运算
        return c;
    }
}
