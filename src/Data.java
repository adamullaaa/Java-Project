import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class Data {

static ArrayList<Customer>customers=new ArrayList<>();
static ArrayList<Technician>Technicians=new ArrayList<>();


public static int Exit() throws FileNotFoundException {
WriteCustomers();
WriteTechnicians();
return 1;
}

public static void WriteCustomers() throws FileNotFoundException {
File f=new File("customers.txt");
PrintWriter print=new PrintWriter(f);
for(int i=0; i<customers.size(); i++) {
print.write(customers.get(i).getName()+","+customers.get(i).getUsername()+","+customers.get(i).getPassword()+","+customers.get(i).getPassword()+","+customers.get(i).getContact()+","+customers.get(i).getCustomerID());	
print.flush();	
}	
}

public static void populateCustomers() throws FileNotFoundException {
File f=new File("customers.txt");
Scanner scan=new Scanner(f);	

while(scan.hasNextLine()) {

	String line=scan.nextLine();
	String tokens[]=line.split(",");
	Customer c=new Customer(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4]);
	customers.add(c);
	}}


public static void WriteTechnicians() throws FileNotFoundException {
String days="";
String busyDays="";
String feedbacks="";
File f=new File("Technicians.txt");
PrintWriter print=new PrintWriter(f);
for(int i=0; i<Technicians.size(); i++) {
for(int j=0; j<Technicians.get(i).getDaysOfAvailibility().size(); j++) {
days=days+Technicians.get(i).getDaysOfAvailibility().get(j)+"/";	
}

for(int z=0; z<Technicians.get(i).DayOfAppointment.size(); z++) {
busyDays=busyDays+Technicians.get(i).Feedbacks.get(z)+"/";	
}

for(int a=0; a<Technicians.get(i).Feedbacks.size(); a++) {
feedbacks=feedbacks+Technicians.get(i).Feedbacks.get(a)+"/";	
}

print.write(Technicians.get(i).getName()+","+Technicians.get(i).getUsername()+","+Technicians.get(i).getPassword()+","+Technicians.get(i).getContact()+","+days+","+busyDays+","+feedbacks);	
print.flush();	
}	
}

public static void populateTechnicians() throws FileNotFoundException {
File f=new File("Technicians.txt");
Scanner scan=new Scanner(f);	

while(scan.hasNextLine()) {

	String line=scan.nextLine();
	String tokens[]=line.split(",");
	String days[]=tokens[4].split("/");
	String bdays[]=tokens[5].split("/");
	String feedbacks[]=tokens[6].split("/");
	
	Technician t=new Technician(tokens[0],tokens[1],tokens[2],tokens[3]);
    t.setDaysOfAvailibility(days);
	t.setDaysOfAppointment(bdays);
	t.setFeedbacks(feedbacks);
    Technicians.add(t);

}}


}
