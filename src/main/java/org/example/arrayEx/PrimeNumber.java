package org.example.arrayEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    /**
     * Q. 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
     *    만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     *    제한시간은 1초입니다.
     *
     * ▣ 입력설명
     * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
     * ▣ 출력설명
     * 첫 줄에 소수의 개수를 출력합니다.
     *
     * 입력 예시 :::
     * 20
     * 출력 예시 :::
     * 8
     */

    private int solution(int num) {

        /* 기본 소수 계산 방식*/
        List tempArr = new ArrayList();

        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                tempArr.add(i);
            }
        }

        return tempArr.size();
    }

    private static boolean isPrime(int n){
        /* 기본 소수 계산 방식*/
        if(n <= 1){ // 1은 소수가 아니므로
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i  == 0) { // 나눠서 0이면 소수가 아니므로
                return false;
            }
        }
        return true;
    }

    private int solution2(int num){
        int cnt = 0;
        int[] ch = new int[num + 1];
        for(int i = 2; i <= num; i++) {
            if(ch[i] == 0){
                //             2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
                // i = 2   ch  0 0 0 0 0 0 0 0 0  0  0  0  0  0  0  0  0  0  0
                // i = 3   ch  1 0 1 0 1 0 1 0 1  0  1  0  1  0  1  0  1  0  1
                cnt++;
                //             2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
                // i = 2   ch  1 0 0 0 0 0 0 0 0  0  0  0  0  0  0  0  0  0  0
                // i = 3   ch  1 1 1 0 1 0 1 0 1  0  1  0  1  0  1  0  1  0  1
                for(int j = i; j <= num; j = j + i) { // 20
                    ch[j] = 1;
                    //             2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
                    // i = 2   ch  1 0 1 0 1 0 1 0 1  0  1  0  1  0  1  0  1  0  1
                    // i = 3   ch  1 1 1 0 1 0 1 1 1  0  1  0  1  1  1  0  1  0  1
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        PrimeNumber T = new PrimeNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수를 입력하세요 ::: ");
        int input = sc.nextInt();

        if(input < 2 || input > 200000){
            throw new IllegalArgumentException("입력값은 2 <= N < 200,000 사이의 값이 입력되어야 합니다.");
        }

        long startTime = System.currentTimeMillis();
//        System.out.println(T.solution(input));
        System.out.println(T.solution2(input));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("duration time = " + duration);

    }

}
