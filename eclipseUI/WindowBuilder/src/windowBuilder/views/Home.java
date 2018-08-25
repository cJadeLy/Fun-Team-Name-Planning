package windowBuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void HomeScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Class Battle");
		btnNewButton.setBounds(154, 98, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Practice Mode");
		btnNewButton_1.setBounds(154, 146, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Avatar Swag");
		btnNewButton_2.setBounds(154, 187, 117, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/windowBuilder/resources/battle32.png")));
		lblNewLabel.setBounds(109, 98, 45, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/windowBuilder/resources/train32.png")));
		lblNewLabel_1.setBounds(109, 139, 45, 39);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
