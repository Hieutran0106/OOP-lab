package hust.soict.hedspi.test;
import hust.soict.hedspi.aims.cart.*;
import hust.soict.hedspi.aims.media.*;

public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng mới
        Cart cart = new Cart();

        // Tạo các DVD và thêm vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

       
        cart.print();

        
        cart.searchById(1); 

        // Tìm kiếm DVD theo title
        cart.searchByTitle("Aladin"); 
        cart.searchByTitle("Frozen"); 
    }
}