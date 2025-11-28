

public class minimumCost {
    public static long wine(int[] arr) {
        long totalWork = 0;
        int curr_bottleBal = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_bottleBal += arr[i];
            totalWork += Math.abs(curr_bottleBal);
            

    
        }
        return totalWork;

    
}
public static void main(String[] args) {
    int[] arr = {5, -4, 1, -3, 1};
    //long result = wine(arr);
    System.out.println("Minimum work: "+ wine(arr));

}
}
