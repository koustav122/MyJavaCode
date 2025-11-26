public class Pow2 {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;

    }
    public static void main(String[] args) {
        int number = 32; // Example input
        boolean result = isPowerOfTwo(number);
        System.out.println(number + " is power of two: " + result);


}
}
