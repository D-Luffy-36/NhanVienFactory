public class ClientTest {
    public static void main(String[] args) {
        NhanvienFactory factory = new NhanvienFactory();

        Nhanvien nv1 = factory.createNhanvien("001", "Nguyen Van A", 1000, "ChuyenvienPhongch");
        nv1.setPhuongthucTinhThuong(new TienthuongNgoaigio());

        Nhanvien nv2 = factory.createNhanvien("002", "Tran Van B", 1200, "Ketoanvien");
        nv2.setPhuongthucTinhThuong(new TienthuongNgoaitinh());
        
        Nhanvien nv3= factory.createNhanvien("003","Bui Van C" ,4000 , "Laptrinhvien");
        nv3.setPhuongthucTinhThuong(new TienthuongThongthuong());

        Nhanvien nv4 = factory.createNhanvien("004", "Nguyen Van Nhat", 50000, "Laptrinhvien");
        nv4.setPhuongthucTinhThuong(new TienthuongNgoaigio());

        System.out.println(nv1.toString() + " - Tiền thưởng: " + nv1.getTienthuong());
        System.out.println(nv2.toString() + " - Tiền thưởng: " + nv2.getTienthuong());
        System.out.println(nv3.toString() + " - Tien thuong: " + nv3.getTienthuong());
        System.out.println(nv4.toString() + " - Tiền thưởng: " + nv4.getTienthuong());
    }
}
