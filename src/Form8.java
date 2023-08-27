import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.FileNotFoundException;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;

public class Form8 extends JFrame {
	private JTable table;
public Form8() throws FileNotFoundException {
	System.out.println(Data.Technicians.size());
	getContentPane().setBackground(Color.WHITE);
	setDefaultCloseOperation(Data.Exit());
    String col[] = {"Name","Contact", "Username", "Password"};

	DefaultTableModel model = new DefaultTableModel(col,0);
    Object rowData[] = new Object[4];
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
     
     
     for(int i = 0; i < Data.Technicians.size(); i++)
     {
         rowData[0] = Data.Technicians.get(i).getName();
         rowData[1] = Data.Technicians.get(i).getContact();
         rowData[2] = Data.Technicians.get(i).getUsername();
         rowData[3] = Data.Technicians.get(i).getPassword();

         model.addRow(rowData);}  
         
JTable jt=new JTable(model);    
jt.setFont(new Font("Tahoma", Font.PLAIN, 18));
jt.setBounds(0,127,1048,303);    
getContentPane().add(jt);
JLabel lblNewLabel_1 = new JLabel("Name");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1.setBounds(10, 26, 97, 39);
getContentPane().add(lblNewLabel_1);
JLabel lblNewLabel_1_1 = new JLabel("Contact");
lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_1.setBounds(210, 36, 130, 39);
getContentPane().add(lblNewLabel_1_1);
JLabel lblNewLabel_1_3 = new JLabel("Username");
lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_3.setBounds(485, 36, 143, 39);
getContentPane().add(lblNewLabel_1_3);
JLabel lblNewLabel_1_4 = new JLabel("Password");
lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
lblNewLabel_1_4.setBounds(820, 36, 143, 39);
getContentPane().add(lblNewLabel_1_4);

JButton btnNewButton = new JButton("Appoint");
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
btnNewButton.setBounds(445, 485, 108, 39);
getContentPane().add(btnNewButton);

btnNewButton.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
       
		if(jt.getSelectedRow()!=-1) {
			Form9 f = null;
			try {
				f = new Form9(jt.getSelectedRow());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			f.setVisible(true);
			dispose();
		}
		
	}
	
});


table = new JTable(model);
table.setBounds(10, 557, 1028, -394);




}
}
