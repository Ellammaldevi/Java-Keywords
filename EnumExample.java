package Keywords;

enum Mobile
{
	Samsung(400), Nokia(300), Vivo (500), Honor (800);
	int price;
	Mobile(int p)
	{
		price = p;
	}
	int showPrice()
	{
		return price;
	}
}

public class EnumExample 
{
	public static void main(String args[])
	{
		System.out.println("CellPhone List");
		for(Mobile m : Mobile.values())
		{
			System.out.println(m + "costs" + m.showPrice() + "dollars");
		}
		Mobile ret;
		ret = Mobile.valueOf("Vivo");
		System.out.println("Selected : " + ret);
	}
}
