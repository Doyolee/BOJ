import java.util.Scanner;
 
public class Q_2775 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		
		int apart[][]=new int[15][15];

		for(int i=0;i<apart.length;i++){

				for(int j=1;j<apart[i].length;j++) {
					if(i==0)
					{
						apart[i][j]=j;
					}else{
						if(j==1)
							apart[i][j]=apart[i-1][j];
						else 
							apart[i][j]=apart[i-1][j]+apart[i][j-1];
						
					}
				}
		}
		System.out.println(apart[k][n]);
	}
}
		
		
