package Keywords;

public class StudentData 
{
	//Blank final variable
	   final int ROLL_NO;

	   StudentData(int rnum)
	   {
	      //It must be initialized in constructor
	      ROLL_NO=rnum;
	   }
	   void myMethod(){
	      System.out.println("Roll no is:"+ROLL_NO);
	   }
	   public static void main(String args[])
	   {
	      StudentData obj=new  StudentData(21);
	      obj.myMethod();
	   }

}
