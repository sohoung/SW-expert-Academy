package D1;
import java.util.Scanner;

// 설명 : 알파벳으로 이루어진 문자를 입력받 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력하라
// 입력 예시 : ABCDEFGHIJKLMNOPQRSTUVWXYZ
// 출력 예시 : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
// 아스키 코드 : A - Z  = 65 ~ 90
//            a - z = 97 ~ 122

public class 알파벳을숫자로 {
    public static void main(String[] args) {
        알파벳을숫자로  m = new 알파벳을숫자로();
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();  // 문자를 입력하자마자 toCharArray로 배열 문자에 대한 배열 생성
        for(char x : ch) {  // 향상된 for문으로 char형 배열 ch에 있는 데이터 하나하나 대입
            System.out.print((x - 64 + " "));  // 아스키 넘버를 이용해서 65가 대문자 A이기 때문에 64를 빼주면 출력조건에 맞는 출력 형태가 나온다.
        }
    }
}
