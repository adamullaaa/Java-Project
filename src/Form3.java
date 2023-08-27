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

public class Form3 extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
public Form3() throws FileNotFoundException {
	this.setResizable(false);
	setDefaultCloseOperation(Data.Exit());
	this.setSize(790,533);

getContentPane().setLayout(null);
JLabel lblNewLabel = new JLabel("Enter Customer Name");
lblNewLabel.setForeground(Color.CYAN);
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel.setBounds(39, 125, 226, 39);
getContentPane().add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("Enter Customer Contact");
lblNewLabel_1.setForeground(Color.CYAN);
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel_1.setBounds(231, 174, 249, 39);
getContentPane().add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("Enter Customer ID");
lblNewLabel_2.setForeground(Color.CYAN);
lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel_2.setBounds(39, 223, 226, 39);
getContentPane().add(lblNewLabel_2);
JLabel lblNewLabel_3 = new JLabel("Enter Customer Username");
lblNewLabel_3.setForeground(Color.CYAN);
lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel_3.setBounds(231, 283, 271, 39);
getContentPane().add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("Enter Customer Password");
lblNewLabel_4.setForeground(Color.CYAN);
lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel_4.setBounds(22, 344, 266, 39);
getContentPane().add(lblNewLabel_4);
textField = new JTextField();
textField.setBounds(275, 132, 205, 33);
getContentPane().add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(506, 181, 205, 33);
getContentPane().add(textField_1);
textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(275, 230, 205, 33);
getContentPane().add(textField_2);
textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(516, 290, 205, 33);
getContentPane().add(textField_3);
textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(298, 351, 205, 33);
getContentPane().add(textField_4);
JButton btnNewButton = new JButton("ADD");
btnNewButton.setBackground(Color.WHITE);
btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 20));
btnNewButton.setBounds(336, 420, 93, 39);
getContentPane().add(btnNewButton);
JLabel lblNewLabel_5 = new JLabel("Customer Add");
lblNewLabel_5.setForeground(Color.WHITE);
lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
lblNewLabel_5.setBounds(256, 10, 256, 68);
getContentPane().add(lblNewLabel_5);


JButton btnNewButton_4 = new JButton("back");
btnNewButton_4.setBackground(Color.WHITE);
btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
btnNewButton_4.setBounds(655, 442, 85, 29);
getContentPane().add(btnNewButton_4);

btnNewButton_4.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
     Form2 f = null;
	try {
		f = new Form2();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     f.setVisible(true);
     dispose();
		
	}
	
});



ImageIcon i=new ImageIcon("C:\\Users\\intag\\Desktop\\bg.jpg");

JLabel lblNewLabel_6 = new JLabel(i);
lblNewLabel_6.setBounds(0, 0, 776, 496);
getContentPane().add(lblNewLabel_6);
	
btnNewButton.addActionListener((ActionListener) new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!(textField.getText().equals("")&&textField_1.getText().equals("")&&textField_2.getText().equals("")&&textField_3.getText().equals("")&&textField_4.getText().equals(""))) {
      Customer c=new Customer(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText());
       Data.customers.add(c);
       JOptionPane.showMessageDialog(null, "Customer Added");   
	}
		else {
		       JOptionPane.showMessageDialog(null, "Kindly Fill All Details");   
			
		}
	}
});

	
}	
	
	
}
