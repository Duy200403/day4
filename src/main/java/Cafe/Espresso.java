package Cafe;

public class Espresso implements Cafe{
    private String loaiCafe;
    private double apSuat;

    public Espresso(String loaiCafe, double apSuat) {
        this.loaiCafe = loaiCafe;
        this.apSuat = apSuat;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Dang pha ca phe Espresso - Loai: " + loaiCafe);
        System.out.println("Ap suat: " + apSuat + " Pa");
        // Thực hiện các bước pha cà phê Espresso
    }
}
