import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class Form7 extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	
public Form7() throws FileNotFoundException {
	this.setResizable(false);
	setDefaultCloseOperation(Data.Exit());
	this.setSize(790,533);

getContentPane().setLayout(null);
JLabel lblNewLabel = new JLabel("Enter Technician Name");
lblNewLabel.setForeground(Color.CYAN);
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel.setBounds(22, 125, 243, 39);
getContentPane().add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("Enter Technician Contact");
lblNewLabel_1.setForeground(Color.CYAN);
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel_1.setBounds(224, 174, 256, 39);
getContentPane().add(lblNewLabel_1);
JLabel lblNewLabel_3 = new JLabel("Enter Technician Username");
lblNewLabel_3.setForeground(Color.CYAN);
lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel_3.setBounds(10, 273, 283, 33);
getContentPane().add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("Enter Technician Password");
lblNewLabel_4.setForeground(Color.CYAN);
lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
lblNewLabel_4.setBounds(185, 328, 295, 33);
getContentPane().add(lblNewLabel_4);
textField = new JTextField();
textField.setBounds(303, 132, 205, 33);
getContentPane().add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(506, 181, 205, 33);
getContentPane().add(textField_1);
textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(303, 273, 205, 33);
getContentPane().add(textField_3);
textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(506, 329, 205, 33);
getContentPane().add(textField_4);
JButton btnNewButton = new JButton("ADD");
btnNewButton.setBackground(Color.WHITE);
btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 20));
btnNewButton.setBounds(336, 420, 93, 39);
getContentPane().add(btnNewButton);
JLabel lblNewLabel_5 = new JLabel("Technician Add");
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
		if(!(textField.getText().equals("")&&textField_1.getText().equals("")&&textField_3.getText().equals("")&&textField_4.getText().equals(""))) {
     Technician t=new Technician(textField.getText(),textField_3.getText(),textField_4.getText(),textField_1.getText());
     Data.Technicians.add(t);

     JOptionPane.showMessageDialog(null, "Technician Added");   
	}
		else {
		       JOptionPane.showMessageDialog(null, "Kindly Fill All Details");   
			
		}
	}
});

	
}	
	
	
}
