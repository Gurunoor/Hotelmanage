package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class welcome {

	private JFrame frame;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome window = new welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 950, 659);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Show Project");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//btnNewButton.setText("Hi Gurunoor........");
				frame.dispose();
				frontpage pg2= new frontpage();
				pg2.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btnNewButton.setBounds(568, 396, 163, 33);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane txtpnSubmittedBy = new JTextPane();
		txtpnSubmittedBy.setBackground(Color.DARK_GRAY);
		txtpnSubmittedBy.setForeground(Color.RED);
		txtpnSubmittedBy.setText("Submitted By ");
		txtpnSubmittedBy.setBounds(118, 377, 89, 20);
		frame.getContentPane().add(txtpnSubmittedBy);
		
		JTextPane txtpnGurunoorSingh = new JTextPane();
		txtpnGurunoorSingh.setBackground(Color.DARK_GRAY);
		txtpnGurunoorSingh.setForeground(Color.RED);
		txtpnGurunoorSingh.setText("Gurunoor Singh");
		txtpnGurunoorSingh.setBounds(118, 408, 116, 20);
		frame.getContentPane().add(txtpnGurunoorSingh);
		
		JTextPane txtpnNehalGupta = new JTextPane();
		txtpnNehalGupta.setForeground(Color.RED);
		txtpnNehalGupta.setBackground(Color.DARK_GRAY);
		txtpnNehalGupta.setText("Nehal Gupta");
		txtpnNehalGupta.setBounds(118, 435, 116, 20);
		frame.getContentPane().add(txtpnNehalGupta);
		
		JTextPane txtpnLakhshitaMalhotra = new JTextPane();
		txtpnLakhshitaMalhotra.setForeground(Color.RED);
		txtpnLakhshitaMalhotra.setBackground(Color.DARK_GRAY);
		txtpnLakhshitaMalhotra.setText("Lakhshita Malhotra");
		txtpnLakhshitaMalhotra.setBounds(118, 466, 114, 20);
		frame.getContentPane().add(txtpnLakhshitaMalhotra);
		
		JTextPane txtpnWelcomeToTaj = new JTextPane();
		txtpnWelcomeToTaj.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtpnWelcomeToTaj.setBackground(Color.DARK_GRAY);
		txtpnWelcomeToTaj.setForeground(Color.RED);
		txtpnWelcomeToTaj.setText("Welcome To Taj");
		txtpnWelcomeToTaj.setBounds(324, 119, 309, 61);
		frame.getContentPane().add(txtpnWelcomeToTaj);
	}
}
