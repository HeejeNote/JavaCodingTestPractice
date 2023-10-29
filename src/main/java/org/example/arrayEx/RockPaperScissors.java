package org.example.arrayEx;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
    /**
     * Q.두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력 ( 1:가위, 2:바위, 3:보 )
     * 입력 설명 :::
     * 첫번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
     * 두번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     * 세번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     * 출력 설명 :::
     * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
     * 입력 예시 :::
     * 5
     * 2 3 3 1 3
     * 1 1 2 2 3
     * 출력 예시 :::
     * A
     * B
     * A
     * B
     * D
     */

    public ArrayList<String> solution(int n, int[] one, int[] two) {
        ArrayList<String> answer = new ArrayList<>();
        // 가위 1 바위 2 보 3
        // 2 > 1
        // 3 > 2
        // 1 > 3

        for(int i = 0; i < one.length; i++){
            if(one[i] == two[i]){
                answer.add("D");
            } else if (one[i] == 1 && two[i] == 3){
                answer.add("A");
            } else if (one[i] == 2 && two[i] == 1) {
                answer.add("A");
            } else if (one[i] == 3 && two[i] == 2){
                answer.add("A");
            } else{
                answer.add("B");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RockPaperScissors T = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] one = new int[n];
        int[] two = new int[n];

        for(int i = 0; i < n; i++){
            one[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            two[i] = sc.nextInt();
        }

        for(String str : T.solution(n, one, two)){
            System.out.println(str);
        }

    }


}
