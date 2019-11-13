package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;

public class frontpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontpage frame = new frontpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frontpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDisplayRoomDetails = new JButton("Display Room Details");
		btnDisplayRoomDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hotel", "root", "1234");
					Statement st = con.createStatement();
					int id=45;
					String sql="insert into roomdetails values("+id+")";
					st.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, id);
				}catch(Exception obj)
				{
					JOptionPane.showMessageDialog(null, obj);
				}
			}
		});
		btnDisplayRoomDetails.setBounds(65, 126, 144, 23);
		contentPane.add(btnDisplayRoomDetails);
		
		JButton btnDisplayRoomAvailablity = new JButton("Display Room Availablity");
		btnDisplayRoomAvailablity.setBounds(42, 195, 174, 23);
		contentPane.add(btnDisplayRoomAvailablity);
		
		JButton btnBook = new JButton("Book");
		btnBook.setBounds(67, 267, 89, 23);
		contentPane.add(btnBook);
		
		JButton btnOrderFood = new JButton("Order Food");
		btnOrderFood.setBounds(602, 109, 89, 23);
		contentPane.add(btnOrderFood);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(620, 195, 89, 23);
		contentPane.add(btnCheckout);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(620, 267, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblEnterYourChoice = new JLabel("Enter Your Choice ");
		lblEnterYourChoice.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblEnterYourChoice.setBounds(246, 28, 364, 57);
		contentPane.add(lblEnterYourChoice);
	}
}
