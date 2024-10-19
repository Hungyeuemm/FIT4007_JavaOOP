

public class Bai1 {
    public static void main(String[] args) {
        int i = 0;
        int dem = 0;
        int Tong = 0;
        while (true){
            System.out.println(i);
            i += 2;
            dem ++;
            Tong += i;
            if ( dem >= 10){
                break;
            }
        }
        System.out.println(Tong);
    }
}