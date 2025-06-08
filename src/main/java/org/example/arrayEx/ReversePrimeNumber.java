package org.example.arrayEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReversePrimeNumber {

    /**
     * Q. N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
     *   예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다.
     *   단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.
     *
     * ▣ 입력설명
     * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
     * 각 자연수의 크기는 100,000를 넘지 않는다.
     * ▣ 출력설명
     * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
     *
     * 입력 예시 :::
     * 9
     * 32 55 62 20 250 370 200 30 100
     * 출력 예시 :::
     * 23 2 73 2 3
     */


    private ArrayList<Integer> solution(int[] numArr){
        int cnt = 0;
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("numArr = " + Arrays.toString(numArr));

        for(int i = 0 ; i < numArr.length; i++){
            if(primeNumber(reverseNumber(numArr[i]))){
                al.add(reverseNumber(numArr[i]));
            }

        }

        return al;

    }

    private static boolean primeNumber(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;

    }

    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }


    public static void main(String[] args){
        ReversePrimeNumber T = new ReversePrimeNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 갯수를 입력하세요 ::: ");
        int input = sc.nextInt();

        if(input < 3 || input > 100){
            throw new IllegalArgumentException("자연수의 갯수의 범위는 3<=N<=100입니다");
        }


        int[] inputArr = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print(i + "번째 자연수 입력하세요 ::: ");

            inputArr[i] = sc.nextInt();
            if(inputArr[i] > 100000){
                throw new IllegalArgumentException("자연수의 범위는 N<=100,000 입니다");
            }

        }

        System.out.println(T.solution(inputArr));

    }
}
