package OOP8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manageCard {
    List<Card> cards;


    public manageCard() {
        this.cards = new ArrayList<>();
    }

    public Student createStudent() {
        System.out.println("Enter Student name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Enter Student age");
        Scanner scanner1 = new Scanner(System.in);
        int age = scanner1.nextInt();

        System.out.println("Enter Student school");
        Scanner scanner2 = new Scanner(System.in);
        String school = scanner2.nextLine();

        return new Student(name, age, school);

    }

    public Card createCard(Scanner scanner) {
        Student student = createStudent();

        System.out.println("Enter Borrow Date");
        int borrowDate = scanner.nextInt();

        System.out.println("Enter Payment Date");
        int paymentDate = scanner.nextInt();

        System.out.println("Enter Book ID");
        int bookID = scanner.nextInt();
        scanner.nextLine();

        return new Card(student, borrowDate, paymentDate, bookID);

    }

    public void add(Scanner scanner) {
        Card card = createCard(scanner);
        cards.add(card);
    }

    //    public boolean removeCard(Scanner scanner) {
//        Card card = this.cards.stream().filter(t -> t.getBookID().equals(scanner)).findFirst().orElse(null);
//        if (card == null) {
//            return false;
//        }
//
//        this.cards.remove(card);
//        return true;
//
//    }
    public void removeCard(Scanner scanner){
        System.out.println("Enter Book ID that you want to remove");
        int bookID = scanner.nextInt();
        int check = 0;
        for (int i = 0; i< cards.size();i++){
            if(cards.get(i).getBookID() == bookID ){
                cards.remove(i);
                i--;
                check++;
            }
        }
        if (check == 0){
            System.out.println("This ID is not exist");
        }
    }


    public void display() {
        for (Card a : cards) {
            System.out.println(a);
        }
    }
}
