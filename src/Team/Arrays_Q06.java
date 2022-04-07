package Team.src.Team;

import java.util.Arrays;

public class Arrays_Q06 {

    public static void main(String[] args) {

    /*TASK :
    write a java program to find the second largest number in the array?
    Maximum and minimum number in the array?
    (Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
    bulmak için bir java programi yazin)

    int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

    */
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-90, -90, 0, 1, 100, 845, 898, 8787, 10001]
        int min=arr[0];
        int max=arr[arr.length-1];
        int maxIkinci=arr[arr.length-2];
        System.out.println("En kucuk sayi : "+min);
        System.out.println("En buyuk sayi : "+max);
        System.out.println("En buyuk ikinci sayi : "+maxIkinci);
    }
}
