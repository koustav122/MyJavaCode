// public class linearSearch {

    
// }

// class linearSearchs {
//     public int linearSearch(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

import java.util.*;

class linearSearch {

    public int linearSearchs(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();       // number of elements
            int[] nums = new int[n];

            // taking array input
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int target = sc.nextInt();  // number to search

            linearSearch obj = new linearSearch();
            int result = obj.linearSearchs(nums, target);

            System.out.println(result);
        }
    }
}

