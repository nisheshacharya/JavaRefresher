package libraryManagement;

public class Miscellaneous {

    public static Book[] addBooks(Book[]oldArray, Book book) {

        int bookCount = oldArray.length;

        Book[] newBookArray = new Book[bookCount+1];

        for(int i = 0; i < bookCount ; i++){
            newBookArray[i] = oldArray[i];
        }
        newBookArray[bookCount] = book;
        return newBookArray;
    }
}
