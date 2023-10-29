package org.example.arrayEx;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence {
    /**
     * Q.피보나치 수열 출력. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
     *   입력은 피보나치 수열의 총 항의수. 7이 입력되면 1 1 2 3 5 8 13 출력
     * 입력 설명 :::
     * 첫 줄에 총 항수 N(3<=N<=45)이 입력
     * 출력 설명 :::
     * 첫 줄에 피보나치 수열을 출력
     * 입력 예시 :::
     * 10
     * 출력 예시 :::
     * 1 1 2 3 5 8 13 21 34 55
     */

    // Array 사용
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    /*
    // ArrayList 사용
    public ArrayList<Integer> solution(int n) {

        ArrayList<Integer> answer = new ArrayList<>();
        int front = 1;
        int back = 1;
        int temp = 0;

        answer.add(front);
        answer.add(back);

        for(int i = 2; i < n; i++){
            temp = front + back;
            front = back;
            back = temp;
            answer.add(back);
        }


        return answer;
    }
    */
    
    public static void main(String[] args) {
        FibonacciSequence T = new FibonacciSequence();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Array 사용
        for(int x : T.solution(n)){
            System.out.print(x + " ");
        }

    }

}
