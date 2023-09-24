package org.example.stringEx;

import org.example.Main;

import java.util.Scanner;

public class StringDistance {
    /**
     * Q. 한개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력
     * 입력 예시 ::: 첫번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어진다. 문자열 길이는 100을 넘지 X
     * teachermode e
     * 출력 예시 ::: 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력
     * 1 0 1 2 1 0 1 2 2 1 0
     * @param str
     * @return
     */
    public int[] Solution(String str, char c){
        int[] answer = new int[str.length()];

        int p = 1000;
        for(int i = 0; i < str.length(); i++){ // 오른쪽으로 순회

            if(str.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = str.length()-1; i >= 0; i--){ // 왼쪽으로 순회

            if(str.charAt(i) == c){
                p = 0;
            }else {
                p++;
                answer[i] = Math.min(answer[i], p); // 왼쪽 오른쪽 순회한 것중에 비교하여 작은수를 저장
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringDistance T = new StringDistance();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        if(str.length() > 100){
            System.out.println("문자열의 길이는 100을 넘지 않습니다.");
            return;
        }

        for(int x : T.Solution(str, c)){
            System.out.print(x + " ");
        }


    }
}
