import java.util.Scanner;

public class LowerCaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 
        System.out.print("Enter the complete text: ");
        String input = scanner.nextLine();

       
        String manualLower = toLowerManual(input);

     
        String builtInLower = input.toLowerCase();

        
        boolean isSame = compareStrings(manualLower, builtInLower);

        
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both lowercase versions equal? " + isSame);
    }

    // Method to manually convert uppercase letters to lowercase
    public static String toLowerManual(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}