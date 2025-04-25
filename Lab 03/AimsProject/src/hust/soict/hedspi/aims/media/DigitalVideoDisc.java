package hust.soict.hedspi.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
 private static int nbDigitalVideoDisc=0;


 public DigitalVideoDisc(String title) {
 	super(++nbDigitalVideoDisc,title);
 }
 public DigitalVideoDisc( String title, String category,float cost) {
 	super(++nbDigitalVideoDisc, title, category, cost);
    
 }
 public DigitalVideoDisc(String title, int length, float cost) {
 	super(title, length, cost);
 }

 public DigitalVideoDisc(String title,String category, String director,  float cost) {
    super(++nbDigitalVideoDisc, title, category, director, cost);
 }
 public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    super(++nbDigitalVideoDisc, title, category, director, length, cost);
 }
 @Override
 public String toString() {
     return "DVD - " + getTitle()+ " - " + getCategory() + " - " + getDirector()+ " - " + getLength() + ": " + getCost() + " $";
 }
 public boolean isMatch(String title) {
     return this.getTitle().equalsIgnoreCase(title);
 }
 
 @Override
 public void play() {
     System.out.println("Playing DVD: " + this.getTitle());
     System.out.println("DVD length: " + this.getLength());
 }

}