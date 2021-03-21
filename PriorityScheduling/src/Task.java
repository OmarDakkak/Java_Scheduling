public class Task {
    private String name;
    private int DTC;
    private int priority;

    public Task(String name, int DTC, int priority) {
        this.name = name;
        this.DTC = DTC;
        this.priority = priority;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
