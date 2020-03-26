package lang;

public class Sample {

	public static void main(String[] args) 
	{
		Object ob1=new Object();
		Object ob2=new Object();
		Object ob3=ob2;
		System.out.println("HashCode value:"+ob1.hashCode());
		String str=ob1.toString();
		System.out.println("Hexa value:"+str);
		boolean b1=ob1.equals(ob2);
		boolean b2=ob2.equals(ob3);
		System.out.println(b1);
		System.out.println(b2);
	}

}
