import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class Form9 extends JFrame{

	public Form9(int i) throws FileNotFoundException {
		setDefaultCloseOperation(Data.Exit());

		this.setSize(726,539);
	getContentPane().setLayout(null);	
	
	JLabel lblNewLabel = new JLabel("Appoint Technician");
	lblNewLabel.setForeground(Color.WHITE);
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel.setBounds(238, 10, 243, 56);
	getContentPane().add(lblNewLabel);
	
	JTextPane textPane = new JTextPane();
	textPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textPane.setBounds(30, 157, 249, 182);
	textPane.setText("Name : "+Data.Technicians.get(i).getName()+
			"\nContact : "+Data.Technicians.get(i).getContact()+
			"\nUsername : "+Data.Technicians.get(i).getName()
					+ "\nPassword : "+Data.Technicians.get(i).getPassword());
	
	getContentPane().add(textPane);
	
	JLabel lblNewLabel_1 = new JLabel("Data");
	lblNewLabel_1.setForeground(Color.WHITE);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	lblNewLabel_1.setBounds(103, 114, 62, 30);
	getContentPane().add(lblNewLabel_1);
    
	  DefaultListModel<String> l1 = new DefaultListModel<>();  
     
	  for(int j=0; j<Data.Technicians.get(i).DaysOfAvailibility.size(); j++) {
		  l1.addElement(Data.Technicians.get(i).DaysOfAvailibility.get(j));
	  }
	  
      JList<String> list = new JList<>(l1);  
      list.setFont(new Font("Tahoma", Font.PLAIN, 14));
      list.setBounds(437,157, 243,182);  
      getContentPane().add(list);
      
      JLabel lblNewLabel_1_1 = new JLabel("Availaibility");
      lblNewLabel_1_1.setForeground(Color.WHITE);
      lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
      lblNewLabel_1_1.setBounds(497, 114, 132, 30);
      getContentPane().add(lblNewLabel_1_1);
      
      JButton btnNewButton = new JButton("Appoint");
      btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
      btnNewButton.setBounds(300, 449, 108, 43);
      getContentPane().add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("back");
      btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
      btnNewButton_1.setBounds(617, 471, 85, 21);
      getContentPane().add(btnNewButton_1);
      
		ImageIcon icon=new ImageIcon("C:\\Users\\intag\\Desktop\\bg.jpg");

      JLabel lblNewLabel_2 = new JLabel(icon);
      lblNewLabel_2.setBounds(0, 0, 712, 502);
      getContentPane().add(lblNewLabel_2);
		
      btnNewButton_1.addActionListener(new ActionListener() {

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
      
     btnNewButton.addActionListener((ActionListener) new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
           
		if(list.getSelectedIndex()!=-1) {
		Data.Technicians.get(i).setAppointment(list.getSelectedIndex());
		
		JOptionPane.showMessageDialog(null, "Technician Appointed");
			l1.removeElementAt(list.getSelectedIndex());
		}
		else {
			JOptionPane.showMessageDialog(null, "Kindly Select Any Day");

		}	
		}
    	 
     }); 
      
	}
}
