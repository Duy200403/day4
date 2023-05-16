package Cafe;

public class Latte implements Cafe {
    private String loaiCafe;
    private int doNong;

    public Latte(String loaiCafe, int doNong) {
        this.loaiCafe = loaiCafe;
        this.doNong = doNong;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Dang pha ca phe Latte - Loai: " + loaiCafe);
        System.out.println("Do nong: " + doNong);
        // Thực hiện các bước pha cà phê Latte
    }
}
