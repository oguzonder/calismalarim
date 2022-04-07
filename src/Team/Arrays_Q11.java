package Team.src.Team;

public class Arrays_Q11 {
    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
        int  arr1[][] = { {1,2}, {3,4,5}, {6} };
        int arr2[][] = { {7,8,9}, {10,11}, {12} };
        int top1=0;
        int top2=0;
        for (int i = 0; i < arr1.length; i++) { // 0. index {1,2}, 1. index {3,4,5}, 2. index  {6}
            for (int j = 0; j < arr1[i].length; j++) {// 0. index 1, 1. index 2
                top1+=arr1[i][j]; //0,0 = 1
            }
        }
        System.out.println("1. array topolamı= "+top1);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                top2+=arr2[i][j];
            }
        }
        System.out.println("2. array topolamı= "+top2);
        System.out.println("ikisinim toplam : "+ (top1+top2));
    }
}
