package basics;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
for(int i=0;i<=n;i++)
{
	for(int j=0;j<=n-i;j++)
	{
		System.out.print(" ");
	}
	for(int u=0;u<=i ;u++)
	{
		System.out.print("*");
	}
	System.out.println();
	
}

	}

}
