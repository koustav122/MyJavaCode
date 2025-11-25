import java.util.Scanner;

public class productExceptNext {
    public static int[] prodExceptNext(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for(int i=0; i<n; i++) {
            int exclude = (i+1) % n;
            int prod = 1;
            for(int j = 0; j<n; j++) {
                if(j != exclude) {
                    prod *= arr[j];
                }
            }
            result[i] = prod;
        }
        return result;
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] output = prodExceptNext(arr);
        System.out.println("Resulting array:");
        for (int val : output) {
            System.out.print(val + " ");
        }
        System.out.println();
        scanner.close();
    }
    
}
//sir ke dakhabo egulo