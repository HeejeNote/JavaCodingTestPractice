package org.example.arrayEx;

import java.util.ArrayList;
import java.util.List;

public class BigNumberPrint2 {

    /**
     * 어진 입력중 최대값을 구하고, 최대값이 이 위치하는 index 값의 목록을 반환하세요.
     *
     * 입력:
     * [1, 3, 5, 4, 5, 2, 1]
     *
     * 입력된 목록의 최대값은 5입니다.
     * 5와 동일한 값을 가진 위치는 3번째, 5번째 위치 입니다.
     * 이 위치에 해당하는 index는 [2, 4] 입니다.
     *
     * 출력:
     * [2, 4]
     */

    public int[] solution(int[] arr) {

        // 최대값 찾기

        int max = arr[0];

        for (int num : arr) {
            if(num > max) max = num;
        }

        List<Integer> ar = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == max){
                ar.add(i);
            }

        }

        int[] answer = new int[ar.size()];

        for(int i = 0; i < answer.length; i++) {

            answer[i] = ar.get(i);

        }

        return answer;
    }

    public static void main(String[] args) {

        BigNumberPrint2 T = new BigNumberPrint2();
        int[] arr = {1, 3, 5, 4, 5, 2, 1};

        for (int i : arr) {
            System.out.println("i = " + i);
        }

        T.solution(arr);

    }

}
