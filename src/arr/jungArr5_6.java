package arr;
import java.util.Arrays;
public class jungArr5_6 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};
        int money = 3640;
        System.out.println("money = " + money);
        int[] arr = new int[4];
        int tmp = 0;
        for (int z = 0; z < coinUnit.length; z++) {
            int t = money / coinUnit[z];
            int j = money % coinUnit[z];
            arr[z] = t;
            money = j;
        }
        System.out.println("500원 : " + arr[0]);
        System.out.println("100원 : " + arr[1]);
        System.out.println(" 50원 : " + arr[2]);
        System.out.println(" 10원 : " + arr[3]);
        System.out.println(Arrays.toString(arr));
    }
}




