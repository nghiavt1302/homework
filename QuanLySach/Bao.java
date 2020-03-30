package homework.QuanLySach;

public class Bao {
    String ngayPhatHanh;

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
