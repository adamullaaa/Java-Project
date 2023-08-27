import javax.swing.JFrame;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class Form10 extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_1;

public Form10() throws FileNotFoundException {
	
	setDefaultCloseOperation(Data.Exit());
	this.setResizable(false);
	this.setSize(790,533);
	getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("TECHNICIAN LOGIN");
	lblNewLabel.setBackground(Color.GRAY);
	lblNewLabel.setForeground(new Color(0, 255, 255));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
	lblNewLabel.setBounds(260, 10, 278, 86);
	getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setFont(new Font("Tahoma", Font.ITALIC, 20));
	textField.setBounds(387, 225, 278, 35);

	

	
	getContentPane().add(textField);
	
	
	textField_1 = new JTextField();
	textField_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
	textField_1.setBounds(387, 270, 278, 35);

	getContentPane().add(textField_1);
	
	lblNewLabel_1 = new JLabel("Username");
	lblNewLabel_1.setForeground(Color.WHITE);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
	lblNewLabel_1.setBounds(174, 221, 152, 35);
	getContentPane().add(lblNewLabel_1);
	
	lblNewLabel_2 = new JLabel("Password");
	lblNewLabel_2.setForeground(Color.WHITE);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
	lblNewLabel_2.setBounds(174, 266, 166, 35);
	getContentPane().add(lblNewLabel_2);
	
	JButton btnNewButton = new JButton("LOGIN");
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	btnNewButton.setBounds(313, 417, 115, 35);
	getContentPane().add(btnNewButton);
	
	btnNewButton_1 = new JButton("Back");
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	btnNewButton_1.setBounds(659, 450, 85, 21);
	getContentPane().add(btnNewButton_1);
	btnNewButton_1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			MainForm f = null;
			try {
				f = new MainForm();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			f.setVisible(true);
			dispose();
		}
		
	});
	
	
	ImageIcon i=new ImageIcon("C:\\Users\\intag\\Desktop\\bg.jpg");
	lblNewLabel_3 = new JLabel(i);
	lblNewLabel_3.setBounds(0, 0, 780, 496);
	getContentPane().add(lblNewLabel_3);
	
	
	


	btnNewButton.addActionListener((ActionListener) new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
boolean flag=false;
			for(int i=0; i<Data.Technicians.size(); i++) {
			
			if(textField.getText().equals(Data.Technicians.get(i).getUsername())&&textField_1.getText().equals(Data.Technicians.get(i).getPassword())) {
				Form11 f = null;
				try {
					f = new Form11(i);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				f.setVisible(true);
				dispose();
				flag=true;
			}
			
			
		}
		if(flag==false) {JOptionPane.showMessageDialog(null,"Invalid Login");}	
		}
		
	});
	
}


}

