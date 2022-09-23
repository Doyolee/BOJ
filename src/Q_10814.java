//나이순 정렬
import java.util.*;
public class Q_10814 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력");
		int n=sc.nextInt();
		
		User[] u=new User[n];
		
		for(int i=0;i<n;i++) {
		System.out.println("나이 입력");
		int age=sc.nextInt();
		System.out.println("이름 입력");
		String name=sc.next();
		
		u[i]=new User(i, age,name);
		}
		
		Arrays.sort(u, new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.age-u2.age;
			}
		});
		
		for(User us:u) {
			System.out.println(us.age+" "+us.name);
		}
	}
	
	static class User{
	
		int num;
		int age;
		String name;
		
		User(int num,int age,String name){
			this.num=num;
			
			this.age=age;
			this.name=name;
		}
	}

}
