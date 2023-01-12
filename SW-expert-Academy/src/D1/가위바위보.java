package D1;
import java.util.Scanner;

// 설명 : A와 B가 가위바위보를 하였다.
//       가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.
//       A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.
public class 가위바위보 {
    public static void main(String[] args) {
        가위바위보  m = new 가위바위보();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // A가 낸 가위바위보
        int k = sc.nextInt(); // B가 낸 가위바위보
        if(n == 3 && k == 2) {
            System.out.println("A");
        }
        else if(n == 2 && k == 1) {
            System.out.println("A");
        }
        else if(n == 1 && k == 3) {
            System.out.println("A");
        }
        else if(n == k) {
            System.out.println("re start");
        }
        else {
            System.out.println("B");
        }
    }
}
