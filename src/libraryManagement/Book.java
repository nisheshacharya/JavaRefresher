package libraryManagement;

public class Book {
    private int id;
    private String name;
    private String author;
    private boolean isAvilable;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        isAvilable = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvilable;
    }

    public void setAvailable(boolean available) {
        isAvilable = available;
    }
    @Override
    public String toString(){
        return "Book Id: "+getId() + "  Name: "+ getName() + "  Author: "+ getAuthor();
    }
    public  void getDetails(){
       this.toString();
    }
}

