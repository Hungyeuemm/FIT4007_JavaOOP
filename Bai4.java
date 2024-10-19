import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        int Tong = 0;
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                for (int i = 1; i <= n; i++) {
                    Tong += i;
                }
                System.out.println(Tong);
            } catch (NumberFormatException e) {
                System.out.println("Sai");
            }

        }
        else {
            System.out.println("VUi long nhap N");
        }

    }
}
