package D1;
import java.util.Scanner;

public class 거꾸로출력 {
    public static void main(String[] args) {
        거꾸로출력  m = new 거꾸로출력();
        Scanner sc = new Scanner((System.in));
        int n =sc.nextInt();
        for(int i = n; i >= 0; i--) {
            System.out.print(i+ " ");
        }
    }
}
