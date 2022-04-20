package Team.src.kahve;

public class Kahve {
    private String kahveNo;
    private String kahveAdi;
    private String KahveBoy;
    private String SutluMü;
    private String SekerliMi;

    public Kahve(){
    }

    public Kahve(String kahveNo, String kahveAdi) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
    }

    public Kahve(String kahveNo, String kahveAdi, String kahveBoy, String sutluMü, String sekerliMi) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
        KahveBoy = kahveBoy;
        SutluMü = sutluMü;
        SekerliMi = sekerliMi;
    }

    @Override
    public String toString() {
        return "Kahve{" +
                "kahveNo='" + kahveNo + '\'' +
                ", kahveAdi='" + kahveAdi + '\'' +
                ", KahveBoy='" + KahveBoy + '\'' +
                ", SutluMü='" + SutluMü + '\'' +
                ", SekerliMi='" + SekerliMi + '\'' +
                '}';
    }

    public String getKahveNo() {
        return kahveNo;
    }

    public void setKahveNo(String kahveNo) {
        this.kahveNo = kahveNo;
    }

    public String getKahveAdi() {
        return kahveAdi;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public String getKahveBoy() {
        return KahveBoy;
    }

    public void setKahveBoy(String kahveBoy) {
       this.KahveBoy = kahveBoy;
    }

    public String getSutluMü() {
        return SutluMü;
    }

    public void setSutluMü(String sutluMü) {
       this.SutluMü = sutluMü;
    }

    public String getSekerliMi() {
        return SekerliMi;
    }

    public void setSekerliMi(String sekerliMi) {
        this.SekerliMi = sekerliMi;
    }
}
