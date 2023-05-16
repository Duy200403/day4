package Cafe;

public class BacXiu implements Cafe {
    private String loaiCafe;

    public BacXiu(String loaiCafe) {
        this.loaiCafe = loaiCafe;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Dang pha ca phe Bac xiu - Loai: " + loaiCafe);
        // Thực hiện các bước pha cà phê Bạc xỉu
    }
}
