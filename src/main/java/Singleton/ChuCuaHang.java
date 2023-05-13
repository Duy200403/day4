package Singleton;

public class ChuCuaHang {
    private String ten;

    // Default instance is null
    private static ChuCuaHang instance = null;

    // Private constructor prevents object creation from outside
    private ChuCuaHang(String ten) {
        this.ten = ten;
    }

    public static ChuCuaHang getInstance() {
        if (instance == null) {
            instance = new ChuCuaHang("Ban la lo");
        }
        return instance;
    }

    public void duaRaQuyetDinh() {
        System.out.println("chu cua hang " + ten + " dua ra quyet dinh");
    }

    public void kiDuyetDonHang() {
        System.out.println("chu cua hang " + ten + " kiem duyet don hang");
    }
}

