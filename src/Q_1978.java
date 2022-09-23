import java.io.*;
import java.util.StringTokenizer;
 
public class Q_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int answer=0;
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int n2=Integer.parseInt(st.nextToken());
			boolean p=true;//소수는 true 아니면 false
			
			if(n2==1)
				continue;
			
			for(int i=2;i<=Math.sqrt(n2);i++) { 
				if(n2%i==0) {
					p=false;
					break;
				}
			}
			if(p==true)
				answer++;

			
		}
		System.out.println(answer);
	}

}
