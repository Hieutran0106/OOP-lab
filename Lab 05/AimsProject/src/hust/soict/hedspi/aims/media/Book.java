package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();

    // Constructors
    public Book(String title) {
        super(title);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Book(int id, String category, String title, float cost) {
        super(id, category, title, cost);
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    // Add author (if not already exists)
    public boolean addAuthor(String authorName) {
        if (authorName == null || authorName.trim().isEmpty()) {
            return false;
        }
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            return true;
        }
        return false;
    }

    // Remove author (if exists)
    public boolean removeAuthor(String authorName) {
        if (authorName == null || authorName.trim().isEmpty()) {
            return false;
        }
        return authors.remove(authorName);
    }

    // Display information
    @Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory() + " - " +
               "Authors: " + String.join(", ", authors) + " - " +
               String.format("%.2f", getCost()) + " $";
    

    }
}