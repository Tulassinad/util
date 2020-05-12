public class MatTranspose
{
	int n = 5;
	int m = 6;
	String val = "";
	public static void main(String[] arg)
	{
		int a[][] = new int[n][m];
		int b[][] = new int[m][n];

		for(int i = 0 ; i<n; i++)
		{
			for(int j =0 ; j<m;j++)
			{
				a[i][j] = j;
				val = val+" "+j;
			}
			System.out.println(val);
			val = "";
		}
		System.out.println("---------------");
		transpose(a,b,0,n-1,0,m-1);
		for(int i = 0 ; i<m; i++)
		{
			val = "";
			for(int j =0 ; j<n;j++)
			{
				val = val+" "+b[i][j];
			}
			System.out.println(val);
		}
	}

	public static void transpose(int a[][], int b[][], int i1, int i2, int j1, int j2)
	{
		if(i1 == i2 || j1 == j2)
		{
			for(int i = i1; i<= i2; i++)
			{
				for(int j = j1;j<=j2;j++)
				{
					b[j][i] = a[i][j];
				}
			}
		}
		else
		{
			int imid = (i1+i2)/2;
			int jmid = (j1+j2)/2;
			transpose(a,b,i1,imid,j1,jmid);
			transpose(a,b,imid+1,i2,j1,jmid);
			transpose(a,b,imid+1,i2,jmid+1,j2);
			transpose(a,b,i1,imid,jmid+1,j2);//if using differnt arrays say A and B
			/*if(i1>=jmid+1)//if using same array say A alone
			{
				transpose(a,b,i1,imid,jmid+1,j2);
			}*/
		}
		return;
	}	
}
