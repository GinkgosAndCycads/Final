//Declare Patient
public class Patient {
	private String name,status, wait; 
//Method Overload Patient
	public Patient(String nm, String stat){
		name=nm;
		status = stat;    
	} 
//toString method - Print all related data
        public String toString(){
		return "Name: " + name + "\tPriority: " + status;
	}
}
