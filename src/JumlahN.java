//kelas hari 4
import java.util.Scanner;

public class JumlahN {


    public static int deretJumlah(int n){
        int x=0;
        System.out.print("1");
        for(int i=1;i<=n;i++){
            x+=i;

            if(i>1) System.out.print("+"+i);
        }
        System.out.println("=");
        return x;
    }

    public static void main(String[] args) {


        Scanner in= new Scanner(System.in);
        System.out.println("Input N berupa angka terakhir di deret:");
        int n = in.nextInt();

        System.out.println(deretJumlah(n));
    }

}
