package D1;

import java.util.Scanner;

// 설명 : 계산기
public class 계산기 {
    public static void main(String[] args) {
        계산기 m = new 계산기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(n + k);
        System.out.println(n - k);
        System.out.println(n * k);
        System.out.println(n / k);

    }
}
