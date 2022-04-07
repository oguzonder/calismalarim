package Team.src.calismalarim;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        // KDV hesaplama

        double tutar,kdvliFiyat,kdv=0.8;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tutarı giriniz : ");
        tutar=scan.nextDouble();
        kdvliFiyat=tutar + (tutar*kdv);
        System.out.println("Urunun kdv li fiyatı : " + kdvliFiyat);
        
        // entegrasyon guncelleme_deneme

}
    }
