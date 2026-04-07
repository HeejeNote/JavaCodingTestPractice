package org.example.searchEx;

import java.util.List;

public class BinarySearch {

    public int binarySearch(int[] nums, int s) {
        int start = 0;
        int end = nums.length;
        // 1 2 3 4 5 6 7 8 9 10
        while(start < end) {
            int mid = (end - start) / 2 + start;
            System.out.println("mid = " + mid);
            int d = nums[mid];
            System.out.println("d = " + d);
            System.out.println("-----------------------");
            if (d == s) return d;

            if (s < d) end = mid;
            else start = mid + 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        BinarySearch bs = new BinarySearch();

        int result = bs.binarySearch(nums, 8);
        System.out.println("result = " + result);
    }

}
