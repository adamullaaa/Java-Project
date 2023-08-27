import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;

public class Form4 extends JFrame {
	private JTextField textField;
	private JTable table;
public Form4() throws FileNotFoundException {
	getContentPane().setBackground(Color.WHITE);
	setDefaultCloseOperation(Data.Exit());
    String col[] = {"Name","Contact", "ID", "Username", "Password"};

	DefaultTableModel model = new DefaultTableModel(col,0);
    Object rowData[] = new Object[5];
	this.setSize(1062,603);
     getContentPane().setLayout(null);
     
     JLabel lblNewLabel = new JLabel("Enter ID");
     lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
     lblNewLabel.setBounds(294, 25, 187, 33);
     getContentPane().add(lblNewLabel);
     
     textField = new JTextField();
     textField.setBounds(418, 25, 194, 33);
     getContentPane().add(textField);
     textField.setColumns(10);
     

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
		
		
     
     
     JButton btnNewButton = new JButton("Search");
     btnNewButton.setBackground(Color.WHITE);
     btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
     btnNewButton.setBounds(632, 26, 130, 33);
     getContentPane().add(btnNewButton);
  
     
     
     
     btnNewButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
boolean flag=false; 
int index=-1;
			String Id=textField.getText();
             for(int i=0; i<Data.customers.size(); i++) {
            	 if(Data.customers.get(i).getCustomerID().equals(Id)) {
        flag=true;   
        index=i;
        
            	 }
             }
		if(flag==false) {JOptionPane.showMessageDialog(null,"Not Found");}	
		else {
		
			JOptionPane.showMessageDialog(null,"Name   Contact    ID   Username    Password\n"+
					                           Data.customers.get(index).getName()+"    "+
			                                   Data.customers.get(index).getContact()+"    "+
				                               Data.customers.get(index).getCustomerID()+"    "+
					                           Data.customers.get(index).getUsername()+"    "+
		                             	       Data.customers.get(index).getPassword());
			
		}
		}
    	 
    	 
     });
     
     
     

     
     
 
     

     for(int i = 0; i < Data.customers.size(); i++)
     {
         rowData[0] = Data.customers.get(i).getName();
         rowData[1] = Data.customers.get(i).getContact();
         rowData[2] = Data.customers.get(i).getCustomerID();
         rowData[3] = Data.customers.get(i).getUsername();
         rowData[4] = Data.customers.get(i).getPassword();

         model.addRow(rowData);}  
         
JTable jt=new JTable(model);    
jt.setFont(new Font("Tahoma", Font.PLAIN, 18));
jt.setBounds(0,200,1048,303);    
getContentPane().add(jt);
JLabel lblNewLabel_1 = new JLabel("Name");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1.setBounds(10, 144, 97, 39);
getContentPane().add(lblNewLabel_1);
JLabel lblNewLabel_1_1 = new JLabel("Contact");
lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_1.setBounds(212, 144, 130, 39);
getContentPane().add(lblNewLabel_1_1);
JLabel lblNewLabel_1_2 = new JLabel("ID");
lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_2.setBounds(418, 144, 97, 39);
getContentPane().add(lblNewLabel_1_2);
JLabel lblNewLabel_1_3 = new JLabel("Username");
lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_3.setBounds(618, 144, 143, 39);
getContentPane().add(lblNewLabel_1_3);
JLabel lblNewLabel_1_4 = new JLabel("Password");
lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_4.setBounds(840, 144, 143, 39);
getContentPane().add(lblNewLabel_1_4);
table = new JTable(model);
table.setBounds(10, 557, 1028, -394);




}
}
