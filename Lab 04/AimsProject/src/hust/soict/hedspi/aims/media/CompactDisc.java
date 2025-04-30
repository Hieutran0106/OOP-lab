package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    
    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String artist, float cost) {
        super(title, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track added successfully.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("Track not found in the CD.");
        }
    }

    @Override
    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + artist + " - " + getLength() + ": " + getCost() + " $";
    }

    @Override
    public void play() {
        System.out.println("Playing CompactDisc: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();  
        }
    }
}
