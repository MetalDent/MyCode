//q46
public class copyConstructor {

	public static void main(String[] args) {
		
		Department details = new Department(23, "AMRITA");	
		details.display();
		Department clone = new Department(details);
		clone.display();
	}
}
class Department {
 
    private String name;
    private int id;
 
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public Department(Department oldDepartment) {
        this.id = oldDepartment.id;
        this.name = oldDepartment.name;
    }
    public void display(){

    	System.out.print("\nID: " + id + "\nName: " + name);
    }
}