import java.util.*;

class ZeroSumSubarray {

    static boolean hasZeroSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int x : arr) {
            sum += x;
            if (sum == 0 || set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }
}
