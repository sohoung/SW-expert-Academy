package D1;
import java.util.Scanner;

// 설명 : 신문의 헤드라인을 편집하기 위해, 주어지는 문자열의 알파벳 소문자를 모두 대문자로 바꾸는 프로그램을 개발 중이다.
//       입력으로 주어진 문장에 모든 소문자 알파벳을 찾아 대문자로 변환한 다음, 그 결과를 출력하는 프로그램을 작성하라.
// 입력 예시 : The_headline_is_the_text_indicating_the_nature_of_the_article_below_it.
// 출력 에시 : THE_HEADLINE_IS_THE_TEXT_INDICATING_THE_NATURE_OF_THE_ARTICLE_BELOW_IT.
public class 신문헤드라인 {
    public static void main(String[] args) {
        신문헤드라인  m = new 신문헤드라인();
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();   //char형 변수 c를 입력하자마자 char형 배열 생성
        for(char c : ch) {  // 향상된 for문으로
            if(Character.isLowerCase(c)) {  // 만약 char형 배열 안에 있는 변수 c가 소문자인 경우
                System.out.print(Character.toUpperCase(c));  // upUpperCase로 대문자로 변환해주고
            }
            else {  // 소문자가 아닌경우
                System.out.print(c);  // 그대로 출력
            }
        }
    }
}
