import java.util.regex.*;

public class RegexPractice {

    public static void main(String[] args) {

        // 1️⃣ Validate Username
        System.out.println("1. Username Validation");
        validate("user_123", "^[A-Za-z][A-Za-z0-9_]{4,14}$");
        validate("123user", "^[A-Za-z][A-Za-z0-9_]{4,14}$");
        validate("us", "^[A-Za-z][A-Za-z0-9_]{4,14}$");

        // 2️⃣ License Plate Validation
        System.out.println("\n2. License Plate Validation");
        validate("AB1234", "^[A-Z]{2}[0-9]{4}$");
        validate("A12345", "^[A-Z]{2}[0-9]{4}$");

        // 3️⃣ Hex Color Code
        System.out.println("\n3. Hex Color Code");
        validate("#FFA500", "^#[A-Fa-f0-9]{6}$");
        validate("#123", "^#[A-Fa-f0-9]{6}$");

        // 4️⃣ Extract Emails
        System.out.println("\n4. Extract Emails");
        extract(
            "Contact us at support@example.com and info@company.org",
            "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"
        );

        // 5️⃣ Extract Capitalized Words
        System.out.println("\n5. Capitalized Words");
        extract(
            "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.",
            "\\b[A-Z][a-z]*\\b"
        );

        // 6️⃣ Extract Dates
        System.out.println("\n6. Dates");
        extract(
            "Events on 12/05/2023, 15/08/2024, and 29/02/2020",
            "\\b\\d{2}/\\d{2}/\\d{4}\\b"
        );

        // 7️⃣ Extract URLs
        System.out.println("\n7. URLs");
        extract(
            "Visit https://www.google.com and http://example.org",
            "https?://\\S+"
        );

        // 8️⃣ Replace Multiple Spaces
        System.out.println("\n8. Remove Extra Spaces");
        String spaced = "This   is   an   example";
        System.out.println(spaced.replaceAll("\\s+", " "));

        // 9️⃣ Censor Bad Words
        System.out.println("\n9. Censor Bad Words");
        String badText = "This is a damn bad example with some stupid words.";
        System.out.println(badText.replaceAll("\\b(damn|stupid)\\b", "****"));

        // 🔟 Validate IP Address
        System.out.println("\n10. IP Address");
        validate("192.168.1.1",
                "^(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)){3}$");

        // 1️⃣1️⃣ Credit Card Validation
        System.out.println("\n11. Credit Card");
        validate("4123456789012345", "^(4\\d{15}|5\\d{15})$");

        // 1️⃣2️⃣ Programming Languages
        System.out.println("\n12. Programming Languages");
        extract(
            "I love Java, Python, and JavaScript, but I haven't tried Go yet.",
            "\\b(Java|Python|JavaScript|Go)\\b"
        );

        // 1️⃣3️⃣ Currency Values
        System.out.println("\n13. Currency Values");
        extract(
            "The price is $45.99, and discount is 10.50",
            "\\$?\\d+\\.\\d{2}"
        );

        // 1️⃣4️⃣ Repeating Words
        System.out.println("\n14. Repeating Words");
        extract(
            "This is is a repeated repeated word test.",
            "\\b(\\w+)\\s+\\1\\b"
        );

        // 1️⃣5️⃣ SSN Validation
        System.out.println("\n15. SSN Validation");
        validate("123-45-6789", "^\\d{3}-\\d{2}-\\d{4}$");
        validate("123456789", "^\\d{3}-\\d{2}-\\d{4}$");
    }

    // Helper method for validation
    static void validate(String input, String regex) {
        System.out.println(input + " → " + input.matches(regex));
    }

    // Helper method for extraction
    static void extract(String text, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
