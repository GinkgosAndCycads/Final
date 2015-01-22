//declare the task class and variables
public class Task {
    private String name;
    private String descrip;
//Method Overload task
    public Task(String name, String descrip) {
        this.name = name;
        this.descrip = descrip;
    }
//getName method
    public String getName() {
        return name;
    }
//setName method
    public void setName(String name) {
        this.name = name;
    }
//return the description parsed as a string
    public String getDescrip() {
        return descrip;
    }
//set the description to its current state
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    } 
//Validate whether the text boxes contain data or not
    public boolean validate(){
        if(name == null || descrip == null || name.equals("")||descrip.equals(""))
            return false;
        else
            return true;
    } //toString method - Print all related data
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + descrip + '}';
    }
    
}
