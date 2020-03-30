package homework.QuanLySach;

import java.util.List;

public class QLTaiLieu implements QuanLyTaiLieuInterface{

    @Override
    public TaiLieu addTaiLieu(String maTaiLieu, String nxb, String soBanPhatHanh) {
        TaiLieu doc = new TaiLieu();
        doc.setMaTaiLieu(maTaiLieu);
        doc.setNxb(nxb);
        doc.setSoBanPhatHanh(soBanPhatHanh);
        System.out.println("Da them tai lieu " + doc.toString());
        return null;
    }

    @Override
    public void deleteTaiLieu(String maTaiLieu, List<TaiLieu> taiLieuList) {
        for (TaiLieu doc : taiLieuList){
            if(doc.getMaTaiLieu().equals(maTaiLieu)){
                taiLieuList.remove(doc);
                System.out.println("Da xoa tai lieu " + doc.toString());
            }
        }
    }

    @Override
    public TaiLieu showInfoTaiLieu(String maTaiLieu, List<TaiLieu> taiLieuList) {
        for (TaiLieu doc : taiLieuList){
            if (doc.getMaTaiLieu().equals(maTaiLieu)){
                System.out.println(doc.toString());
            }
            break;
        }
        return null;
    }

    @Override
    public TaiLieu searchTaiLieu(String maTaiLieu, List<TaiLieu> taiLieuList) {
        for (TaiLieu doc : taiLieuList){
            if(doc.getMaTaiLieu().equals(maTaiLieu)){
                System.out.println("Tim thay tai lieu: " + doc.toString());
            }
        }
        return null;
    }
}
