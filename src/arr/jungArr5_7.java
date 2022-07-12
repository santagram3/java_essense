package arr;

import java.util.Arrays;

public class jungArr5_7 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};
        int[] arr = {5, 5, 5, 5};
        int money = 3170;
        int total = 3300;

        System.out.println("money = " + money);

            for (int z = 0; z < coinUnit.length; z++) {
                int coinNum = 0;
                int i2 = money / coinUnit[z];
                if (arr[z]>i2){
                    arr[z] -=i2;
                }else {
                    arr[z] = 0;
                }



            }
        }




    }





