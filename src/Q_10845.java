import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_10845 {
	
	public static void main(String[] args) throws IOException{
		Queue<Integer> Q=new LinkedList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N= Integer.parseInt(br.readLine());//N 값
		int back=0;
		
		for(int i=0;i<N;i++) {
			String order[]=br.readLine().split(" ");
			 // "push X" 입력시 push와 X 분리해서 저장
			switch(order[0]) {
			case "push" :
			back=Integer.parseInt(order[1]);	
			Q.offer(back);
			
					break;
			case "pop" :
				if(Q.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(Q.poll()+"\n");
				}
				break;
			case "size":
				sb.append(Q.size()+"\n");
				break;
			case "empty":
				if(Q.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
				break;
			case "front":
				if(Q.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(Q.peek()+"\n");
				}
			
				break;
			case "back" :{
				if(Q.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(back+"\n");
				}
			}
			
				break;
			}
		}
		System.out.println(sb);

	}
}
