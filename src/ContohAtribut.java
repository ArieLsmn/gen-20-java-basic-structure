//kelas hari 3

import java.util.Scanner;

public class ContohAtribut {

    String nama = "Ari";
    int usia = 25;

    static String nama2 = "Bob";
    static int usia2 = 26;

    public ContohAtribut(){

    }
    public ContohAtribut(String nama, int usia){
        this.nama=nama;
        this.usia=usia;
    }

    public static void main(String[] args) {

        System.out.println("Name static: "+nama2);
        System.out.println("Age static: "+usia2);

        ContohAtribut test1 = new ContohAtribut();

        System.out.println("Name non static: "+test1.nama);
        System.out.println("Age non static: "+test1.usia);

        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String nama = in.nextLine();
        System.out.println("Input age: ");
        int usia = in.nextInt();

        ContohAtribut test2 = new ContohAtribut(nama,usia);
        System.out.println("New name: "+test2.nama);
        System.out.println("New age: "+test2.usia);
    }
}
