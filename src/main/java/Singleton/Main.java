package Singleton;

public class Main {
    public static void main(String[] args) {
        ChuCuaHang cuaHang = ChuCuaHang.getInstance();
        cuaHang.duaRaQuyetDinh();
        cuaHang.kiDuyetDonHang();
        // Objects with the same instance will have the same hash code
//        System.out.println(cuaHang.hashCode());

        ChuCuaHang cuaHang2 = ChuCuaHang.getInstance();
        cuaHang2.duaRaQuyetDinh();
        cuaHang2.kiDuyetDonHang();
//        System.out.println(cuaHang2.hashCode());
    }
}

