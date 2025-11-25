import java.util.*;
import java.io.*;
public class gold {
    public static void main(String[] sincostani) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // long[] arr = new long[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextLong();
        // }
        // long totalAdded = 0;
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] < arr[i - 1]) {
        //         totalAdded += (arr[i - 1] - arr[i]);
        //         arr[i] = arr[i - 1];
        //     }
        // }
        // System.out.println(totalAdded);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        System.out.println("Enter the number of elements:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the gold with each element:");
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        int idx = 0;
        while (st.hasMoreTokens() && idx < n) {
            
            arr[idx++] = Long.parseLong(st.nextToken());


    }
    while (idx < n) {
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens() && idx < n) {
            arr[idx++] = Long.parseLong(st.nextToken());
        }

}
    
    long totalAdded = 0L;
    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            totalAdded += (arr[i - 1] - arr[i]);
            arr[i] = arr[i - 1];
        }


    }
    System.out.println("Total gold added to make the array non-decreasing: " + totalAdded);

}
}

