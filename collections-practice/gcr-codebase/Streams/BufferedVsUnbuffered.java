import java.io.*;

public class BufferedVsUnbuffered {
    public static void main(String[] args) throws IOException {
        File source = new File("largefile.dat");

        copyUnbuffered(source, new File("unbuffered_copy.dat"));
        copyBuffered(source, new File("buffered_copy.dat"));
    }

    static void copyUnbuffered(File src, File dest) throws IOException {
        long start = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }

        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start) + " ns");
    }

    static void copyBuffered(File src, File dest) throws IOException {
        long start = System.nanoTime();

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }

        long end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start) + " ns");
    }
}