package GenericBT.Bt1;

public class main {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong(5);
        HinhTron hinhTron = new HinhTron(7.5);

        Drawable drawable = new Drawable();
        drawable.draw(hinhVuong); // Ket qua: Ve ra HinhVuong[canh = 5.0]
        drawable.draw(hinhTron); // Ket qua: Ve ra HinhTron[ban kinh = 7.5]

        // In thong tin chu vi va dien tich cua hinh vuong
        System.out.println("Thong tin HinhVuong:");
        System.out.println("Canh: " + hinhVuong.getCanh());
        System.out.println("Chu vi: " + hinhVuong.tinhChuVi());
        System.out.println("Dien tich: " + hinhVuong.tinhDienTich());

        // In thong tin chu vi va dien tich cua hinh tron
        System.out.println("Thong tin HinhTron:");
        System.out.println("Ban kinh: " + hinhTron.getBanKinh());
        System.out.println("Chu vi: " + hinhTron.tinhChuVi());
        System.out.println("Dien tich: " + hinhTron.tinhDienTich());
    }
}
