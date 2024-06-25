package libraryManagement;

public class LibraryMain {

    public static void main(String[] args) {

        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book(2, "1984", "George Orwell");
        Book book3 = new Book(3, "Pride and Prejudice", "Jane Austen");
        Book book4 = new Book(4, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book5 = new Book(5, "Moby-Dick", "Herman Melville");
        Book book6 = new Book(6, "War and Peace", "Leo Tolstoy");
        Book book7 = new Book(7, "Crime and Punishment", "Fyodor Dostoevsky");
        Book book8 = new Book(8, "The Odyssey", "Homer");
        Book book9 = new Book(9, "Catch-22", "Joseph Heller");
        Book book10 = new Book(10, "The Brothers Karamazov", "Fyodor Dostoevsky");

        Member member1 = new Member(101, "Alice Johnson", new Book[0]);
        Member member2 = new Member(102, "Bob Smith", new Book[0]);
        Member member3 = new Member(103, "Cathy Brown", new Book[]{book4, book5, book6});
        Member member4 = new Member(104, "David Wilson", new Book[]{});
        Member member5 = new Member(105, "Eve Davis", new Book[]{});

        Admin admin1 = new Admin(10, "Ram");
        Admin admin2 = new Admin(11, "Mr. Oli");

        User user1 = new Admin(1, "Alice Johnson");
        User user2 = new User(2, "Bob Smith");
        User user3 = (User) admin1;

        Library universityLibrary = new Library( new Book[]{book1, book2}, new Member[]{member1, member2}, new Admin[]{admin1} );

        member1.toString();
        admin1.toString();
        universityLibrary.getDetails();

        Library publicLibrary = new Library(new  Book[0], new Member[0], new Admin[0]);
        publicLibrary.setMembers(new Member[]{member4, member5});
        publicLibrary.setAdmins(new Admin[]{admin1});
        publicLibrary.setAllBooks(new Book[]{book6, book7, book8});

        publicLibrary.getDetails();
    }
}
