package homework.QuanLySach;

public class TapChi {
    String soPhatHanh;
    String thangPhatHanh;

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh='" + thangPhatHanh + '\'' +
                '}';
    }
}
