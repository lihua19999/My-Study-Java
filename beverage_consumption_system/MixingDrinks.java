package beverage_consumption_system;

/**
 * @author 李文健
 * @ClassName: MixingDrinks
 * @Description: 该类是一个简易工厂类，用于制作饮料
 * @date 2022/8/27
 */

public class MixingDrinks {
    public void mixing(int category,int size,String note,int num){ //制作饮料
        switch (category){
            case 1:Cola cola = new Cola();
                cola.size = size;
                cola.num = num;
                cola.note = note;
                cola.display();
                break;
            case 2:Coffee coffee = new Coffee();
                coffee.size = size;
                coffee.num = num;
                coffee.note = note;
                coffee.display();
                break;
            case 3:MilkTea milkTea = new MilkTea();
                milkTea.size = size;
                milkTea.num = num;
                milkTea.note = note;
                milkTea.display();
                break;
        }
    }

}
