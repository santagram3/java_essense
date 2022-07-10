package jogun;

public class IfWhile4_6 {

    public static void main(String[] args) {
            int sum = 0;
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                if ((i+j)==6){
                    System.out.printf("[i = %d ,j = %d] | %d + %d = 6 \n",i ,j ,i ,j);
                }
            }
        }
    }
}
