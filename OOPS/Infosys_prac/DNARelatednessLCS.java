// public class DNA_LCS {
//     public static int builsLcs(String s1, String s2) {
//         int m = s1.length();
//         int n = s2.length();
//         int[][] dp = new int[m + 1][n + 1];
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                     dp[i][j] = 1 + dp[i - 1][j - 1];
//                 } else {
//                     dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                 }
        
//     }
    
// }
//         return dp;
//     }
//     public static String reconstructLcs(String s1, String s2, int[][] dp) {
//         int i = s1.length();
//         int j = s2.length();
//         StringBuilder sb = new StringBuilder();
//         while (i > 0 && j > 0) {
//             if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                 sb.append(s1.charAt(i - 1));
//                 i--;
//                 j--;
//             } else if (dp[i - 1][j] > dp[i][j - 1]) {
//                 i--;
//             } else {
//                 j--;
//             }
//         }
//     }
//         return sb.reverse().toString();
// }
//     public static void main(String[] args) {
//         String dna1 = "AGGTAB";
//         String dna2 = "GXTXAYB";
//         int[][] dp = builsLcs(dna1, dna2);
//         String lcs = reconstructLcs(dna1, dna2, dp);
//         System.out.println("Longest Common Subsequence: " + lcs);
//     }
// }



public class DNARelatednessLCS {

    // Compute LCS DP table
    public static int[][] buildLcsTable(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // dp[i][j] = LCS length of s1[0..i-1], s2[0..j-1]
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp;
    }

    // Reconstruct LCS string from DP table
    public static String reconstructLcs(String s1, String s2, int[][] dp) {
        int i = s1.length();
        int j = s2.length();
        StringBuilder sb = new StringBuilder();

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                // This character is part of the LCS
                sb.append(s1.charAt(i - 1));
                i--;
                j--;
            } else {
                // Move in direction of larger LCS length
                if (dp[i - 1][j] >= dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }

        // We built it backwards
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";   // crime scene DNA
        String s2 = "GXTXAYB";  // suspect DNA

        int[][] dp = buildLcsTable(s1, s2);
        String lcs = reconstructLcs(s1, s2, dp);
        int length = lcs.length();

        System.out.println("Crime scene DNA: " + s1);
        System.out.println("Suspect DNA    : " + s2);
        System.out.println("Longest chain of matching markers (LCS): " + lcs);
        System.out.println("Length of matching chain: " + length);
    }
}

