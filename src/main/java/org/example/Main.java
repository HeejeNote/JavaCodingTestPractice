package org.example;



public class Main {
    public static void main(String[] args) {
        String str = "teachermode e";

        String[] split = str.split(" ");
        char[] wordArr = split[0].toCharArray();
        char c = split[1].charAt(0);
        int distance = 0;
        int[] distanceArr = new int[split[0].length()];
        // t 0 1
        for(int i=0; i < split[0].length(); i++){
            while(wordArr[i] != c){
                if(wordArr[i] == c){
                    distance = i;
                    break;
                }
                distance++;
            }
            distanceArr[i] = distance;
            System.out.println("distanceArr = " + distanceArr[i]);
        }

    }
}