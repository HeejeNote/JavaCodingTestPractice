package org.example.stringEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeString {
    /**
     * Q.(회문문자열검증)앞에서 읽을때나 뒤에서 읽을때 같은 문자열이면 YES 아니면 NO 출력 (대소문자 구분 X)
     * 입력 예시 :::
     * found7, time: study; Yduts; emit, 7Dnuof
     * 출력 예시 :::
     * YES
     * @param str
     * @return YES || NO
     */
    public String Solution(String str) {

        /**
         * SOL 1 ::: 문제 이해를 잘못해서 공백이 필수로 입력 되는 줄 알고 공백을 기준으로 리스트를 만들어서 풀이.
         */
        /*
        str = str.toUpperCase();
        String reg = "[^A-Z ]"; // 알파벳대문자, 공백 이외 모두 제거
        String[] strArr =  str.split(" "); // 공백으로 잘라서 배열에 담음

        List<String> strList = new ArrayList<>(); // 공백으로 구분한 전체 리스트
        List<String> front = new ArrayList<>(); // 전체 리스트 /2 앞부분 리스트
        List<String> back = new ArrayList<>(); // 전체 리스트 /2 뒷부분 리스트

        for(String result : strArr){
            String re = result.replaceAll(reg, ""); //
            strList.add(re);
            System.out.println("re = " + re);
        }
        // found time study yduts emit dnuof
        System.out.println("strList = " + strList.size());


        for (int i = 0; i <= strList.size() - 1; i++) {
            if (i < (strList.size() / 2)) {
                front.add(strList.get(i));
            } else {
                back.add(strList.get(i));
            }
        }

        // back.size() = 3   // 0 1 2
        for(int i = 0; i <= back.size() - 1; i++){
            char[] wordArr = back.get(i).toCharArray();

//            for(char w : wordArr){
//                System.out.println("w = " + w);
//            }

            int lt = 0;
            int rt = back.get(i).length() -1;

            while(lt < rt){
                char temp = wordArr[lt];
                wordArr[lt] = wordArr[rt];
                wordArr[rt] = temp;

                lt ++;
                rt --;
            }
            String tmp = String.valueOf(wordArr); // 문자열로 변환해서 tmp에 저장
            front.add(tmp); // 리스트에 담는다.
        }

//        front.forEach(e -> {
//            System.out.println("e = " + e);
//        });

        int ltArr = 0;
        int rtArr = front.size() - 1;
        String answer = "YES";
        while(ltArr < rtArr){
            if(!front.get(ltArr).equals(front.get(rtArr))){
                answer = "No";
            }

            ltArr ++;
            rtArr --;
        }

        return answer;
        */

        /**
         * SOL 2 ::: 공백을 기준으로 하지 않고 전체 문자열을 비교
         */
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 알파벳 빼고 모두 제거
        System.out.println("str = " + str);
        String tmp = new StringBuilder(str).reverse().toString(); // 문자열 리버스
        System.out.println("tmp = " + tmp);

        if(str.equals(tmp)){ // 비교해서 같으면
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        PalindromeString T = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.length() > 100) {
            System.out.println("문자열의 길이는 100을 넘지 않습니다.");
            return;
        }

        System.out.println(T.Solution(str));

    }
}
