import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double a,b,c,u,d;
        System.out.print("Lütfen 1. kenarın ölçüsünü giriniz : ");
        a = input.nextDouble();
        System.out.print("Lütfen 2. kenarın ölçüsünü giriniz : ");
        b = input.nextDouble();
        System.out.print("Lütfen 3. kenarın ölçüsünü giriniz : ");
        c = input.nextDouble();
        u = (a+b+c)/2;
        d = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgeninizin alanı : " + d);





    }
}