import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {

            System.out.println("Välkommen!");
            System.out.println("1. Registrera nytt konto");
            System.out.println("2. Visa hela konto listan");
            System.out.println("3. Hur mycket pengar vill du sätta in?");
            System.out.println("4. Avsluta programmet");
            System.out.println("Val: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 1) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Ange startsaldo: ");
            int balance = scanner.nextInt();
            scanner.nextLine();
            register.createAccount(name, balance);
            System.out.println("Kontot har skapats");

        } else if (choice == 2) {
                register.printAll();

            } else if (choice == 3) {
                System.out.println("Namn: ");
                String name = scanner.nextLine();
                Account found = register.findAccount(name);

                if (found != null){
                    System.out.println("Belopp: ");
                    int amount = scanner.nextInt();
                    found.deposit(amount);
                    System.out.println("Nytt saldo: " + found.getBalance());
                } else {
                    System.out.println("Kontot saknas: " + name);
                }

            } else if (choice == 4){
                System.out.println("Hej då!");
            } else {
                System.out.println("Ogiltigt val! Var vänlig och försök igen :) ");
            }

            }



    }
}