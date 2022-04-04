import java.util.Scanner;
public class j_1226 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] a = new int[7];
    int[] b = new int[6];
    int result = 0;
    int bonus = 0;
    for(int i = 0; i < 7; i++){
      a[i] = scan.nextInt();
    }
    for(int i = 0; i < 6; i++){
      b[i] = scan.nextInt();
    }
    for(int i = 0; i < 6; i++){
      for(int j = 0; j < 6; j++){
        if(a[i] == b[j]){
          result++;
        }
      }
    }

    for(int i = 0; i < 1; i++){
      for(int j = 0; j < 6; j++){
        if(a[6] == b[j]){
          bonus++;
        }
      }
    }

    if(result == 6){
      System.out.print("1");
    } else if(result + bonus == 6 ){
      System.out.print("2");
    } else if(result == 5){
      System.out.print("3");
    } else if(result == 4){
      System.out.print("4");
    } else if(result == 3){
      System.out.print("5");
    } else{
      System.out.print("0");
    }
  }
}