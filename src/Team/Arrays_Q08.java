package Team.src.Team;

public class Arrays_Q08 {
    public static void main(String[] args) {

        /*
        TASK :
         $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[] = str.split(" "); //array e dönüştürüyoruz
        int top1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                top1 += Integer.parseInt(arr[i].replace("$", ""));// 1+23+134+24
            }
        }
        System.out.println("$" + top1);
        int top2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("£")) {
                top2 += Integer.parseInt(arr[i].replace("£", ""));// 32+40+2+65+4
            }
        }
        System.out.println("£" + top2);
        System.out.println(top1 + top2);

    }
}
