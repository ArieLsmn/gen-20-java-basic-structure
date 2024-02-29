import java.util.Scanner;
public class KelipatanTigaTanpaDua {

    public static void main(String[] args) {


        Scanner in= new Scanner(System.in);
        System.out.println("Input berapa banyak angka yang ditampilkan:");
        int n = in.nextInt();
        int i=0;
        int x=3;
        while(i<n){
            if(x%2!=0) {
                i++;
                System.out.print(x + " ");
            }
            x+=3;
        }
    }
}
