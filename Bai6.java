import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhập số lượng phần tử của mảng: ");
      int n = sc.nextInt();
      int[] mang = new int[n];
      for (int i = 0; i < n; i++){
          System.out.printf("nhap "+ ( i + 1)+ ":");
          mang[i] = sc.nextInt();
      }
      int min = mang[0];
      int max = mang[0];
      for (int i = 0; i < n ;i++){
          if(mang[i] < min){
              min = mang[i];
          }
          if( mang[i] > max ){
              max = mang[i];
          }
      }
        System.out.println(max);
        System.out.println(min);
    }
}
