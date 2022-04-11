import java.util.Scanner;
public class j_1294 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				if(str.charAt(i)>='x')
					System.out.printf("%c", str.charAt(i)-23);
				else
					System.out.printf("%c",str.charAt(i)+3);
			}
			else
				System.out.printf(" ");
		}
	}
}