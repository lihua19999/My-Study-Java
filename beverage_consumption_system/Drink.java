package beverage_consumption_system;

/**
 * @author 李文健
 * @ClassName: Drink
 * @Description: 该类是饮品类，是可乐、咖啡、奶茶的父类
 * @date 2022/8/27
 */

public class Drink {
    String name;
    int size;
    String note;
    int num;
    int[] prize = new int[3];

    public  void display(){ //输出订单信息
        String sizeName = "中杯";
        switch (size){
            case 1:sizeName = "中杯";
                break;
            case 2:sizeName = "大杯";
                break;
            case 3:sizeName = "超大杯";
                break;
            default:
                System.out.println("程序在选择饮料大小时出错，请检查程序");
        }
        System.out.println("订单信息：您购买了" + name + ":" + note +"，购买的"  + sizeName +
                "，购买数量"  + num + "杯，价钱：" + prize[size-1] + "*" + num + "=" +prize[size-1]* num);
    }
}
