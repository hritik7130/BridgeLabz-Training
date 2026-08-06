package Day4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  
    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
      int value = arr.get(n - 1);
    int i = n - 2;

    while (i >= 0 && arr.get(i) > value) {
        arr.set(i + 1, arr.get(i));

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        i--;
    }

    arr.set(i + 1, value);

    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
    

    }

}

public class InsertionSort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
