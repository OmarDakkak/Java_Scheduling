public class Task {
    private String name;
    private int DTC;

    public Task(String name, int DTC) {
        this.name = name;
        this.DTC = DTC;
    }

    public int getDTC() {
        return DTC;
    }

    public void setDTC(int DTC) {
        this.DTC = DTC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
