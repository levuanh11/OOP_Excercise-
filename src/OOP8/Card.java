package OOP8;

import java.util.Scanner;

public class Card {
    private Student student;
    private int borrowDate;
    private int paymentDate;
    private int bookID;

    public Card() {
    }

    public Card(Student student, int borrowDate, int paymentDate, int bookID) {
        this.student = student;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookID = bookID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }





    @Override
    public String toString() {
        return "Card{" +
                "student=" + student +
                ", borrowDate=" + borrowDate +
                ", paymentDate=" + paymentDate +
                ", bookID=" + bookID +
                '}';
    }
}
