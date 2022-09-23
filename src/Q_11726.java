import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int dp[]=new int[1001];

        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++) {
            dp[n] = dp[n - 1] + dp[n - 2]%10007;
        }
        System.out.println(dp[n]);
    }
}
