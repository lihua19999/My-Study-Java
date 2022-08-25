import java.util.Random;
import java.util.Arrays;

public class GreyBough {
    public static void main(String[] args) {
        System.out.println("模拟开始了！");
        double exp;
        exp = Simulation();
        System.out.println("经模拟得到的数学期望为" + exp);
    }
    public static double Simulation(){ //模拟过程
        double result;
        boolean[] A = new boolean[7]; //确认该位置上是否有格雷布存活
        int[] B = new int[7]; //该位置上的格雷布身上被寄生了几个格雷布
        int[] allResult = new int[10000];
        for(int i = 0;i<10000;i++){
            for(int i1 = 0;i1 < 7;i1++){ //初始化A和B数组
                A[i1] = true;
            }
            for(int i2 = 0;i2 < 7;i2++){
                B[i2] = 0;
            }
            int counter1 = 0;
            while(true){
                int kill = Min(A,B); //选择杀掉哪只格雷布
                A[kill] = false; //表示该位置上没有格雷布
                int aliveNum = LiveNum(A); //统计有多少只活着的格雷布
                if(Judge(B) && aliveNum == 0){
                    counter1++;
                    break;
                }
                if(aliveNum > 0){
                    Random ra = new Random(); //死亡的格雷布随机寄生到一只活着的格雷布身上
                    int j = ra.nextInt(aliveNum);
                    int temp1 = 0;
                    for(int k = 0;k < 7;k++){
                        if(temp1 == j && A[k]){
                            B[k]++;
                            break;
                        }
                        if(A[k]){
                            temp1++;
                        }
                    }
                }

                int temp2 = 0;
                int temp3 = B[kill];
                for(int l = 0;l < 7;l++){ //复活寄生的格雷布
                    if(temp2 == temp3){
                        break;
                    }
                    if(!A[l]){
                        A[l] = true;
                        B[l] = 0;
                        temp2++;
                    }
                }
                B[kill] = 0;
                counter1++;
           /*     System.out.println(counter1);
                System.out.println(Arrays.toString(A));
                System.out.println(Arrays.toString(B));*/
                if(counter1 >= 100){
                    System.exit(0);
                }
            }
            allResult[i] = counter1;
            System.out.println("当前为第" + i + "次模拟，使用了" + counter1 + "次");
        }
        int sum = 0;
        for(int i = 0;i < 10000;i++){
            sum += allResult[i];
        }
        result = sum / 10000.0;
        return result;
    }
    public static boolean Judge(int[] A){
        boolean result1 = true;
        for(int i = 0;i < 7; i++){
            if(A[i] != 0){
                result1 = false;
                break;
            }
        }
        return result1;
    }
    public static int Min(boolean[] A,int[] B){ //选择杀掉哪只格雷布
        int result2 = -1;
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if(B[j] == i && A[j]){
                    result2 = j;
                    break;
                }
            }
            if(result2 >= 0){
                if(B[result2] == i){
                    break;
                }
            }

        }
        return result2;
    }

    public static int LiveNum(boolean[] A){
        int result3 = 0;
        for(int i = 0; i < 7;i++){
            if(A[i]){
                result3++;
            }
        }
        return result3;
    }
}

