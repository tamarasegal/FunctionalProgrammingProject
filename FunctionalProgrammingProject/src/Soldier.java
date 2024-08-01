public class Soldier {
    public int id;

    @Override public String toString() {
        return id + "";
    }

    public int getid() {
        return id;
    }

    public Soldier(int id) {
        this.id = id;
    }
}
