package jogun;

public class IfWhile4_3 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        String sums = "";
        String counts = "";
        for (int i = 1; i <=10 ; i++) {
            sum += i;
            count += sum;
            sums += i+"+";
            counts += sum+"+";
        }
        System.out.println("sums = " + sums);
        System.out.println("counts = " + counts);
        System.out.println("count = " + count);
    }

}
