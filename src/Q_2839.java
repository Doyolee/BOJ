import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int result=0;

        // 5키로 봉지를 최대한 많이 쓰고 남은 킬로그램이 3의 배수인 경우를 찾는 반복문
        // 5킬로 봉지의 최대값부터 반복문 실행해서 0까지
        for(int i=N/5;i>=0;i--) {

            //5킬로 봉지를 뺸 무게가 3킬로그램이 아니면 continue로 다음 반복문 실행
            int n=N-(5*i);
            if(n%3!=0){

                //끝까지 답을 찾지 못하면 -1 출력
                if(i==0)
                    result=-1;
                continue;
            }else{
                //찾을 경우 봉지 수를 구함
                result=i+(n/3);
                break;
            }
        }
        System.out.println(result);
    }
}
