package Team.src.Team;

import java.util.Arrays;

public class Arrays_Q10 {
    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
         */
        String str="GayetBasarılı"; //string olarak tanımladık
        str=str.replace("Gayet","Coook");// verilen string'deki karakterleri istenen yeni karakterlere dönüştürür
        String[] arr=new String[1]; // array olarak tanımladık
        arr[0]=str; //0. index e str ("Coook")
        System.out.println(Arrays.toString(arr));
    }
}
