import java.util.Scanner;
public class Bai19 {
    public static void main(String[] ages){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap chuoi;");
        String n = scanner.nextLine();
        int dem = 0;
        for ( int i = 0; i < n.length();i++){
            System.out.println(n.charAt(i));
            if (n.charAt(i) == 'a'){
                dem += 1;
            }
        }
        System.out.println(dem);
    }
}