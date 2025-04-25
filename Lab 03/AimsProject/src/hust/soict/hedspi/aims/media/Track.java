
package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


    @Override
    public boolean equals(Object o) {
        
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;  
        if (length != track.length) return false; 
        return title != null ? title.equals(track.title) : track.title == null;  
    }
    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    }

    @Override
    public String toString() {
        return "Track - " + title + " - " + length + " minutes";
    }
    
}