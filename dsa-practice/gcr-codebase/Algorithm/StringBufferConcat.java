public class StringBufferConcat {
    public static void main(String[] args) {
        int n = 1_000_000;
        StringBuffer sb = new StringBuffer();

        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}