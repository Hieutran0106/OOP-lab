package hust.soict.hedspi.aims.screen.manager;


import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
	private JTextField titleInput;
	private JTextField categoryInput;
	private JTextField costInput;
	private JTextField idInput;
	
	public AddBookToStoreScreen(Store store) {
		super(store);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new SubmitListener());
		cp.add(submitButton, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Store");
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@Override
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("Adding Book");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	@Override
	JPanel createCenter() {
		JPanel center = new JPanel(new GridLayout(5, 2, 10, 10));
		center.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		center.add(new JLabel("Enter the Title of the Book you want to add: "));
		titleInput = new JTextField(20);
		center.add(titleInput);
		
		
		center.add(new JLabel("Enter the Category of the Book you want to add: "));
		categoryInput = new JTextField(20);
		center.add(categoryInput);
		
		center.add(new JLabel("Enter the Cost of the Book you want to add: "));
		costInput = new JTextField(20);
		center.add(costInput);
		center.add(new JLabel("Enter the ID of the Book you want to add: "));
		idInput = new JTextField(20);
		center.add(idInput);
		
		return center;
	}
	
	private class SubmitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Book newBook = new Book(Integer.parseInt(idInput.getText()), titleInput.getText(),
						categoryInput.getText(), Float.parseFloat(costInput.getText()));
				store.addMedia(newBook);
				dispose();
				StoreManagerScreen myScreen = new StoreManagerScreen(store);
				myScreen.setVisible(true);
			} catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Invalid Input! Please enter integer for Field ID, float for Field Cost", "WARNING", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}