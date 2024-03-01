//kelas hari 4
import java.util.Scanner;
public class KelipatanTigaTanpaDua {


    public static boolean mod3Not2(int x){
        return x % 2 != 0;
    }

    public static void main(String[] args) {


        Scanner in= new Scanner(System.in);
        System.out.println("Input berapa banyak angka kelipatan 3 tanpa 2 yang ditampilkan:");
        int n = in.nextInt();
        int i=0;
        int x=3;
        while(i<n){
            if(mod3Not2(x)) {
                i++;
                System.out.print(x + " ");
            }
            x+=3;
        }
    }
}
