package KDVTutariHesaplayanProgram;

import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        //Değişken atıyoruz.
        double KDVsizTutar, KDVTutari, KDVliTutar;

        //Scanner sınıfımızı tanımlıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutari Giriniz : ");
        KDVsizTutar = inp.nextDouble();

        boolean Kosul1 = 1000 >= KDVsizTutar;
        double vOran = Kosul1 ? 0.18 : 0.08;
        System.out.println(vOran);

        KDVTutari = KDVsizTutar*vOran;
        KDVliTutar = KDVTutari+KDVsizTutar;

        System.out.println("KDV'siz Tutar : " + KDVsizTutar);
        System.out.println("KDV Oranı : " + vOran);
        System.out.println("KDV Tutarı : " + KDVTutari);
        System.out.println("KDV'li Tutar : " + KDVliTutar);
    }
}
