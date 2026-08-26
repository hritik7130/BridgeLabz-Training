package ScenarioBased;
import java.util.*;

public class WatchListScore {

    public static long maxWatchlistScore(int[] duration, int[] rating, int limit) {

        int n = duration.length;


        int[][] movies = new int[n][2];

        for (int i = 0; i < n; i++) {
            movies[i][0] = rating[i];
            movies[i][1] = duration[i];
        }

       
        Arrays.sort(movies, (a, b) -> b[0] - a[0]);

 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        long durationSum = 0;
        long maxScore = 0;

        for (int[] movie : movies) {

            int r = movie[0];
            int d = movie[1];

 
            minHeap.add(d);
            durationSum += d;

        
            if (minHeap.size() > limit) {
                durationSum -= minHeap.poll();
            }

         
            maxScore = Math.max(maxScore, durationSum * r);
        }

        return maxScore;
    }

    public static void main(String[] args) {

        int[] duration = {10, 20, 30, 40};
        int[] rating = {5, 4, 3, 2};
        int limit = 2;

        System.out.println(maxWatchlistScore(duration, rating, limit));
    }
}