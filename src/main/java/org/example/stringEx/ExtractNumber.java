package org.example.stringEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumber {
    /**
     * Q. 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만든다.
     *    단 처음 자연수가 0 이면 생략한다.
     * 입력 예시 :::
     * g0en2T0s8eSoft
     * 출력 예시 :::
     * 208
     * @param str
     * @return 자연수만 출력
     */
    public int Solution(String str){


        /**
         * SOL1 ::: 문자열에서 알파벳 제거후 숫자 문자열 비교
         * return String
         */
//        String answer = "";
//
//        str = str.toUpperCase();
//        String reg = "[a-zA-Z]";
//        String re = str.replaceAll(reg,"");
//        System.out.println("re = " + re);
//
//        if(re.charAt(0) == '0'){
//            String newStr = re.substring(1); // 0으로 시작하면 두번째 문자부터 시작하는 문자열 저장
//
//            answer = newStr;
//        }
//
//        return answer;

        /**
         * SOL2 ::: 아스키코드로 자연수 추출
         * return int
         */
        // '0' : 48
        // '9' : 57
        // X >= 48 && X <= 57
        // answer = answer * 10 + ( x - 48 )   0의 경우 0
        //    0 * 10 + (48-48)  = 0
        //    0 * 10 + (49-48) = 1
        //    1 * 10 + (50-48) = 12
        //    12 * 10 + (51-48) =123

        // g0en2T0s8eSoft
//        int answer = 0;
//        for(char x : str.toCharArray()){
//            if(x >= 48 && x <= 57){
//                answer = answer * 10 + (x - 48);
//            }
//        }
//
//        return answer;

        /**
         * Character.isDigit 활용
         * return int
         */
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){ // 숫자인지 판별 후에 숫자를 문자열 더하기
                answer += x;
            }
        }
        return Integer.parseInt(answer); // 숫자로 형변환
    }

    public static void main(String[] args) {
        ExtractNumber T = new ExtractNumber();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String regex = "^[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if(!matcher.matches()){ // 알파벳과 숫자가 아니면
            System.out.println("알파벳과 숫자만 입력해 주세요.");
        }else if(str.length() > 100){
            System.out.println("문자열의 길이는 100을 넘지 않습니다.");
        }

        System.out.println(T.Solution(str));

    }
}
