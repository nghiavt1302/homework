package homework5;

public class CongNhan extends CanBo {
    private int level;

    public CongNhan(){
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "level=" + level +
                '}';
    }
}
