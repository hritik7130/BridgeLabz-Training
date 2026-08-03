package Day2;
 import java.util.*;

public class BalancedBracket {

    public static boolean isBalanced(String s) {


        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();






    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            System.out.println("Enter the string of brackets: ");
            String s = sc.nextLine();
            System.out.println(isBalanced(s) ? "YES" : "NO");
        }

        sc.close();
    }
}
