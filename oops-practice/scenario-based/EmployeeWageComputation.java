
import java.util.*;

public class EmployeeWageComputation {

 
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;  

    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program!");
        System.out.println("---");

        
        employeeAttendance();

      
        dailyWageCalculation();

        
        monthlyWageCalculation();

        
        wageTillCondition();
    }


  
    static void employeeAttendance() {
        Random rand = new Random();
        int attendance = rand.nextInt(2); 

        if(attendance == 1)
            System.out.println("UC1 -> Employee is Present");
        else
            System.out.println("UC1 -> Employee is Absent");
    }



    static void dailyWageCalculation() {
        Random rand = new Random();
        int empType = rand.nextInt(3); 
        int workingHours = 0;

        switch(empType){
            case 1 -> workingHours = FULL_DAY_HOUR;   
            case 2 -> workingHours = PART_TIME_HOUR;  
            default -> workingHours = 0;             
        }

        int dailyWage = workingHours * WAGE_PER_HOUR;

        System.out.println("UC2-UC4 -> Employee Worked: " + workingHours + " Hrs | Daily Wage = ₹" + dailyWage);
    }


    static void monthlyWageCalculation(){
        int monthlyWage = WORKING_DAYS_PER_MONTH * FULL_DAY_HOUR * WAGE_PER_HOUR;

        System.out.println("UC5 -> Monthly Wage for 20 Days = ₹" + monthlyWage);
    }


   
    static void wageTillCondition(){
        int totalHours = 0, totalDays = 0, wage = 0;
        Random rand = new Random();

        while(totalHours < MAX_HOURS_IN_MONTH && totalDays < WORKING_DAYS_PER_MONTH){
            int empType = rand.nextInt(3);
            int workingHours = 0;

            switch(empType){
                case 1 -> workingHours = FULL_DAY_HOUR;  
                case 2 -> workingHours = PART_TIME_HOUR;
                default -> workingHours = 0;
            }

            totalHours += workingHours;
            totalDays++;

            wage += workingHours * WAGE_PER_HOUR;
        }

        System.out.println("UC6 -> Total Hours = " + totalHours +
                           " | Total Days = " + totalDays +
                           " | Total Wage = ₹" + wage);
    }
}