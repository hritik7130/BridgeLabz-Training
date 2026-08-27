package ScenarioBased;

public class MinimumReplacement{

    public static int minReplacements(String str) {

        char[] arr = str.toCharArray();
        int count = 0;

        for (int i = 1; i < arr.length; i++) {

            if (Math.abs(arr[i] - arr[i - 1]) <= 1) {

                count++;

                
                for (char ch = 'a'; ch <= 'z'; ch++) {

                    boolean safeWithPrevious =
                        Math.abs(ch - arr[i - 1]) > 1;

                    boolean safeWithNext =
                        (i == arr.length - 1) ||
                        Math.abs(ch - arr[i + 1]) > 1;

                    if (safeWithPrevious && safeWithNext) {
                        arr[i] = ch;
                        break;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "aabb";

        System.out.println(minReplacements(str));
    }
}