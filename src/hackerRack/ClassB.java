package hackerRack;

public class ClassB {
	
	static String str;
	
	public void ClassB()
	{
		System.out.println("In constructor");
		str="Hello World";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassB cl = new ClassB();
    System.out.println(str);
	}

}

