
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryptionDecryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to encrypt or decrypt? (e/d): ");
        char choice = scanner.next().charAt(0);
        
        System.out.print("Enter the file name or path: ");
        String filePath = scanner.next();
        
        System.out.print("Enter the output file name or path: ");
        String outputPath = scanner.next();

        try {
            if (choice == 'e') {
                encryptFile(filePath, outputPath);
            } else if (choice == 'd') {
                decryptFile(filePath, outputPath);
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void encryptFile(String filePath, String outputPath) throws IOException {
        FileReader fileReader = new FileReader(new File(filePath));
        FileWriter fileWriter = new FileWriter(new File(outputPath));
        
        int character;
        while ((character = fileReader.read()) != -1) {
            fileWriter.write(character + 1);
        }
        
        fileReader.close();
        fileWriter.close();
        System.out.println("File encrypted successfully.");
    }

    private static void decryptFile(String filePath, String outputPath) throws IOException {
        FileReader fileReader = new FileReader(new File(filePath));
        FileWriter fileWriter = new FileWriter(new File(outputPath));
        
        int character;
        while ((character = fileReader.read()) != -1) {
            fileWriter.write(character - 1);
        }
        
        fileReader.close();
        fileWriter.close();
        System.out.println("File decrypted successfully.");
    }
}
