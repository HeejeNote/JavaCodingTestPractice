package org.example.arrayEx;

import java.util.Scanner;

public class VisibleStudent {

    /**
     * Q. 첫 줄에 정수 N(5<=N<=100,000)이 입력된다.
     *    그 다음 줄에 N명의 키가 앞에서부터 순서대로 주어진다.
     * 입력 예시 :::
     * 8
     * 130 135 148 140 145 150 150 153
     * 출력 예시 :::
     * 5
     */

    public int solution(int n ,int[] arr){

        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        VisibleStudent T = new VisibleStudent();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));

    }

}
