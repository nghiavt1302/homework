package homework.QuanLySach;

public class TaiLieu {
    private String maTaiLieu;
    private String nxb;
    private String soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String nxb, String soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nxb = nxb;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nxb='" + nxb + '\'' +
                ", soBanPhatHanh='" + soBanPhatHanh + '\'' +
                '}';
    }
}
