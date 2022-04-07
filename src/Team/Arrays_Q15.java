package Team.src.Team;

public class Arrays_Q15 {
    public static void main(String[] args) {
        /*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
        int arr[]={2,6,4,8,2,6,2};
        if (arr[0]==arr[arr.length-1]){//o ıncı ındexden basla son ındeksı al ındex
            // 0 dan basladıgı ıcın index son karakterı almak ıcın -1 dedik
            System.out.println("ilk ve son karakterler esittir");
        }else System.out.println("ilk ve son karakterler esit degildir");
    }
}
