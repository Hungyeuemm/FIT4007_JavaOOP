import java.util.Scanner;
public class Bai17 {
    public static void main(String[] ages){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap n:");
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println("so chan");
        } else if (n == 0) {
            System.out.println("zezo");
        }
        else {
            System.out.println("so le");
        }

    }
}
