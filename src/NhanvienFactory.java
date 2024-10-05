public class NhanvienFactory implements INhanvienFactory {

    public Nhanvien createNhanvien(String ma, String name, double luongcb, String type) {

        switch(type) {
            case "ChuyenvienPhongch":
                return new ChuyenvienPhantich(ma, name, luongcb);
            case "Ketoanvien":
                return new Ketoanvien(ma, name, luongcb);
            case "Laptrinhvien":
                return new Laptrinhvien(ma, name, luongcb);
            case "NhanvienKiemthu":
                return new NhanvienKiemthu(ma, name, luongcb);
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
 
    @Override
    public Nhanvien createNhanvien(String type) {
        return createNhanvien("", "", 0.0, type);
    }
}
