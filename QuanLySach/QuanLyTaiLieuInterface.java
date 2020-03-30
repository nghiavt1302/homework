package homework.QuanLySach;

import java.util.List;

public interface QuanLyTaiLieuInterface {
    TaiLieu addTaiLieu(String maTaiLieu, String nxb, String soBanPhatHanh);
    void deleteTaiLieu(String maTaiLieu, List<TaiLieu> taiLieuList);
    TaiLieu showInfoTaiLieu(String maTaiLieu, List<TaiLieu> taiLieuList);
    TaiLieu searchTaiLieu (String maTaiLieu, List<TaiLieu> taiLieuList);

}
