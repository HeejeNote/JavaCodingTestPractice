package org.example.stringEx;

import java.util.Scanner;

public class DuplicateCharRemove {
    /**
     * Q.소문자로 된 한개으 ㅣㅜㅁㄴ자열이 입력되면 중복된 문자를 제거하고 출력
     * 입력 예시 :::
     * ksekkset
     * 출력 예시 :::
     * kset
     * @param str
     * @return 중복제거된 문자열
     */
    public String Solution(String str){
        String answer = "";

        for(int i = 0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DuplicateCharRemove T = new DuplicateCharRemove();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(T.Solution(str));
    }
}
