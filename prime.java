package inter;

import java.util.Scanner;

public class prime 
{
static Scanner d=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter the lower number");
	int n1=d.nextInt();
	System.out.println("enter the last number:");
	int n2=d.nextInt();
	while(n2>=n1) 
	{
		int count=0;
	for(int i=1;i<=n1;i++)
	{
		if(n1%i==0)
		{
			count++;
		}
	}         
		
	if(count==2)
	{
		System.out.print(n1+" ");
		count=count-2;
	}//1st for
	
	n1++;
	}
}
}
