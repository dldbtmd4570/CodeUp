import java.util.Scanner;
public class j_1231 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String n1="",n2="";
		int index=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='+' || a.charAt(i)=='-'
			|| a.charAt(i)=='*' ||a.charAt(i)=='/')
				index=i;
		}
		for(int i=0;i<index;i++)
			n1+=a.charAt(i);
		for(int i=index+1;i<a.length();i++)
			n2+=a.charAt(i);
		if(a.charAt(index)=='+')
			System.out.print(Integer.parseInt(n1)+Integer.parseInt(n2));
		else if(a.charAt(index)=='-')
			System.out.print(Integer.parseInt(n1)-Integer.parseInt(n2));
		else if(a.charAt(index)=='*')
			System.out.print(Integer.parseInt(n1)*Integer.parseInt(n2));
		else
			System.out.printf("%.2f",(double)Integer.parseInt(n1)/Integer.parseInt(n2));
	}
}