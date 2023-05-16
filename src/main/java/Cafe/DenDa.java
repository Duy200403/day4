package Cafe;

public class DenDa implements Cafe{
    private String loaiCafe;
    private int nhietDoNuoc;

    public DenDa(String loaiCafe, int nhietDoNuoc) {
        this.loaiCafe = loaiCafe;
        this.nhietDoNuoc = nhietDoNuoc;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Dang pha ca phe Den da - Loai: " + loaiCafe);
        System.out.println("Nhiet do nuoc: " + nhietDoNuoc + " do C");
        // Thực hiện các bước pha cà phê Đen đá
    }
}
