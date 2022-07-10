package arr;
public class jungArr5_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합
        int length = 0;
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            length += arr[i].length;
        }
        System.out.println("length = " + length); //배열 안에 들어있는 숫자의 갯수
        System.out.println("총 합은 : " + sum); // 합 325 이다
        System.out.println("모든 값의 평균은 : " + sum/length); //16
        System.out.println("모든 값의 평균은 : " + (float)sum/length);
        System.out.println("모든 값의 평균은 : " + (double)sum/length);
    }
}




