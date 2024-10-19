public class Bai3 {
    public static void main(String[] ages){
        // Bien tính tổng
        int Total = 0;
        // quy trình tính tổng các số bội của 7 từ 1-100
        for ( int i = 1; i <= 100; i++ ){
            if (i % 7 == 0){
                Total += i;
            }
        }
        // đầu ra hiện thị tổng
        System.out.println(Total);
    }
}
