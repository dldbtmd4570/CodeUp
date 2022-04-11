import java.util.Scanner;
public class j_1295 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.printf("%c", str.charAt(i)-32);
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				System.out.printf("%c", str.charAt(i)+32);
			}
			else
				System.out.printf("%c", str.charAt(i));
		}
	}
}
