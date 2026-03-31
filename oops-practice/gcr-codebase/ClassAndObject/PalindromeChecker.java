public class PalindromeChecker {

    
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {

        
        String cleanText = text.replaceAll("\\s", "").toLowerCase();

     
        String reverseText = new StringBuilder(cleanText).reverse().toString();

        return cleanText.equals(reverseText);
    }

    
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The given text is a Palindrome");
        } else {
            System.out.println("The given text is NOT a Palindrome");
        }
    }

    // Main method
    public static void main(String[] args) {

        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        checker2.displayResult();
    }
}