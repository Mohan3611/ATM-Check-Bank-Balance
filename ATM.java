import java.util.Scanner;

public class ATM {
    // Validate input amount
    public static boolean validateInputAmount(Integer amount) {
        return amount > 0;
    }

    // Main method starts
    public static void main(String[] args) {
        int balance = 1000; // initial balance
        int withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter money to be withdrawn: ");
        withdraw = sc.nextInt();

        if (!validateInputAmount(withdraw)) {
            System.out.println("Enter an amount greater than zero");
            return; // Exit the program
        }

        // Check whether the balance is sufficient for the withdrawal
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println("Please collect your money");
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Balance after withdrawal: " + balance);

        System.out.print("Enter money to be deposited: ");
        deposit = sc.nextInt();

        if (!validateInputAmount(deposit)) {
            System.out.println("Enter an amount greater than zero");
            return; // Exit the program
        }

        // Add the deposit amount to the total balance
        balance += deposit;
        System.out.println("Money successfully deposited");
        System.out.println("Balance after deposit: " + balance);

        sc.close(); // Close the scanner
    }
}
