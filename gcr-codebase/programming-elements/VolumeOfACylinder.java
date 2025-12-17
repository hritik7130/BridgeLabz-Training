
import java.util.Scanner;

public class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble(); 
        double height = scanner.nextDouble();   
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder with radius " + radius + " and height " + height + " is " + volume);
        scanner.close();
    }
}
