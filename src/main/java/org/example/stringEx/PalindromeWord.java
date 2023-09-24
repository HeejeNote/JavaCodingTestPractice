package org.example.stringEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeWord {
    /**
     * Q.(회문문자열검증)앞에서 읽을때나 뒤에서 읽을때 같은 문자열이면 YES 아니면 NO 출력 (대소문자 구분 X)
     * 입력 예시 :::
     * gooG
     * 출력 예시 :::
     * YES
     * @param str
     * @return YES || NO
     */
    public String Solution(String str){
        /**
         * Sol 1
         */

        /*
        String answer = "";

        // 대소문자 구분없애기 위해 문자열을 대문자로 치환
        str = str.toUpperCase();

        // 앞에서부터 문자열과 뒤에서 문자열이 같은지를 비교
        char[] wordArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        List<String> arrList = new ArrayList();

        while(lt < rt){
            if(wordArr[lt] == wordArr[rt]){
                arrList.add("YES");
            }else{
                arrList.add("NO");
            }
            lt++;
            rt--;
        }

        // 같으면 YES를 다름녀 NO를 answer에 반환

        for(String e : arrList){
            if(e.equals("YES")){
                answer = "YES";
            }else{
                answer = "NO";
                break;
            }
        }

        return answer;
         */

        /**
         * SOL 2
         */
        String answer = "YES";
        int len = str.length();

        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len -i -1)){
                System.out.println("i no= " + i);
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PalindromeWord T = new PalindromeWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if(!matcher.matches()){
            System.out.println("영어 알파벳만 입력해주세요.");
            return;
        }else if(str.contains(" ")) {
            System.out.println("공백은 입력하실 수 없습니다.");
            return;
        }else if (str.length() > 100) {
            System.out.println("문자열의 길이는 100을 넘지 않습니다.");
            return;
        }


        System.out.println(T.Solution(str));

    }
}
