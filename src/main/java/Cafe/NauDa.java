package Cafe;

public class NauDa implements Cafe{
    private String loaiCafe;
    private int nhietDoNuoc;
    public NauDa(String loaiCafe, int nhietDoNuoc) {
        this.loaiCafe = loaiCafe;
        this.nhietDoNuoc = nhietDoNuoc;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Dang pha ca phe Nau da - Loai: " + loaiCafe);
        System.out.println("Nhiet do nuoc: " + nhietDoNuoc + " do C");
        // Thực hiện các bước pha cà phê Nâu đá
    }

}
