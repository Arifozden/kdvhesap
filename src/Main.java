import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar;
        double kdv=0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucreti giriniz");

        tutar=input.nextDouble();

        double kdvTutari=tutar*kdv;
        double kdvliTutar=tutar+kdvTutari;

        System.out.println(kdvTutari);
        System.out.println(kdvliTutar);


    }
}