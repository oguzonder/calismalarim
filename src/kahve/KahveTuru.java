package Team.src.kahve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveTuru {
    static List<Kahve> kahve = new ArrayList<>();
    static List<Kahve> istenenKahve = new ArrayList<>();
    static String arrSut[] = {"Sütsüz", "Cok Az Sutlu", "Azıcık Sutlu", "Normal Sutlu", "Elini Korkak Alıstırma"};
    static String arrSeker[] = {"Sekersiz", "Sekeri koklat", "Sekeri normal koy", "Sekeri doldur kardesim"};
    static String arrBardak[] = {"Kucuk olsun", "Orta olsun", "Buyuk olsun", "Cok buyuk olsun"};
    static Scanner scan = new Scanner(System.in);
    static String no;
    static String sut;
    static String seker;
    static String bardak;

    public void kahveSec() {
        Kahve kahve1 = new Kahve("1", "Nescafe");
        Kahve kahve2 = new Kahve("2", "Latte");
        Kahve kahve3 = new Kahve("3", "CafeFransi");
        Kahve kahve4 = new Kahve("4", "Yemen kahvesi");
        Kahve kahve5 = new Kahve("5", "Turk Kahvesi");
        kahve.add(kahve1);
        kahve.add(kahve2);
        kahve.add(kahve3);
        kahve.add(kahve4);
        kahve.add(kahve5);

        kahveSecim();

    }

    private void kahveSecim() {
        System.out.println("No}\tKahve Adı");
        for (Kahve k : kahve) {
            System.out.println(k.getKahveNo() + "\t" + k.getKahveAdi());
        }
        System.out.println("Lutefen tercih ettiginiz kahve numarasını giriniz : ");

        no = scan.nextLine();
        switch (no) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                System.out.println("Hatalı giris yaptınız,Tekrar deneyiniz");
                kahveSecim();


        }
        System.out.println("Tercihiniz : " + kahve.get(Integer.valueOf(no) - 1).getKahveAdi());

        bardakTercih();


    }

    private void bardakTercih() {
        System.out.println("Hangi boy bardak istersiniz :\n 1-Kucuk Boy 2-Orta Olsun 3-Buyuk ver 4-Kocaman olsun");
        bardak = scan.next();
        switch (bardak) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                System.out.println("Hatalı giris yaptınız,Tekrar deneyiniz");
                bardakTercih();

        }
        sekerTercihi();
    }

    private void sekerTercihi() {
        System.out.println("Seker istiyor musunuz Evet ise 'E' Hayır ise 'H' giriniz : ");
        char secim = scan.next().toUpperCase().charAt(0);
        if (secim == 'E') {
            System.out.println("Seker miktarını giriniz : \n 1-Sekeri az olsun 2-Sekeri orta olsun 3-Sekeri bol olsun");
            seker = scan.next();
            sutTercihi();
        } else if (secim == 'H') {
            seker = "4";
            sutTercihi();
        } else {
            System.out.println("Hatalı  giris yaptınız,tekra deneyiniz");
            sutTercihi();
        }

    }

    private void sutTercihi() {
        System.out.println("Sut ister misiniz? Evet icin 'E' Hayır icin 'H' giriniz");
        char secim = scan.next().toUpperCase().charAt(0);
        if (secim == 'E') {
            System.out.println("Sut miktarını seciniz :\n 1-Az sutlu 2-Orta Sutlu 3-Bol Sutlu olsun be");
            sut = scan.next();
            kahveCıkıs();
        } else if (secim == 'H') {
            sut = "0";
            kahveCıkıs();
        } else {
            System.out.println("Hatalı giris yaptınız tekrar deneyiniz");
            sutTercihi();
        }
    }

    private void kahveCıkıs() {
            Kahve kh = new Kahve("1", kahve.get(Integer.valueOf(no) - 1).getKahveAdi(),
                    arrBardak[Integer.valueOf(bardak) - 1],
                    arrSut[Integer.valueOf(sut) - 1],
                    arrSeker[Integer.valueOf(seker) - 1]);
            istenenKahve.add(kh);
            System.out.println("Seçiminiz : " + kh.getKahveAdi() + " - " + kh.getKahveBoy() + " - " + kh.getSekerliMi() + " - " + kh.getSutluMü());
            System.out.println("Onaylıyorsanız 'E' tekrar işlem yapmak için 'H' giriniz : ");
            char ch = scan.next().toUpperCase().charAt(0);
            if (ch == 'E') {
                System.out.print(kh.getKahveAdi() + " hazırlanıyor");

                for (int i = 0; i < 5; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
                if (seker != "4") {

                    System.out.println();
                    System.out.print("Şeker ekleniyor");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                        }
                    }
                }

                if (sut != "0") {

                    System.out.println();
                    System.out.print("Süt ekleniyor");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                System.out.println("\nKahveniz Hazır. Afiyet Olsun.");
            } else {
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz : ");
                kahveCıkıs();
            }

        }
    }







