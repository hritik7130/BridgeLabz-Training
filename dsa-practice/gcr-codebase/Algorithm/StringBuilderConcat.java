public class StringBuilderConcat {
    public static void main(String[] args) {
        int n = 1_000_000;
        StringBuilder sb = new StringBuilder();

        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}