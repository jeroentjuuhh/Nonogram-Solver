public class Cell {
    private String status;


    public Cell() {
        this.status = "unsolved";
    }

    /**
     *
     * @return Choice: "unsolved", "Cross", "Filled".
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
