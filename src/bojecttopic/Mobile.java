package bojecttopic;

public class Mobile {
int mob_cost;
String mob_brd;
String mob_colour;
Mobile(int mob_cost,String mob_brd,String mob_colour)
{
this.mob_cost=mob_cost;
this.mob_brd=mob_brd;
this.mob_colour=mob_colour;
}
public String toString()
{
	return "mobile cost is "+this.mob_cost
			+"\n mobile brand is "+this.mob_brd
			+"\n mobile colour is "+this.mob_colour;
}
public static void main(String[] args)
{
Mobile m1=new Mobile(16000,"poco","yellow");
System.out.println(m1);
}
}
