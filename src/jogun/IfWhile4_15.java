package jogun;
public class IfWhile4_15 {
    public static void main(String[] args) {
        int number = 123321;
        int tmp = number;
        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
        String s = "";
//        System.out.println("tmp = " + tmp);
        while (tmp>0){
            int i = tmp % 10;
            s += i;
            tmp /= 10;
//            System.out.println("tmp = " + tmp);
        }
        int ss = Integer.parseInt(s);
//        System.out.println(ss);
        System.out.println("number = " + number);
        if (number == ss){
            System.out.println(number + " 는 회문수 입니다.");
        }else {
            System.out.println(number + " 는 회문수가 아닙니다.");
        }

    }
}






