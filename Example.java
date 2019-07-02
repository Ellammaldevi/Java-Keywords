package Keywords;
class Parent 
  { 
	
  } 
class Child extends Parent
    {
	
	} 
public class Example 
{
	public static void main(String[] args) 
    { 
        Child lish = new Child(); 
  
        if (lish instanceof Child) 
           System.out.println("lish is instance of Child"); 
        else
           System.out.println("lish is NOT instance of Child"); 
  
        if (lish instanceof Parent) 
           System.out.println("lish is instance of Parent"); 
        else
           System.out.println("lish is NOT instance of Parent"); 
  
        if (lish instanceof Object) 
           System.out.println("lish is instance of Object"); 
        else
           System.out.println("lish is NOT instance of Object");            
    } 

}
