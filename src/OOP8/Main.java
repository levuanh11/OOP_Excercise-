package OOP8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manageCard ManageCard =  new manageCard();

        int choice = 0;
        do {
            System.out.println("------Menu------");
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student by Id");
            System.out.println("3.Display Student");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManageCard.add(scanner );
                    break;
                case 2:
                    ManageCard.removeCard(scanner);
                    break;
                case 3:
                    ManageCard.display();
                    break;
            }
        }
        while (choice !=0);
    }
}
