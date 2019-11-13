package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayroom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayroom frame = new displayroom();
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
	public displayroom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 695);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectRoomType = new JLabel("Select Room Type");
		lblSelectRoomType.setBackground(Color.DARK_GRAY);
		lblSelectRoomType.setForeground(Color.RED);
		lblSelectRoomType.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblSelectRoomType.setBounds(348, 44, 191, 47);
		contentPane.add(lblSelectRoomType);
		
		JButton btnNewButton = new JButton("Luxury Double Room");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showluxurydetail sld= new showluxurydetail();
				sld.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(128, 213, 184, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Luxury Single Room");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showluxurysingle sls= new showluxurysingle();
				sls.setVisible(true);
				dispose();				
			}
		});
		btnNewButton_1.setBounds(128, 371, 184, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deluxe Double Room");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deluxedouble dd= new deluxedouble();
				dd.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(636, 213, 184, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Deluxe Single Room");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deluxesingle ds= new deluxesingle();
				ds.setVisible(true);
				dispose();				
			}
		});
		btnNewButton_3.setBounds(636, 371, 184, 47);
		contentPane.add(btnNewButton_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frontpage pg3= new frontpage();
				pg3.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(44, 26, 89, 23);
		contentPane.add(btnBack);
	}
}
