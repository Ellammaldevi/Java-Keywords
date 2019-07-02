package Keywords;

public class Children 
{
	int stid;  
    String stname;  
    Children()  
    {  
        System.out.println("default constructor is invoked");  
    }  
    Children(int stid, String stname)  
    {  
        this();  
        this.stid = stid;  
        this.stname = stname;  
    }  
    void print()  
    {  
        System.out.println(stid + " " + stname);  
    }  
    public static void main(String args[])  
    {  
        Children st1 = new Children(12, "Lishvanth");  
        Children st2 = new Children(22, "Subash");  
        st1.print();  
        st2.print();  
    }  

}
