package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class showluxurysingle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showluxurydetail frame = new showluxurydetail();
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
	public showluxurysingle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 606);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLuxuryDoubleRoom = new JLabel("Luxury Single Room");
		lblLuxuryDoubleRoom.setForeground(Color.RED);
		lblLuxuryDoubleRoom.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblLuxuryDoubleRoom.setBounds(278, 74, 288, 29);
		contentPane.add(lblLuxuryDoubleRoom);
		
		JLabel lblNoOfDouble = new JLabel("No. Of Single Bed :  1");
		lblNoOfDouble.setForeground(Color.RED);
		lblNoOfDouble.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNoOfDouble.setBounds(278, 178, 176, 24);
		contentPane.add(lblNoOfDouble);
		
		JLabel lblAc = new JLabel("AC :   YES");
		lblAc.setForeground(Color.RED);
		lblAc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAc.setBounds(278, 213, 159, 29);
		contentPane.add(lblAc);
		
		JLabel lblFreeBreakfastYes = new JLabel("Free Breakfast:  YES");
		lblFreeBreakfastYes.setForeground(Color.RED);
		lblFreeBreakfastYes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFreeBreakfastYes.setBounds(278, 253, 159, 32);
		contentPane.add(lblFreeBreakfastYes);
		
		JLabel lblChargePerDay = new JLabel("Charge Per Day: 2500");
		lblChargePerDay.setForeground(Color.RED);
		lblChargePerDay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChargePerDay.setBounds(278, 296, 159, 29);
		contentPane.add(lblChargePerDay);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayroom rs= new displayroom();
				rs.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(48, 42, 89, 23);
		contentPane.add(btnBack);
	}

}
