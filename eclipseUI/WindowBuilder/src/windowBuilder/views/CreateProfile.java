package windowBuilder.views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CreateProfile {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void NewScreen() 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CreateProfile window = new CreateProfile();
					window.frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(153, 0, 204));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name: ");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setBounds(23, 28, 96, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name: ");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(23, 56, 96, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(153, 23, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 51, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCreateUserId = new JLabel("Create User ID: ");
		lblCreateUserId.setForeground(new Color(102, 0, 153));
		lblCreateUserId.setBounds(23, 97, 106, 16);
		frame.getContentPane().add(lblCreateUserId);
		
		JLabel lblNewLabel_2 = new JLabel("Create Password: ");
		lblNewLabel_2.setForeground(new Color(153, 0, 204));
		lblNewLabel_2.setBounds(23, 125, 130, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Re-enter Password: ");
		lblNewLabel_3.setForeground(new Color(204, 0, 153));
		lblNewLabel_3.setBounds(23, 164, 130, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(60, 192, 141, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(187, 192, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 92, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(153, 120, 130, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(153, 159, 130, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(CreateProfile.class.getResource("/windowBuilder/resources/male32.png")));
		lblNewLabel_4.setBounds(23, 185, 61, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(CreateProfile.class.getResource("/windowBuilder/resources/female32.png")));
		lblNewLabel_5.setBounds(153, 192, 61, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnCreateReturn = new JButton("Create & Return to Log In");
		btnCreateReturn.setForeground(new Color(255, 102, 204));
		btnCreateReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.setVisible(false);
			}
		});
		btnCreateReturn.setBounds(23, 236, 395, 29);
		frame.getContentPane().add(btnCreateReturn);
	}
}
