package arr;

public class jungArr5_5 {
    public static void main(String[] args) {

        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;
            while (ball3.length > 3) {
                for (int k = 0; k < ball3.length; k++) {
                    if (ball3[k] == j) {
                        break;
                    } else if (ball3[k] != j) {
                        ball3[k] = j;
                    }
                }
            }
        }
        for (int k = 0; k < ball3.length; k++) {
            System.out.print(ball3[k]);
        }


    }
}




