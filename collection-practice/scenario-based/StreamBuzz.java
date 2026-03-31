import java.util.*;

class CreatorStats {

    private String creatorName;
    private double[] weeklyLikes;

    public static List<CreatorStats> EngagementBoard = new ArrayList<>();

    public CreatorStats(String creatorName, double[] weeklyLikes) {
        this.creatorName = creatorName;
        this.weeklyLikes = weeklyLikes;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public double[] getWeeklyLikes() {
        return weeklyLikes;
    }
}

public class StreamBuzz {

    public void registerCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

    public Map<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats creator : records) {
            int count = 0;

            for (double like : creator.getWeeklyLikes()) {
                if (like >= likeThreshold)
                    count++;
            }

            if (count > 0)
                result.put(creator.getCreatorName(), count);
        }

        return result;
    }

    public double calculateAverageLikes() {

        if (CreatorStats.EngagementBoard.isEmpty())
            return 0;

        double total = 0;
        int count = 0;

        for (CreatorStats creator : CreatorStats.EngagementBoard) {
            for (double like : creator.getWeeklyLikes()) {
                total += like;
                count++;
            }
        }

        return total / count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StreamBuzz app = new StreamBuzz();
        int choice;

        do {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.println("Enter Creator Name:");
                    String name = sc.nextLine();

                    double[] likes = new double[4];

                    System.out.println("Enter weekly likes (Week 1 to 4):");

                    for (int i = 0; i < 4; i++) {
                        likes[i] = sc.nextDouble();
                    }

                    CreatorStats creator = new CreatorStats(name, likes);
                    app.registerCreator(creator);

                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = sc.nextDouble();

                    Map<String, Integer> result =
                            app.getTopPostCounts(CreatorStats.EngagementBoard, threshold);

                    if (result.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for (Map.Entry<String, Integer> entry : result.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    double avg = app.calculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + avg);
                    break;

                case 4:
                    System.out.println("Logging off — Keep Creating with StreamBuzz!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
