package D1;
import java.util.Arrays;
import java.util.Scanner;

// 설명 :중간값은 통계 집단의 수치를 크기 순으로 배열 했을 때 전체의 중앙에 위치하는 수치를 뜻한다. 입력으로 N 개의 점수가 주어졌을 때, 중간값을 출력하라.
// 출력 예시 : 58
public class 중간값구하기 {
    public static void main(String[] args) {
        중간값구하기  m = new 중간값구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];  // n개의 수를 저장할 배열
        int mid = 0;    // 출력을 위한 int형 변수 mid 생성
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();  // for문으로 arr 배열에 값 입력
        }
        Arrays.sort(arr);  // arr 배열을 오름차순으로 정렬
        mid = arr[n/2];  // arr을 오름차순으로 정렬하였으므로 중간값은 arr 배열 갯수를 2로 나눈 인덱스 지점의 값에 있다.
        System.out.println(mid);
    }
}
