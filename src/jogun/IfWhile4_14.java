package jogun;
import java.util.Scanner;
public class IfWhile4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = (int) (Math.random() * 100);
//        System.out.println(i);
        int count = 0;
        while (true) {
            System.out.println("\n숫자를 입력하세요 ");
            System.out.print(">>>");
            int win = sc.nextInt();
            count++;
            if (i == win) {
                System.out.printf(" 당신이 입력한 숫자는 : %d입니다.\n",win);
                System.out.printf(" 정답은 : %d 이었습니다 . 맞추기까지 총 횟수는 : %d 번입니다.  ", i, count);
                return;
            } else if (i > win) {
                System.out.printf(" 당신이 입력한 숫자는 : %d입니다.\n",win);
                System.out.printf("더 큰 숫자를 입력해주세요 ");
            } else if (i < win) {
                System.out.printf(" 당신이 입력한 숫자는 : %d입니다.\n",win);
                System.out.printf("더 작은 숫자를 입력해주세요");

            }
        }

    }
}






