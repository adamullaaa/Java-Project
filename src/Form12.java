import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JTextPane;
import javax.swing.JButton;

public class Form12 extends JFrame {

	public Form12() throws FileNotFoundException {
		setDefaultCloseOperation(Data.Exit());
		getContentPane().setBackground(Color.WHITE);
		this.setSize(847,567);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEEDBACKS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(310, 20, 180, 29);
		getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setBounds(10, 128, 813, 328);
		getContentPane().add(textPane);
		
		
		for(int i=0; i<Data.Technicians.size(); i++) {
			for(int j=0; j<Data.Technicians.get(i).Feedbacks.size(); j++) {
		textPane.setText(textPane.getText()+"\nFeedback By "+Data.Technicians.get(i).getUsername()+": "+Data.Technicians.get(i).Feedbacks.get(j));		
			}
		}
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(699, 487, 85, 21);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {

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
		
	}
}
