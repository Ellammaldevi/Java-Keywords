package Keywords;

class Person 
   {
	  protected String fname = "Ajay";
	  protected String lname = "Santhosh";
	  protected String email = "ajay14@gmail.com";
	  protected int age = 24;
	}

public class ProtectedDemo extends Person
{
	private int graduationYear = 2018;
	  public static void main(String[] args)
	  {
	    ProtectedDemo myObj = new ProtectedDemo();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	  }
}
	


