package org.example.stringEx;

import java.util.Arrays;
import java.util.Scanner;

public class FindChar {
    /**
     * Q. 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
     * 입력 예시 :::
     * studyCafe
     * s
     * 출력 예시 :::
     * 1
     * @param str
     * @param c
     * @return 문자의 개수
     */


    public int solution(String str, char c){
        int answer = 0;

        // 대소문자 구별을 없애기 위해 대문자화
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){ // 지정한 문자와 for문 순회하면서 같은값인지 비교
                answer++;
            }
        }

        return answer;
    }
    
    public static void main(String[] args){
        FindChar T = new FindChar();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(T.solution(str, c));

    }
}
