public class StableTestTube {
    public static int stableTube(int[] arr) {
        long Totalsum = 0;
        for (int num : arr) {
            Totalsum += num;
    }
    long leftsum = 0;
    for (int i = 0; i < arr.length; i++) {
        long rightsum = Totalsum - leftsum - arr[i];
        if(leftsum == rightsum) {
            return i;
        }
        leftsum += arr[i];    
    }
    return -1;
    }
    public static void main(String[] args)  {
        int[] testtube = {1,2,3};
      //  System.out.println("Input test tube : " + java.util.Arrays.toString(testtube));

        int result = stableTube(testtube);
        System.out.println("Stable test tube index: " + result);
        

    }
}
    
