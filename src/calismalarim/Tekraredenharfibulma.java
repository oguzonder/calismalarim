package Team.src.calismalarim;

public class Tekraredenharfibulma {
    public static void main(String[] args) {
        String str="Javaisalsoeasy";
        System.out.println(str);

        String characters="";
        String harf="";
        for (int i = 0; i <str.length() ; i++) {
            String encoktekraredenharf=Character.toString(str.charAt(i));
            if (characters.contains(encoktekraredenharf)){
                if (!harf.contains(encoktekraredenharf)){
                    harf+=encoktekraredenharf + ",";
                }
            }
            characters+=encoktekraredenharf;


        }
        System.out.println(harf);
    }
}
