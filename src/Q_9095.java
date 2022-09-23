import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int dp[]=new int[11];
        //dp[n]은 1이 n개 일때 나타내는 방법의 수

        //계산 가능한 초기값
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i=0;i<T;i++) {
            int n = Integer.parseInt(br.readLine());
            //경우의 수로 나누기
            //첫번째 자리의 숫자가 1,2,3 인 경우로 나누어 계산
            //1인 경우, 남은 1은 n-1개 --> dp[n-1]
            //2인 경우, 남은 1은 n-2개 --> dp[n-2]
            //3인 경우, 남은 1은 n-3개 --> dp[n-3]

            for(int j=4;j<=n;j++){
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            System.out.println(dp[n]);
        }


    }
}
