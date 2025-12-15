public class bulbCount {
     public static int countOnBulbs(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(countOnBulbs(4)); // 1101 → 3
    }
    
}
