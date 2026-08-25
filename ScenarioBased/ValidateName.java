package ScenarioBased;

class InvalidNameException extends Exception {

    InvalidNameException(String message) {
        super(message);
    }
}

public class ValidateName {

    static boolean validateName(String name) {
        return name != null && name.matches("[a-zA-Z ]+");
    }

    public static void main(String[] args) {

        String name = "Hritik";

        try {
            if (validateName(name)) {
                System.out.println("Valid");
            } else {
                throw new InvalidNameException("Name is invalid");
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
    }
}