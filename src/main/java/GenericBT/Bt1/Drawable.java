package GenericBT.Bt1;

public class Drawable {
    public void draw(IHinhHoc hinhHoc){
        if (hinhHoc instanceof HinhVuong) {
            HinhVuong hinhVuong = (HinhVuong) hinhHoc;
            System.out.println("Ve ra HinhVuong[canh = " + hinhVuong.getCanh() + "]");
        } else if (hinhHoc instanceof HinhTron) {
            HinhTron hinhTron = (HinhTron) hinhHoc;
            System.out.println("Ve ra HinhTron[bán kinh = " + hinhTron.getBanKinh() + "]");
        }
    }
}
