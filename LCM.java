import java.util.Scanner;
class LCMDEMO
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter both the number");
		int n1= s.nextInt();
		int n2= s.nextInt();
		int a=1,h,l,b=n1,c=n2;
		if(n1>n2)
		{
			do
			{
              a=n1%n2;
              n1=n2;
              n2=a;
			}
			while(a>0);
			h=n1;
		}
		else
		{
			do
			{
				a=n2%n1;
				n2=n1;
				n1=a;
			}
			while(a>0);
			h=n2;
		}
		l = (b*c)/h;
		System.out.println("LCM of two number is="+l);
		System.out.println("HCF of two number is="+h);
		
		
	}
}