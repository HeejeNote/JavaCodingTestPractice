package org.example.arrayEx;

public class ReverseNumber {

    /**
     * 문제 설명
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     *
     * 제한 조건
     * n은 10,000,000,000이하인 자연수입니다.
     * 입출력 예
     * n	return
     * 12345	[5,4,3,2,1]
     */

    public int[] solution(long n) {

        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        int i = 0;
        while (n > 0) {
            answer[i] = (int)(n % 10); // 마지막 자릿수 추출 (예: 12345 -> 5)
            System.out.println("answer[i] = " + answer[i]);
            n /= 10;                  // 마지막 자릿수 제거 (예: 12345 -> 1234)
            System.out.println("i = " + i);
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {

        ReverseNumber T = new ReverseNumber();
        long input = 12345;

        T.solution(input);

    }

}
