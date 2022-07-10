package jogun;

public class IfWhile4_5 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
//            System.out.println("count = " + count);
        }
//        System.out.println("lastCount = " + count);
    }


}



