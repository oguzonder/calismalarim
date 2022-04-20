package Team.src.Team;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    //1-Mesafe, 2-Yaş, 3-Yön

    //1-Mesafe: B şehrine 500 km,C şehrine 700 km,D şehrine 900 km mesafededir.
    //Km  birim fiyatı:0.10$

    //Yaş:12 yaşindan küçükse toplam fiyata %50 indirim
    //12 ve 24 yaş arasında ise %10 indirim
    //65 yaşından büyükse %30 indirim

    //Yön:Bilet gidiş_dönüş alınırsa %20 indirim
    //Bu koşulları sağlayan bir uçak bileti hesaplama

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Hoşgeldiniz,lütfen uçmak istediğiniz mesafeyi seçiniz");
        int km= scan.nextInt();
        System.out.println("lütfen yaşınızı giriniz");
        int yaş= scan.nextInt();
        System.out.println("lütfen yolculuk yön tipini giriniz(1-tek yön, 2-Gidiş/dönüş");
        int yön= scan.nextInt();

        double birimFiyat,yaşİndirimi,yönİndirimi;



        if (km>0 && yaş>0 && (yön==1 ||yön==2)){
            birimFiyat=km *0.10;

            if (yaş<12){
                yaşİndirimi =birimFiyat *0.50;//yaş indirim oranı hesaplama

            }else if(yaş>=12 && yaş<=24){
                yaşİndirimi=birimFiyat *0.10;

            }else if (yaş>65){
                yaşİndirimi=birimFiyat *0.30;

            }else{
                yaşİndirimi=0;
            }
            birimFiyat-=yaşİndirimi; //Fiyattan indirim payını çıkarıyoruz

            if (yön==2) {
                yönİndirimi = birimFiyat * 0.20;
                birimFiyat =(birimFiyat-yönİndirimi) *2;//çift yön indirimi
            }
            System.out.println("Bilet tutarı : " +birimFiyat +"$");

            System.out.println("Girdiğiniz veriler doğrudur");
        }else{
            System.out.println("Girdiğiniz değerler eksik veya yanlıştır,lütfen tekrar deneyiniz");
        }
    }


}
