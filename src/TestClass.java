import java.util.Random;

public class TestClass {


	
	public static void main(String[] args)
	{
		MessagePrint m1 = new MessagePrint();
		System.out.println(m1.toMilitary());
		m1.setTime(13,12,3);
		System.out.println(m1.toMilitary());
		System.out.println(m1.toString());
	}
	
	
}
