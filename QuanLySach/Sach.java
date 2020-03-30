package homework.QuanLySach;

public class Sach extends TaiLieu {
    String tacGia;
    String numPages;

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNumPages() {
        return numPages;
    }

    public void setNumPages(String numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tacGia='" + tacGia + '\'' +
                ", numPages='" + numPages + '\'' +
                '}';
    }
}
