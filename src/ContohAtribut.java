import java.util.Scanner;

public class ContohAtribut {

    static String nama1 = "Helloworld";
    static int usia1 = 123;

    String nama2 = "Halo halo";
    int usia2 = 777;

    public ContohAtribut(){

    }

    public static void main(String[] args) {

        System.out.println("Name: "+nama1);
        System.out.println("Age: "+usia1);

        ContohAtribut test = new ContohAtribut();

        System.out.println("Name non static: "+test.nama2);
        System.out.println("Age non static: "+test.usia2);

        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        nama1 = in.nextLine();
        System.out.println("Input age: ");
        usia1 = in.nextInt();

        System.out.println("New name: "+nama1);
        System.out.println("New age: "+usia1);
    }
}
