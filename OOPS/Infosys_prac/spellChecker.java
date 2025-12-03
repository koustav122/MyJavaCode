public class spellChecker {
    public static int solve (char[] s1, char[] s2, int i, int j) {
        if(i == s1.length) return s2.length;
        if(j == s2.length) return s1.length - i;
        int count = 0;
        if(s1[i] == s2[j]) {
            return solve(s1, s2, i + 1, j + 1);
        } else {
            int insertOp = 1 + solve(s1, s2, i, j + 1);
            int deleteOp = 1 + solve(s1, s2, i + 1, j);
            int updateOp = 1 + solve(s1, s2, i + 1, j + 1);
            return Math.min(insertOp, Math.min(deleteOp, updateOp));

        }



    }
    public static void main(String[] args) {
        String word1 = "Hose";
        String word2 = "Horse";
        int result = solve(word1.toCharArray(), word2.toCharArray(), 0, 0);
        System.out.println("Minimum edits required: " + result);


    
}
}
