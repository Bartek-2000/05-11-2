package exercise;

public class DataStore {
    private static final int maxNotbooks = 100;
    private Computer[] computers = new Computer[maxNotbooks];
    private int computersNumber;

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for(int i=0; i<computersNumber; i++){
            comps[i] = computers[i];
        }
        return comps;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getComputersNumber() {
        return computersNumber;
    }

    public void setComputersNumber(int computersNumber) {
        this.computersNumber = computersNumber;
    }

}
