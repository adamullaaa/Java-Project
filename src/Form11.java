import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Form11 extends JFrame {
	private JTextField textField;

public Form11(int i) throws FileNotFoundException {
	 setDefaultCloseOperation(Data.Exit());
	getContentPane().setBackground(Color.WHITE);
	textField = new JTextField();
	textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
	textField.setBounds(55, 425, 594, 61);
	getContentPane().add(textField);
	
	JButton btnNewButton = new JButton("SEND FEEDBACK");
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton.setBounds(678, 440, 147, 30);
	getContentPane().add(btnNewButton);
	textField.setVisible(false);
	btnNewButton.setVisible(false);
	
	getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Welcome "+Data.Technicians.get(i).getName());
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
	lblNewLabel.setBounds(278, 10, 324, 55);
	getContentPane().add(lblNewLabel);
	
	JTextPane textPane = new JTextPane();
	textPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
	textPane.setBounds(86, 159, 652, 153);
	getContentPane().add(textPane);
	
	JButton btnNewButton_1 = new JButton("Back");
	btnNewButton_1.setBackground(Color.WHITE);
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1.setBounds(740, 502, 85, 21);
	getContentPane().add(btnNewButton_1);
	
	btnNewButton_1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
               Form10 f = null;
			try {
				f = new Form10();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
               f.setVisible(true);
               dispose();
		}
		
	});
	
	boolean flag=false;
	if(Data.Technicians.get(i).DayOfAppointment.size()!=0) {
	for(int z=0; z<Data.Technicians.get(i).DayOfAppointment.size(); z++) {
	textPane.setText("You Have Appointment on "+Data.Technicians.get(i).DaysOfAvailibility.get(z)+"\n");
	flag=true;
	}
	}
	if(flag==false) {
		textPane.setText("You Currently don't have any Appointment");
			
		}
		else {
			textField.setVisible(true);
			btnNewButton.setVisible(true);
		}
	
	btnNewButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			if(textField.getText()!="") {
				Data.Technicians.get(i).Feedbacks.add(textField.getText());
				JOptionPane.showMessageDialog(null, "Feedback Sent");
			}
		
			else {
				JOptionPane.showMessageDialog(null, "Kindly Write Feedback");

			}
		}
		
	});
	
	this.setSize(876,582);
}	
}
