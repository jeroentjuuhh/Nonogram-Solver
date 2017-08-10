public class Cell {
    /**
     * Status: -1 is cross, 0 is unsolved, 1 is filled
     */
    private int status, columnIndex, rowIndex;


    Cell(int column, int row) {
        this.columnIndex = column;
        this.rowIndex = row;
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

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    @Override
    public String toString() {
        return "" + status;
    }
}
