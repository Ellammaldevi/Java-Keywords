package Keywords;

public class Employee 
{
	   int id;
	   String name;
	   static String companyName ="GITS";

	   Employee(int i,String n)
	   {
	   id = i;
	   name = n;
	   }

	 void display ()
	 {
		 System.out.println(id+" "+name+" "+companyName);
	 }

	 public static void main(String args[])
	 {
	 Employee e1 = new Employee(12115,"Jefi");
	 Employee e2 = new Employee(22313,"Jothi");
	 Employee e3 = new Employee(12117,"Kalai");
	 Employee e4 = new Employee(12118,"Arun");

	 e1.display();
	 e2.display();
	 e3.display();
	 e4.display();
	 }
}
