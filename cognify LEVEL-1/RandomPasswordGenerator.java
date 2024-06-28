
import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();
        System.out.print("Include numbers? (true/false): ");
        boolean includeNumbers = scanner.nextBoolean();
        System.out.print("Include lowercase letters? (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();
        System.out.print("Include uppercase letters? (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();
        System.out.print("Include special characters? (true/false): ");
        boolean includeSpecial = scanner.nextBoolean();

        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*()-_=+<>?";
        String characters = "";

        if (includeNumbers) characters += numbers;
        if (includeLowercase) characters += lowercase;
        if (includeUppercase) characters += uppercase;
        if (includeSpecial) characters += special;

        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        System.out.println("Generated password: " + password.toString());
    }
}
