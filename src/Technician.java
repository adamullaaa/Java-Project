import java.util.ArrayList;

public class Technician extends Person{

	ArrayList<String> DaysOfAvailibility=new ArrayList<String>();
 ArrayList <String> DayOfAppointment=new ArrayList<>();
ArrayList<String> Feedbacks =new ArrayList<>();	
 
	public Technician(String name, String username, String password, String contact) {
		super(name, username, password, contact);
       setDays();
	   
	}

	public ArrayList<String> getDaysOfAvailibility() {
		return DaysOfAvailibility;
	}

	public void setDaysOfAvailibility(ArrayList<String> daysOfAvailibility) {
		DaysOfAvailibility = daysOfAvailibility;
	}
	
	public void setDaysOfAvailibility(String[] daysOfAvailibility) {

		for(int i=0; i<daysOfAvailibility.length; i++) {
			this.DaysOfAvailibility.add(daysOfAvailibility[i]);
		}
	}

	
	public void setAppointment(int index) {
		DayOfAppointment.add(DaysOfAvailibility.get(index));
		DaysOfAvailibility.remove(index);
		
	}
	
	public void setDays() {
		DaysOfAvailibility.add("Monday");
		DaysOfAvailibility.add("Tuesday");
		DaysOfAvailibility.add("Wednesday");
		DaysOfAvailibility.add("Thursday");
		DaysOfAvailibility.add("Friday");
		DaysOfAvailibility.add("Saturday");
		DaysOfAvailibility.add("Sunday");

	}

	public void setDaysOfAppointment(String[] bdays) {
for(int i=0; i<bdays.length; i++) {
	DayOfAppointment.add(bdays[i]);
}
		
	}

	public void setFeedbacks(String[] f) {
for(int i=0; i<f.length; i++) {
	Feedbacks.add(f[i]);
}
		
	}



}
