

// public class missingNum {
//       public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int sum = n*(n+1)/2;
//         int news = 0;
//         for(int i=0; i<n; i++) {
//             news += nums[i];

//         }
//         return sum-news;
        
//     }
    
// }



public class missingNum {
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int news = 0;

        for (int i = 0; i < n; i++) {
            news += nums[i];
        }

        return sum - news;
    }

    public static void main(String[] args) {

        missingNum obj = new missingNum();

        // Example input: array missing number 2
        int[] nums = {0, 1, 3};

        int ans = obj.missingNumber(nums);

        System.out.println("Missing number is: " + ans);
    }
}

