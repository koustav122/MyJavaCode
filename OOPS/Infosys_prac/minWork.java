

import java.util.Scanner;

// public class minWork {
    
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int[] arr = new int[n];
            
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
            
//             long minWorkRequired = calculateMinWork(arr);
//             System.out.println(minWorkRequired);
//         }
//     }
    
//     public static long calculateMinWork(int[] arr) {
//         long totalWork = 0;
//         long cumulativeFlow = 0;
        
//         // For each position, calculate the cumulative supply/demand
//         // The cumulative flow at position i represents the wine that needs to be transported
//         // from left side to right side at that point
//         for (int i = 0; i < arr.length - 1; i++) {
//             cumulativeFlow += arr[i];
//             // Work is the absolute value of cumulative flow (wine transported across this edge)
//             totalWork += Math.abs(cumulativeFlow);
//         }
        
//         return totalWork;
//     }
// }

public class minWork {

    // a: array of integers (positive = supply, negative = demand)
    // returns minimum work as long (can be large)
    public static long minWorks(int[] a) {
        long work = 0;
        long balance = 0;  // net wine carried so far

        for (int x : a) {
            balance += x;          // update running sum
            work += Math.abs(balance);
        }

        return work;
    }

    // Example usage
    public static void main(String[] args) {
        int[] houses = {5, -4, 1, -3, 1};  // sum must be 0
        long result = minWorks(houses);
        System.out.println(result);
    }
}
