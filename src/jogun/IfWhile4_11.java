package jogun;

public class IfWhile4_11 {

    public static void main(String[] args) {
        int num1 = 1 ;
        int num2 = 1 ;
        int num3 = 0;
        int count = 0;

        for (int i = 0; i <8 ; i++) {
            num3 = num2+num1; // 1.
            System.out.print(" "+num3);
            num1= num2; // 2.
            num2= num3; // 3.
        }
        System.out.println("\nnum3 = " + num3);



    }

}






