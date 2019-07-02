package Keywords;

import java.io.IOException;

public class TestThrows 
{
	void main()throws IOException
	  {  
	    throw new IOException("device error");//checked exception  
	  }  
	  void net()throws IOException
	  {  
	    main();  
	  }  
	  void p()
    {  
	   try
	   {  
	    net();  
	   }
	   catch(Exception e)
	   {
		   System.out.println("exception handled");
	   }  
	}  
	  public static void main(String args[])
	  {  
	   TestThrows obj=new TestThrows();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  

}
