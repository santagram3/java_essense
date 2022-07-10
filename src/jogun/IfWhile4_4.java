package jogun;

public class IfWhile4_4 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 300; i++) {
            if (i % 2 == 0) {
                sum -= i;
                System.out.println("짝수 : " + -i);
            } else {
                sum += i;
                System.out.println("홀수 : " + i);
            }
            System.out.println("sum = " + sum);
            if (sum >= 100) {
                System.out.println("=================");
                System.out.println("i = " + i);
                System.out.println("=================");
                return;
            }
        }

    }

}
