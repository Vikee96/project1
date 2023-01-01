package bojecttopic;

 public class Sample extends Object
{
	public String toString()//overriding
	{
	return "hello";	
	}
public static void main(String[] args) {
	Sample s1=new Sample();
	System.out.println(s1);
	//System.out.println(s1.toString());
	System.out.println(s1.toString());
}
}