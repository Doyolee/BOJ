import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T=Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine());
            int max=1;
            int employee[]=new int[N];

            for(int j=0;j<N;j++){
                st=new StringTokenizer(br.readLine()," ");
                int s1=Integer.parseInt(st.nextToken());
                int s2 = Integer.parseInt(st.nextToken());
                employee[s1-1]= s2;
            }

            int first=employee[0];
            for(int j=1;j<N;j++){
                if(first>employee[j]) {
                    first=employee[j];
                    max++;
                }

            }
            System.out.println(max);
        }

    }
}

