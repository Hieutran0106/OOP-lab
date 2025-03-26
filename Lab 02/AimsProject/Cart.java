import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Cannot add a null DVD.");
            return;
        }

        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The Disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is full. Cannot add \"" + disc.getTitle() + "\".");
        }
    }

    // Overloaded method for adding multiple DVDs
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            addDigitalVideoDisc(dvd);
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Cannot remove a null DVD.");
            return;
        }

        if (itemsOrdered.remove(disc)) {
            System.out.println("The Disc \"" + disc.getTitle() + "\" has been removed.");
        } else {
            System.out.println("The Disc \"" + disc.getTitle() + "\" was not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {
                total += disc.getCost();
            }
        }
        return total;
    }

    public int getQtyOrdered() {
        return itemsOrdered.size();
    }
}
