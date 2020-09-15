import java.util.Scanner;
class area
{
		
		public static void main(String args[])
	{
				Scanner s=new Scanner(System.in);
				double pi,r,a;
		
				pi=3.14;
				System.out.print("Enter R=");
				r=s.nextDouble();
				
				a=pi*r*r;
			
				
				System.out.print("area="+a);
	}
}