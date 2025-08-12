import java.util.Scanner;

public class DTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String octalNumber ="";

        int originalNumber = decimalNumber; // Store original number for printing
          while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octalNumber = remainder + octalNumber; // Add remainder to the front
            decimalNumber = decimalNumber / 8;
        }
        System.out.println("Octal of " + originalNumber + " is: " + octalNumber);
    }
}
