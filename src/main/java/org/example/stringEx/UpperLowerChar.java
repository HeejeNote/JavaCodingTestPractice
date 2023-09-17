package org.example.stringEx;

import java.util.Scanner;

public class UpperLowerChar {

    /**
     * Q.대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력
     * 입력 예시 :::
     * BananaBoat
     * 출력 예시 :::
     * bANANAbOAT
     *
     * @param str
     * @return 대소문자 변환된 문자열
     */
    public StringBuilder Solution(String str) {
        StringBuilder answer = new StringBuilder();

        char[] c = str.toCharArray(); // 문자열을 문자 배열로 저장

        for (char ch : c) { // 문자값 하나씩 순회하며 비교
            if (Character.isUpperCase(ch)) { // 대문자이면
                ch = Character.toLowerCase(ch); // 소문자로 변환
            } else {
                ch = Character.toUpperCase(ch); // 대문자로 변환
            }
            answer.append(ch);
        }

        return answer;
    }

    public static void main(String[] args) {
        UpperLowerChar T = new UpperLowerChar();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(T.Solution(str));


    }
}
