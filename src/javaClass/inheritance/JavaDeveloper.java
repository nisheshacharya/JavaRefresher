package javaClass.inheritance;

public class JavaDeveloper extends Developer {
    private int rating;

    public JavaDeveloper(String name, double salary, boolean isPermanent, int rating){
        super(name, salary, isPermanent);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
