import java.util.*;
public class identicalArr {
    public static int minAdjacentSwaps(int[] A, int[] B) {
        int n = A.length;
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int x : A) s1.add(x);
        for (int x : B) s2.add(x);
        if (!s1.equals(s2)) return -1;
    Map<Integer, Integer> mapB = new HashMap<>();
    for (int i = 0; i < n; i++) {
        mapB.put(B[i], i);
    }
    int[] target = new int[n];
    for (int i = 0; i < n; i++) {
        target[i] = mapB.get(A[i]);
    }
    return countInversions(target);
}
  private static int countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);

    }
    private static int mergeSort(int[] arr, int left, int right) {
        if(left >= right) return 0;
        int mid = (left +  right) / 2;
        int invCount = 0;
        invCount += mergeSort(arr, left, mid);
        invCount += mergeSort(arr, mid + 1, right);
        invCount += merge(arr, left, mid, right);
        return invCount; 
    }
    private static int merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1;
        int[] temp = new int[right - left + 1];
        int k = 0; 
        int invCount = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        k= 0;
        for (int p = left; p <= right; p++) {
            arr[p] = temp[k++];
        }
        return invCount;
    }

    public static void main(String[] args) {
        System.out.println(minAdjacentSwaps(new int[]{1, 3, 2, 4}, new int[]{1, 2, 3, 4}));
        System.out.println(minAdjacentSwaps(new int[]{1,4,5,7,8}, new int[]{1,7,8,9,3}));
    }
}
