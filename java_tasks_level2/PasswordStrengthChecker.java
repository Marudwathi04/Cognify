import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.next();
        
        int strengthScore = calculateStrength(password);
        
        if (strengthScore < 3) {
            System.out.println("Password strength: Weak");
        } else if (strengthScore < 5) {
            System.out.println("Password strength: Moderate");
        } else {
            System.out.println("Password strength: Strong");
        }
    }

    private static int calculateStrength(String password) {
        int score = 0;
        
        if (password.length() >= 8) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;
        
        return score;
    }
}
