package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StoreManagerScreen extends JFrame {
	private Store store;
	
	public StoreManagerScreen(Store store) {
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setTitle("Store");
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenuItem viewStoreBtn = new JMenuItem("View Store");
		
		viewStoreBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				StoreManagerScreen newStore = new StoreManagerScreen(store);
			}
		});
		
		menu.add(viewStoreBtn);
		
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem addBookItem = new JMenuItem("Add Book");
		addBookItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddBookToStoreScreen addBookScreen = new  AddBookToStoreScreen(store);
				addBookScreen.setVisible(true);
			}
		});
		smUpdateStore.add(addBookItem);
		JMenuItem addCDItem = new JMenuItem("Add CD");
		addCDItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddCompactDiscToStoreScreen addCDScreen = new AddCompactDiscToStoreScreen(store);
				addCDScreen.setVisible(true);
			}
		});
		
		smUpdateStore.add(addCDItem);
		
		JMenuItem addDVDItem = new JMenuItem("Add DVD");
		addDVDItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddDigitalVideoDiscToStoreScreen addDVDScreen = new AddDigitalVideoDiscToStoreScreen(store);
				addDVDScreen.setVisible(true);
			}
		});
		smUpdateStore.add(addDVDItem);
		menu.add(smUpdateStore);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		
		System.out.println(this.store.getLength());
		if(this.store != null && this.store.getLength() != 0) {
			ArrayList<Media> mediaInStore = store.getItemsInStore();
			for (int i = 0; i < this.store.getLength(); i++) {
				MediaStore cell = new MediaStore(mediaInStore.get(i));
				center.add(cell);
			}
		}
		return center;
	}
	
	 public static void main(String[] args)  {
		        Store store = new Store();

		        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "Wachowskis", 136, 19.99f);
		        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Nolan", 148, 24.99f);
		        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action", "Nolan", 152, 29.99f);
		        CompactDisc cd1 = new CompactDisc("Abbey Road", "The Beatles", 78.5f);
		        cd1.addTrack(new Track("Come Together", 4));
		        CompactDisc cd2 = new CompactDisc("Thriller", "Michael Jackson", 5.2f);
		        cd2.addTrack(new Track("Billie Jean", 5));
		        Book book1 = new Book("Harry Potter", "Fantasy", 29.99f);
		        book1.addAuthor("J.K. Rowling");
		        Book book2 = new Book("The Hobbit", "Fantasy", 19.99f);
		        book2.addAuthor("J.R.R. Tolkien");

		        store.addMedia(dvd1);
		        store.addMedia(dvd2);
		        store.addMedia(dvd3);
		        store.addMedia(cd1);
		        store.addMedia(cd2);
		        store.addMedia(book1);
		        store.addMedia(book2);

		        SwingUtilities.invokeLater(() -> new StoreManagerScreen(store));
		  
	    
    }
}