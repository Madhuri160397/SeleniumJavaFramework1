package Java;

public class Java_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Java_Methods j = new Java_Methods();
        String name=j.helloWorld();
		System.out.println(name);
		
		String name1= hellocity1();
		System.out.println(name1);
		
		Java_Methods2 j2 = new Java_Methods2();
		String name2=j2.helloState2();
		System.out.println(name2);
		
		
	}
	public String helloWorld()
	{
		System.out.println("Hello world");
		return "Hello world";
	}

	public static String hellocity1()
	{
		System.out.println("Hello City1");
		return "Hello City1";
	}

}
