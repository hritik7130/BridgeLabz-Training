public class CalculatorTest {

    private static Calculator calc = new Calculator();

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.runAllTests();
    }

    public void runAllTests() {
        try {
            testAdd();
            System.out.println("✓ testAdd passed");
        } catch (AssertionError e) {
            System.out.println("✗ testAdd failed: " + e.getMessage());
        }

        try {
            testSubtract();
            System.out.println("✓ testSubtract passed");
        } catch (AssertionError e) {
            System.out.println("✗ testSubtract failed: " + e.getMessage());
        }

        try {
            testMultiply();
            System.out.println("✓ testMultiply passed");
        } catch (AssertionError e) {
            System.out.println("✗ testMultiply failed: " + e.getMessage());
        }

        try {
            testDivide();
            System.out.println("✓ testDivide passed");
        } catch (AssertionError e) {
            System.out.println("✗ testDivide failed: " + e.getMessage());
        }

        try {
            testDivideByZero();
            System.out.println("✓ testDivideByZero passed");
        } catch (AssertionError e) {
            System.out.println("✗ testDivideByZero failed: " + e.getMessage());
        }
    }

    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    public void testDivide() {
        assertEquals(2, calc.divide(4, 2));
    }

    public void testDivideByZero() {
        try {
            calc.divide(5, 0);
            throw new AssertionError("Expected ArithmeticException but none was thrown");
        } catch (ArithmeticException e) {
            // Expected behavior
        }
    }

    private static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
    }
}
