import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Q_2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int treeNum=Integer.parseInt(st.nextToken());
		int obj=Integer.parseInt(st.nextToken());
		int tree[]=new int[treeNum];
		
		int max=0;
		int min=0;

	
		st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<treeNum;i++) {
			tree[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max,tree[i]);
		}

		while(max>=min) {
			int mid=(max+min)/2;
			long sum=0;
			
			for(int height:tree) {
				if(height-mid>0) {
					sum+=height-mid;
				}
			}
			
			if(sum<obj) {
				max=mid-1;
			}else{
				min=mid+1;
			}
		}
			System.out.println(max);
			br.close();


	}

}
