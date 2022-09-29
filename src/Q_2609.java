import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Q_2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String num[]=br.readLine().split(" ");
		
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		
		int k;
		int gcd=0;
		int lcm=0;
		
		if(a>b)k=b;
		else k=a;
		
		for(;k>=1;k--) {
			if(a%k==0&&b%k==0) {
				gcd=k;
				break;
			}
		}
		lcm=(a*b)/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}

}

