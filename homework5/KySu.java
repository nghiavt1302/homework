package homework5;

public class KySu extends CanBo {
    private String chuyenNganh;

    public KySu(){

    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
