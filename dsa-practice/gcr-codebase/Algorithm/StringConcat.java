public class StringConcat {
    public static void main(String[] args) {
        int n = 1_000_000;
        String s = "";

        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            s = s + "a";
        }

        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}