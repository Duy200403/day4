package GenericBT.Bt1;

public class HinhTron implements IHinhHoc{
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2*Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
