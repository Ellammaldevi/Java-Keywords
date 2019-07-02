package Keywords;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


@SuppressWarnings("serial")
public class Test implements Serializable
{
	int i = 10, j = 20; 
	  
    // Transient variables 
    transient static int k = 30; 
  
    // Use of transient has no impact here 
    transient static int l = 40; 
    transient final int m = 50; 
  
    @SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception 
    { 
        Test input = new Test(); 
  
        // serialization 
        FileOutputStream fos = new FileOutputStream("abc.txt"); 
        @SuppressWarnings("resource")
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(input); 
  
        FileInputStream fis = new FileInputStream("abc.txt"); 
        @SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis); 
        Test output = (Test)ois.readObject(); 
        System.out.println("i = " + output.i); 
        System.out.println("j = " + output.j); 
        System.out.println("k = " + output.k); 
        System.out.println("l = " + output.l);   
        System.out.println("m = " + output.m);

     }
}
