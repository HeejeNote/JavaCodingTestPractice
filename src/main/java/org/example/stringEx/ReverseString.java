package org.example.stringEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

    /**
     * Q. N개의 단어가 주어지면 각 단어를 뒤집어서 출력
     * 입력 예시 :::
     * 4
     * my
     * name
     * is
     * kim
     * 출력 예시 :::
     * ym
     * eman
     * si
     * mik
     * @param num
     * @param str
     * @return
     */
    public ArrayList<String> Solution(int num, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        /**
         * StringBuilder로 뒤집기
            for(int i = 0; i < str.length; i++){
                StringBuilder reversed = new StringBuilder(str[i]).reverse();
                answer.add(String.valueOf(reversed));
            }
         */

        for(String word : str){
            char[] wordArr = word.toCharArray(); //
            int lt = 0; // 첫번째 인덱스
            int rt = word.length() - 1; // 마지막 인덱스

            while(lt < rt){ // lt 값과 rt값이 같아지거나(홀수) rt값이 커지면(짝수) 빠져나옴.
                char temp = wordArr[lt];
                wordArr[lt] = wordArr[rt];
                wordArr[rt] = temp;
                lt++; // >> 오른쪽으로 인덱스 증가
                rt--; // << 왼쪽으로 인덱스 증가
            }
            String tmp = String.valueOf(wordArr); // 문자열로 변환해서 tmp에 저장
            answer.add(tmp); // 리스트에 담는다.
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseString T = new ReverseString();
        Scanner sc = new Scanner(System.in);
        // num >= 3 , num <= 20
        int num = sc.nextInt();

        if (num < 3 || num > 20) {
            System.out.println("3~20 사이의 값을 입력해 주세요.");
            return;
        }

        String[] str= new String[num];

        for(int i = 0; i < num; i++){
            str[i] = sc.next();
            System.out.println("str[" + i + "] = " + str[i]);
        }

        for(String result : T.Solution(num,str)){
            System.out.println(result);
        }

    }

}
