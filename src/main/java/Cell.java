public class Cell {
    /**
     * Status: -1 is cross, 0 is unsolved, 1 is filled
     */
    private int status;


    Cell() {
        this.status = 0;
    }

    /**
     *
     * @return Choice: "unsolved", "Cross", "Filled".
     */
    int getStatus() {
        return status;
    }

    void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "" + status;
    }
}
