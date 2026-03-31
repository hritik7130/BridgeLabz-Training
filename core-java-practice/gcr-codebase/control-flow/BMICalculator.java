import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble(); // in kg
        double height = sc.nextDouble(); // in meters

        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal weight");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        sc.close();
    }
}
