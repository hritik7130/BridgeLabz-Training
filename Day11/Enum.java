package Day11;

enum Season {
    WINTER("Cold"),
    SPRING("Mild"),
    SUMMER("Hot"),
    FALL("Cool");

    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class Enum{
    public static void main(String[] args) {

        // Loop through all seasons
        for (Season season : Season.values()) {
            System.out.println(
                season.name() + " : " + season.getDescription()
            );
        }

        System.out.println();

        // Switch statement
        Season currentSeason = Season.SUMMER;

        switch (currentSeason) {
            case SUMMER:
                System.out.println("Summer is hot!");
                break;

            default:
                System.out.println("This is not summer.");
                break;
        }
    }
}