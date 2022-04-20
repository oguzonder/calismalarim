package Team.src.Team;

import java.util.Arrays;

public class arrays_Q12 {
    public static void main(String[] args) {
        //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
        // ve yeni array’i ekrana yazdıran bir program yazınız
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}
        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int arrToplam[] = new int[arr.length];//ıc arraylerın toplamların yazılacagı yenı topalm array
        int toplam = 0;//iç arraylerın toplamını yazacagımız verıable olusturalım
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+= arr[i][j];
            }
            arrToplam[i] =toplam;
            toplam = 0;//sayacı sıfırlayıp ıc arrayler ıcın her defasnda tekrarlıyacak
        }
        System.out.println(Arrays.toString(arrToplam));//bir arrayin tum elemanları bu sekılde yazdırılır
        // yenı olusan arrayı bu sekılde yazdırdık
    }
}
