
// public class findChamp {
//     public int findChamps(int[] stadiumWinners) {
//         int n = stadiumWinners.length;
//         int candidate = -1, count = 0;
//         for(int team : stadiumWinners) {
//             if(count == 0) {
//                 candidate = team;
//                 count = 1;
//             }else if(team == candidate) {
//                 count++;

//             }else {
//                 count--;
//             }
//         }
//         count = 0;
//         for(int team : stadiumWinners) {
//             if(team == candidate) count++;
//         }
//         if(count > n/2) return candidate;
//         return -1;
//     }
    
// }
// import java.util.*;
// public class findChamp {
//     public int findChampion(int[] stadiumWinners) {
//         int n = stadiumWinners.length;
//         int candidate = -1, count = 0;

//         for (int team : stadiumWinners) {
//             if (count == 0) {
//                 candidate = team;
//                 count = 1;
//             } else if (team == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }

//         count = 0;
//         for (int team : stadiumWinners) {
//             if (team == candidate) count++;
//         }

//         return (count > n / 2) ? candidate : -1;
//     }

    
//     public static void main(String[] args) {
//         findChamp obj = new findChamp();
//         int[] arr = {1, 2, 1, 1, 3, 1, 1};
//         int result = obj.findChampion(arr);
//         System.out.println("Champion team: " + result);
//     }
// }







import java.util.*;

public class findChamp {
    public int findChampion(int[] stadiumWinners) {
        int n = stadiumWinners.length;
        int candidate = -1, count = 0;

        for (int team : stadiumWinners) {
            if (count == 0) {
                candidate = team;
                count = 1;
            } else if (team == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int team : stadiumWinners) {
            if (team == candidate) count++;
        }

        return (count > n / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stadium winners: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the team numbers of the stadium winners:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findChamp obj = new findChamp();
        int result = obj.findChampion(arr);

        System.out.println("Champion team: " + result);
        scanner.close();
    }
}



























