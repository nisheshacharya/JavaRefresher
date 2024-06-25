package libraryManagement;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Library {
    private Book[] allBooks;
    private Member[] members;
    private Admin [] admins;

    public Library (Book[] allBooks, Member[]members, Admin[]admins) {
        this.allBooks = allBooks;
        this.members = members;
        this.admins = admins;
    }

    public Member[] getMembers() {return members;}
    public void setMembers(Member[] members) {this.members = members;}
    public Admin[] getAdmins() {return admins;}
    public void setAdmins(Admin[] admins) {this.admins = admins;}

    public Book[] getAllBooks() { return allBooks;}
    public void setAllBooks(Book[] allBooks) {allBooks = allBooks;}

    public void addNewBook(Book book){
        Book[] allBooksOld = getAllBooks();
        Book[] allBooksNew = Miscellaneous.addBooks(allBooksOld, book);
        setAllBooks(allBooksNew);
        System.out.println("Book added!");
    }

    public void getDetails(){
        System.out.println("Library:");
        System.out.println("Members: "+ Arrays.toString(getMembers()));
        System.out.println("Books: "+ Arrays.toString(getAllBooks()));
        System.out.println("Admins: "+ Arrays.toString(getAdmins()));
        System.out.println();
    }

}
