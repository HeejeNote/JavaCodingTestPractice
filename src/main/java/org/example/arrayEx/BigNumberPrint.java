package org.example.arrayEx;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNumberPrint {
    /**
     *  Q. N(1<=N<=100)개의 정수를 입력 받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성
     *  (첫 번째 수는 무조건 출력)
     * 입력 예시 :::
     * 6
     * 7 3 9 5 6 12
     * 출력 예시 :::
     * 7 9 6 12
     */

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] < arr [i]){
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BigNumberPrint T = new BigNumberPrint();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }

}
