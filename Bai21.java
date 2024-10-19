import java.util.StringTokenizer;
public class Bai21 {
    public static void main(String[] ages){
        String n = "Bai Tap Mon Lap Trinh Java";
        StringTokenizer vh = new StringTokenizer(n," ");
        while (vh.hasMoreTokens()){
            System.out.println(vh.nextToken());
        }
        
    }
}
