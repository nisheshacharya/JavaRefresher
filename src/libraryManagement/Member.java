package libraryManagement;


import java.util.Arrays;

public class Member extends User{
    private Book[] checkedOutBooks;

    public Member(int id, String name, Book[] checkedOutBooks) {
        super(id, name);
        this.checkedOutBooks = checkedOutBooks;
    }
    public Book[] getCheckedOutBooks() {
        return checkedOutBooks;
    }
    public void setCheckedOutBooks(Book[] checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }

    public Book[] borrowBooks(Book book) {
        Book[] previousBorrowed = getCheckedOutBooks();
        Book[] allBorrowed = Miscellaneous.addBooks(previousBorrowed,book);
        setCheckedOutBooks(allBorrowed);
        return allBorrowed;
    }

    public String toString(){
        return "Member Id: "+getId() + "  Name: "+ getName() + "  Checked Out Books: "+ Arrays.toString(getCheckedOutBooks());
    }

}

