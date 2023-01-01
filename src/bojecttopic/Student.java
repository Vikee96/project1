package bojecttopic;

public class Student
{
int s_id;
String s_name;
Student(int s_id,String s_name)
{
	this.s_id=s_id;
	this.s_name=s_name;
}
public String toString()
{
	return"student name is "+this.s_name
			+"\n student id is "+this.s_id;
}
public static void main(String[] args)
{
Student s1=new Student(123,"dinga");
System.out.println(s1);//implicitly
Student s2=new Student(143,"dingi");
System.out.println(s2.toString());//explicitly

}
}
