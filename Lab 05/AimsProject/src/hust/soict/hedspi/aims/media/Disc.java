
package hust.soict.hedspi.aims.media;


public class Disc extends Media {
    protected int length;
    private String director;

    // Constructors
    public Disc(String title, float cost) {
    	super(title, cost);
    }
    public Disc(int id, String title) {
    	super(id,title);
    }
    public Disc(String title, int length, float cost) {
    	super(title, cost);
    	this.length = length;
    }
    public Disc(int id, String title, String category, float cost) {
    	super(id, title, category, cost);
    }
    public Disc(int id, String title, String category,  String director, float cost) {
        super(id, title, category, cost);
       
        this.director = director;
    }

    public Disc(int id, String title, String category,  String director, int length, float cost  ) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }
    public Disc(String title, String category, String director, int length, float cost) {
    	super(title, category, cost);
    	this.director = director;
    	this.length = length;
    }
    public Disc() {
		// TODO Auto-generated constructor stub
	}
	// Getters
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}