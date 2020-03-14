package homework5;

public class QLCB {

    public CanBo addCanBo(String name, String age, String gender, String address){
        CanBo cb = new CanBo();
        cb.setName(name);
        cb.setAge(age);
        cb.setGender(gender);
        cb.setAddress(address);
        return cb;
    }

    public CanBo searchHoTen(String name, CanBo []listCanBo){
        for (CanBo cb : listCanBo){
            if (cb != null) {
                if (cb.getName().equals(name)) {
                    return cb;
                }
            }
        }
        return null;
    }

    public void showListCanBo(CanBo[] listCanBo){
        for (CanBo cb : listCanBo){
            if (cb != null) {
                System.out.println(cb.getName());
            }
        }
    }
}
