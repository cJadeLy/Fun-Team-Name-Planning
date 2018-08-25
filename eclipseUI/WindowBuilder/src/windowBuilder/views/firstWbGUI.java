package windowBuilder.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

public class firstWbGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserId;
	private JTextField txtPassword;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					firstWbGUI frame = new firstWbGUI();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public firstWbGUI() {
		setBackground(new Color(255, 255, 255));
		setTitle("Education Tool Sample");
		setIconImage(Toolkit.getDefaultToolkit().getImage(firstWbGUI.class.getResource("/windowBuilder/resources/blue50.png")));
		initComponent();
		createEvents();
		
	}


    ///////////////////////////////////////////////////////////////////////
	// This method contains all the code to create and 
	// initialize components
	///////////////////////////////////////////////////////////////////////
	private void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserId = new JTextField();
		txtUserId.setBounds(158, 121, 130, 26);
		txtUserId.setText("User ID");
		contentPane.add(txtUserId);
		txtUserId.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(158, 159, 130, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Home home = new Home();
				home.HomeScreen();
			}
		});
		btnSignIn.setBackground(Color.BLACK);
		btnSignIn.setBounds(158, 197, 130, 29);
		contentPane.add(btnSignIn);
		
		JButton btnNewButton = new JButton("Create Profile");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Open new window to create profile
				CreateProfile create = new CreateProfile();
				create.NewScreen();
			}
		});
		btnNewButton.setBounds(158, 224, 130, 29);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(firstWbGUI.class.getResource("/windowBuilder/resources/school96.png")));
		lblNewLabel.setBounds(170, 24, 130, 81);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(firstWbGUI.class.getResource("/windowBuilder/resources/userID32.png")));
		lblNewLabel_1.setBounds(114, 117, 72, 32);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(firstWbGUI.class.getResource("/windowBuilder/resources/key32.png")));
		lblNewLabel_2.setBounds(114, 153, 40, 32);
		contentPane.add(lblNewLabel_2);
		
		
	}

    ///////////////////////////////////////////////////////////////////////
	// This method contains all the code to create events
	///////////////////////////////////////////////////////////////////////
	private void createEvents() {
		// TODO Auto-generated method stub
		
	}
}
