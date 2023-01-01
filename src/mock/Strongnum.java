package mock;

public class Strongnum {
public static void main(String[] args) {
	int no=145;
	int copy=no;
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		int no1=rem;
		int fact=1;
		for(int i=no1;i>=1;i--)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		no=no/10; 
	}
	if(copy==sum)
	{
		System.out.println("the number is strong");
	}
	else{
		System.out.println("it is not strong number");
	}
}
}
