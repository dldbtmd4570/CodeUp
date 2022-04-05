import java.util.Scanner;
public class j_1259 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<n+1;i++)
            if (i%2==0)
                sum += i;
        System.out.printf("%d",sum);
    }
}