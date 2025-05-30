package hust.soict.hedspi.test.screen.customer.store;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application {
	private static Store store;
	private static Cart cart;
	
	public void start(Stage primaryStage) throws Exception {
		final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Store.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		ViewStoreController viewStoreController = new ViewStoreController(store, cart);
		fxmlLoader.setController(viewStoreController);
		Parent root = fxmlLoader.load();
		
		primaryStage.setTitle("Store");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		store = new Store();
		cart = new Cart();
		store.addMedia(new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 4.5f));
		store.addMedia(new DigitalVideoDisc("The Matrix", "Action", "The Wachowskis", 136, 4.8f));
		store.addMedia(new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 5.0f));
		store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 3.9f));
		store.addMedia(new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 4.1f));
		store.addMedia(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 6.0f));
		store.addMedia(new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 5.5f));
		store.addMedia(new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 4.3f));
		store.addMedia(new DigitalVideoDisc("Coco", "Animation", "Lee Unkrich", 105, 3.6f));
		store.addMedia(new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 6.8f));
		launch(args);
	}
}