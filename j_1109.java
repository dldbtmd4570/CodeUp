import java.util.Scanner;
public class j_1109 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.next();
		int age=s.nextInt();
		char code=s.next().charAt(0);
		float security_key=s.nextFloat();
		System.out.println(name);
		System.out.println(age);
		System.out.println(code);
		System.out.println(security_key);
	}
}