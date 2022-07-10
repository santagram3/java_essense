package jogun;

public class IfWhile4_2 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            if (!((i % 2 == 0) || (i % 3 == 0))) {
                System.out.print(i + " ");
                count += i;
            }
        }
        System.out.println("\n=============");
        System.out.println("count = " + count);


    }

}
