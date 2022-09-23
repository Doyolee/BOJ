import java.util.*;
public class Q_2439 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1~100사이의 정수를 입력하세요");
		int input=sc.nextInt();

		for(int i=1;i<=input;i++) {
			for(int k=0;k<input-i;k++)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
		
		System.out.println();
		}
		

	}

}
