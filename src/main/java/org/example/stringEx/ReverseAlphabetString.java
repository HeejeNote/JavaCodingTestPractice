package org.example.stringEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseAlphabetString {

    /**
     * Q. 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고 특수문자는 그 자리에 두고 출력
     * 입력 예시 :::
     * a#b!GE*T@S
     * 출력 예시 :::
     * S#T!EG*b@a
     * @return
     */
    public String Solution(String str){
        String answer = "";
        char[] wordArr = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt){
            if(!Character.isAlphabetic(wordArr[lt])){
                lt++; // 특수문자이면 lt ++
            }else if(!Character.isAlphabetic(wordArr[rt])){
                rt--; // 특수문자이면 rt ++
            }else{ // 특수문자가 아니면 뒤집기
                char temp = wordArr[lt];
                wordArr[lt] = wordArr[rt];
                wordArr[rt] = temp;
                lt++;
                rt--;
            }

        }
        answer= String.valueOf(wordArr);

        return answer;
    }

    public static void main(String[] args) {
        ReverseAlphabetString T = new ReverseAlphabetString();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.length() > 100){
            System.out.println("100자 이하로 입력하세요.");
            return;
        }

        System.out.println(T.Solution(str));

    }
}
