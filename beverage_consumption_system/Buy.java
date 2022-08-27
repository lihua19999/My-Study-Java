package beverage_consumption_system;
import java.util.Scanner;

/**
 * @author 李文健
 * @ClassName:  Buy
 * @Description:  该类实现自主饮品消费系统的输入和输出功能
 * @date  2022/8/27
 */

public class Buy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int category;
        try {
            System.out.println("请输入你要购买的饮品：1.可乐 2.咖啡 3.奶茶");
            category = sc.nextInt();
        } catch (Exception e) {
            System.out.println("输入非法字符，请重新运行程序输入");
            return;
        }
        if(judgeCate(category)){
            System.out.println("输入非法字符，请重新运行程序输入");
        }

    }

    public static boolean judgeCate(int category){ //判断要购买的饮料的种类
        switch (category){
            case 1:
                getCola();
                return false;
            case 2:
                getCoffee();
                return false;
            case 3:
                getMilkTea();
                return false;
            default:
                return true;
        }
    }

    public static void getCola(){
        System.out.println("请录入你需要的可乐信息：\n备注可口可乐还是百事可乐，是否加冰：");
        choice(1);
    }
    public static void getCoffee(){
        System.out.println("请录入你需要的咖啡信息：\n备注加奶、加冰、加糖情况：");
        choice(2);
    }
    public static void getMilkTea(){
        System.out.println("请录入你需要的奶茶信息：\n备注是否加红豆、椰果、布丁、珍珠：");
        choice(3);
    }

    public static void choice(int category){
        Scanner sc = new Scanner(System.in);
        int size= 0,num = 0;
        String note = sc.nextLine();
        try{
            System.out.println("选择1.中杯 2.大杯 3.超大杯：");
            size = sc.nextInt();
            if(size != 1 && size != 2 && size !=3){
                System.out.println("输入非法字符，请重新运行程序输入");
                return;
            }
            System.out.println("购买数量：");
            num = sc.nextInt();
        }catch (Exception e) {
            System.out.println("输入非法字符，请重新运行程序输入");
        }
        MixingDrinks mix = new MixingDrinks();
        mix.mixing(category,size,note,num);//在工厂类MixingDrinks中完成订单信息输出
    }
}
