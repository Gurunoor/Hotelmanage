package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class bookdetail extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookdetail frame = new bookdetail();
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
	public bookdetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 647);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer name");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(143, 69, 163, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Room type");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(143, 135, 168, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Room no.");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(143, 197, 163, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact no.");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(143, 254, 163, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("No. of members");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(143, 324, 163, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Check in");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(143, 397, 163, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Check out");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(143, 456, 163, 33);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Amount paid");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(143, 512, 163, 33);
		contentPane.add(lblNewLabel_7);
		
		textField1 = new JTextField();
		textField1.setBounds(428, 66, 300, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(428, 132, 300, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(428, 194, 300, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(428, 251, 300, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(428, 321, 300, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(428, 394, 300, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(428, 453, 300, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(428, 518, 300, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.RED);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hotel", "root", "1234");
					Statement st = con.createStatement();
					String customername;
					String checkin;
					String checkout;
					String roomtype;
					int roomno;
					int contactno;
					int amountpaid;
					int noofmembers;
					
					customername=textField1.getText();
					checkin=textField_5.getText();
					checkout=textField_6.getText();
					roomtype=textField_1.getText();
					roomno=Integer.parseInt(textField_2.getText());
					contactno=Integer.parseInt(textField_3.getText());
					amountpaid=Integer.parseInt(textField_7.getText());
					noofmembers=Integer.parseInt(textField_4.getText());
					ResultSet res = st.executeQuery("select * from roomdetails where Roomno="+roomno);
					int i = 0;
					while (res.next()) {
						i++;
					}
					if (i == 0)
					{
						String sql="insert into roomdetails values('" + customername + "'," + noofmembers +","+ roomno +","+contactno +",'"+ checkin+"','" + checkout + "',"+amountpaid+",'"+roomtype+"')";
						st.executeUpdate(sql);
						frontpage pg2= new frontpage();
						pg2.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Alredy Existed Room No");
					}
				}
				catch(Exception obj)
				{	
					JOptionPane.showMessageDialog(null, "Enter Valid Input");
				}
			}
		});
		btnSubmit.setBounds(784, 554, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frontpage pg3= new frontpage();
				pg3.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(37, 25, 89, 23);
		contentPane.add(btnBack);
	}
}
