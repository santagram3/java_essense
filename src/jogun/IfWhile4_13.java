package jogun;
public class IfWhile4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' '; char x = '1'; char y = '2';
        boolean isNumber = true;
        for (int i = 0; i < value.length(); i++) {
            char c1 = value.charAt(i);
//            System.out.println("c1 = " + c1); // 문자로 하나씩 잘 띄어진다
            int c2 = value.charAt(i) - '0'; // 문자를 숫자로 바꿔서 계산을 해본다
//            System.out.println(x-y); // 은 -1이 나온다
            // 여기서 알수있는점은
            // 문자로된 숫자는 /charAt() - '0' 이런 공식을 사용 하면 숫자로 계산이 된다는점이고
            //말 그대로 문자가 나온다면 아스키코드로 변환이 되기때문에
            //문자가 나온다면 그 값은 무조건 10을 넘게 된다.
            if (c2 > 10) {
                isNumber = false;
            }
        }
        if (isNumber) {
            System.out.println(value + " 는 숫자입니다.");
        } else if (!isNumber) {
            System.out.println(value + " 는 숫자가 아닙니다.");
        }
    }
}






