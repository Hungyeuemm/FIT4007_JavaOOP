import java.util.Scanner;
public class Bai5 {
    public static void main(String[] ages){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Total = 0;
        if ( n % 2 == 0){
            for(int i = 2; i <= n; i+= 2){
                Total += i;
            }
        }
        else {
            for(int i = 1; i <= n; i += 2){
                Total += i;
            }
        }
        System.out.println(Total);
    }
}
