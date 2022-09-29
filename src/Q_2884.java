import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2884 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String num[]=br.readLine().split(" ");
		int H=Integer.parseInt(num[0]);
		int M=Integer.parseInt(num[1]);
		
		if(M-45<0) {
			M+=15;
			if(H==0)
				H=23;
			else
				H-=1;
		}else {
			M-=45;
		}
		
		System.out.print(H+" "+M);


	}
 
}
