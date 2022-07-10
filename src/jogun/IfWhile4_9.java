package jogun;

public class IfWhile4_9 {

    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int t = str.charAt(i) - '0'; // 숫자로 변환
            System.out.println("t = " + t); // 숫자가 잘 쪼개졌는지 프린트
            sum+= t; // 쪼갠 숫자를 sum에 더하기
        }
        System.out.println("sum = " + sum); // sum 출력하기
    }

}






