package org.example.arrayEx;

import java.util.Arrays;


public class Permutation {

    /**
     * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
     * 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
     *
     * 제한사항
     * 배열의 길이는 10만 이하입니다.
     * 배열의 원소는 0 이상 10만 이하인 정수입니다.
     */

    /**
     * arr	result
     * [4, 1, 3, 2]	true
     * [4, 1, 3]	false
     */

    public boolean solution(int[] arr) {
        boolean answer = true;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Permutation T = new Permutation();
        int[] arr = {4, 1, 3, 2};

        for (int i : arr) {
            System.out.println("i = " + i);
        }

        T.solution(arr);

    }

}
