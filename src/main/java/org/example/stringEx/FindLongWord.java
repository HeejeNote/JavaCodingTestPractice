package org.example.stringEx;

import java.util.Scanner;

public class FindLongWord {
    /**
     * Q.한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력 (단어의 기준은 공백)
     * 입력 예시 :::
     * I like to listen to music
     * 출력 예시 :::
     * listen
     * @param str
     * @return 가장 긴 단어
     */
    public String Solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE; // 최소값 설정

        String[] word = str.split(" ");
        
        for(String arrWord : word){
            int len =  arrWord.length();
            if(len > m){
                m = len; // 최소값을 단어 길이로 저장
                answer = arrWord; // 해당 길이의 단어를 answer에 저장
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindLongWord T = new FindLongWord();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(T.Solution(str));

    }
}
