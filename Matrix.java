package basics;

public class Matrix {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{3,4,5}};
		int[][] b= {{7,8,3},{9,10,4},{11,12,7}};
int[][] c = new int[3][3];
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		c[i][j]=0;
		for(int k=0;k<3;k++)
		{
			c[i][j]=c[i][j]+(a[i][k])+(b[k][j]);
		}
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
		
	}

}
