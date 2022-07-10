package jogun;

public class IfWhile4_10 {

    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        System.out.println("num = " + num);
        while (num > 0) {
            sum += num % 10; //num % 10 = 원래숫자에서 10으로 나눈 나머지 = 1의자리 숫자 !
            num /= 10; // 위에서 나머지룰 구했으니 10으로 나눠서 자리수를 낮춰준다
            // 여기서 중요한점은 int 는 10으로 나눠도 소숫점은 안나온다는 점이다
            System.out.println("num = " + num); // 10으로 나눴을때 num 이 어떻게 보면 될것같다
        }
        System.out.println("sum = " + sum);
    }

}






