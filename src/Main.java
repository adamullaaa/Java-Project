import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		MainForm f=new MainForm();
		f.setVisible(true);
        Data.populateCustomers();
        Data.populateTechnicians();

        f.setDefaultCloseOperation(Data.Exit());

        
	}
}
