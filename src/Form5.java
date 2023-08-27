import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;

public class Form5 extends JFrame {
public Form5() throws FileNotFoundException {
	getContentPane().setBackground(Color.WHITE);
	setDefaultCloseOperation(Data.Exit());
    String col[] = {"Name","Contact", "ID", "Username", "Password"};

	DefaultTableModel model = new DefaultTableModel(col,0);
	Object rowData[] = new Object[5];
	this.setSize(1062,603);
     getContentPane().setLayout(null);
     

		JButton btnNewButton_4 = new JButton("back");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(935, 527, 85, 29);
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
     
     
     

     
     
 
     
     Data.customers.add(new Customer("X","Y","j","S","s"));
     Data.customers.add(new Customer("X","Y","Z","S","s"));
     Data.customers.add(new Customer("X","Y","Z","S","s"));

     for(int i = 0; i < Data.customers.size(); i++)
     {
         rowData[0] = Data.customers.get(i).getName();
         rowData[1] = Data.customers.get(i).getContact();
         rowData[2] = Data.customers.get(i).getCustomerID();
         rowData[3] = Data.customers.get(i).getUsername();
         rowData[4] = Data.customers.get(i).getPassword();

         model.addRow(rowData);
         }  
JTable jt=new JTable(model);    
jt.setFont(new Font("Tahoma", Font.PLAIN, 18));
jt.setBounds(0,97,1048,406);    
getContentPane().add(jt);
JLabel lblNewLabel_1 = new JLabel("Name");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1.setBounds(10, 27, 97, 39);
getContentPane().add(lblNewLabel_1);
JLabel lblNewLabel_1_1 = new JLabel("Contact");
lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_1.setBounds(197, 27, 130, 39);
getContentPane().add(lblNewLabel_1_1);
JLabel lblNewLabel_1_2 = new JLabel("ID");
lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_2.setBounds(407, 27, 97, 39);
getContentPane().add(lblNewLabel_1_2);
JLabel lblNewLabel_1_3 = new JLabel("Username");
lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_3.setBounds(613, 27, 143, 39);
getContentPane().add(lblNewLabel_1_3);
JLabel lblNewLabel_1_4 = new JLabel("Password");
lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_4.setBounds(834, 27, 143, 39);
getContentPane().add(lblNewLabel_1_4);
JButton btnNewButton = new JButton("Update");
btnNewButton.setBackground(Color.WHITE);
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
btnNewButton.setBounds(434, 522, 109, 35);
getContentPane().add(btnNewButton);


btnNewButton.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {

		if(jt.getSelectedRow()!=-1) {
		Form6 f = null;
		try {
			f = new Form6(jt.getSelectedRow());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		f.setVisible(true);
		dispose();
		
		}}
	
});



}
}
