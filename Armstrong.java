import java.util.Scanner;
class Armstrong
{

	public static void main(String[] arg)
	{
	int a,num=0,n,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	temp=n;
	for( ;n!=0;n/=10 )
	{
		a=n%10;
		num=num+(a*a*a);
	}
	if(num==temp)
	System.out.println(temp+" is a armstrong number ");
	else
	System.out.println(temp+" is not a armstrong number ");
     }
}