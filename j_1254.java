import java.util.Scanner;
public class j_1254 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        char b=s.next().charAt(0);
        for(int i=(int)a;i<=(int)b;i++)
            System.out.printf("%c ",i);
    }
}