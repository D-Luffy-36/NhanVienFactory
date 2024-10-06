
public abstract class Nhanvien {
    private String ma;
    private String name;
    private double luongcb;
    private ITienthuong phuongthucTinhThuong;

    public Nhanvien(String ma, String name, double luongcb) {
        this.ma = ma;
        this.name = name;
        this.luongcb = luongcb;
    }
    public Nhanvien() {
    
    }
    
    public String getma() {
        return ma;
    }

    public void setma(String ma) {
        this.ma = ma;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getluongcb() {
        return luongcb;
    }

    public void setluongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public ITienthuong getPhuongthucTinhThuong() {
        return phuongthucTinhThuong;
    }

    public void setPhuongthucTinhThuong(ITienthuong phuongthucTinhThuong) {
        this.phuongthucTinhThuong = phuongthucTinhThuong;
    }

    public double getTienthuong() {
        if (this.phuongthucTinhThuong != null) {
            return this.phuongthucTinhThuong.tinhTienthuong(this.luongcb);
        }
        return 0;
    }

    public String toString() {
        return getType()+ " " + name + " - Ma: " + ma + " - Luong co ban: " + luongcb;
    }
    public String getType() {
    	return this.getClass().getSimpleName();
    }
}
