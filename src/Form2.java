import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JLabel;
import java.awt.Color;

public class Form2 extends JFrame{
	
	public Form2() throws FileNotFoundException {
		setDefaultCloseOperation(Data.Exit());
		this.setResizable(false);
		this.setSize(790,533);

		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADD CUSTOMER");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(43, 167, 268, 39);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
Form3 f = null;
try {
	f = new Form3();
} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
f.setVisible(true);
dispose();
			}
			
		});
		
		
		JButton btnNewButton_1 = new JButton("EDIT CUSTOMER");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(43, 240, 268, 36);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
              Form5 f = null;
			try {
				f = new Form5();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
              f.setVisible(true);
              dispose();
				
			}
			
		});
		
		
		JButton btnNewButton_2 = new JButton("SEARCH CUSTOMER");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(43, 300, 268, 37);
		getContentPane().add(btnNewButton_2);
		

		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
Form4 f = null;
try {
	f = new Form4();
} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
f.setVisible(true);
			dispose();}
			
		});
		
		JButton btnNewButton_3 = new JButton("ADD TECHNICIAN");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setBounds(454, 167, 275, 39);
		getContentPane().add(btnNewButton_3);
		
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
                 Form7 f = null;
				try {
					f = new Form7();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                 f.setVisible(true);
                 dispose();
				
			}
			
		});
		
		JLabel lblNewLabel = new JLabel("SERVICES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(292, 10, 184, 39);
		getContentPane().add(lblNewLabel);
	
		
		JButton btnNewButton_4 = new JButton("back");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(655, 442, 85, 29);
		getContentPane().add(btnNewButton_4);
	
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
             MainForm f = null;
			try {
				f = new MainForm();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
             f.setVisible(true);
             dispose();
				
			}
			
		});
		
		
		
		JButton btnNewButton_5 = new JButton("APPOINT TECH");
		btnNewButton_5.setBounds(454, 240, 275, 36);
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getContentPane().add(btnNewButton_5);
	btnNewButton_5.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
Form8 f = null;
try {
	f = new Form8();
} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
f.setVisible(true);
dispose();
			
		}
		
	});
		
		
		
		JButton btnNewButton_6 = new JButton("FEEDBACKS");
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_6.setBounds(454, 300, 275, 39);
		getContentPane().add(btnNewButton_6);
		
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
             Form12 f = null;
			try {
				f = new Form12();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
             f.setVisible(true);
             dispose();
				
			}
			
		});
		
	
		ImageIcon i=new ImageIcon("C:\\Users\\intag\\Desktop\\bg.jpg");

		JLabel lblNewLabel_1 = new JLabel(i);
		lblNewLabel_1.setBounds(0, 0, 766, 486);
		getContentPane().add(lblNewLabel_1);
	}
	
	
}
