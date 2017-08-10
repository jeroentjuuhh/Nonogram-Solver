public class Cell {
    /**
     * Status: -1 is cross, 0 is unsolved, 1 is filled
     */
    private int status, columnIndex, rowIndex, index;


    /**
     * @param index  the index of the cell
     * @param column the column index of the cell
     * @param row    the row index of the cell
     */
    Cell(int index, int column, int row) {
        this.columnIndex = column;
        this.rowIndex = row;
        this.index = index;
        this.status = 0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    int getStatus() {
        return status;
    }

    void setStatus(int status) {
        this.status = status;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    @Override
    public String toString() {
        return "" + status;
    }
}
