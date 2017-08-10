import java.util.ArrayList;
import java.util.List;

public class Grid {

    //list of lists of statuses
    private List<Cell> cells;
    private int amountRows, amountColumns;

    //TODO: Add javadoc to all the methods that are implemented correctly!

    /**
     *
     * @param rows number of entries horizontal
     * @param columns number of entries vertical
     */
    public Grid(int rows, int columns){
        amountRows = rows;
        amountColumns = columns;
        cells = new ArrayList<Cell>();
        //horizontal
        int index = 0;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                //int index, int column, int row
                cells.add(index, new Cell(index, j, i));
                index++;
            }
        }
    }
    //TODO: Refactor the fill Row and Fill Column into one method

    public void fillColumn(int index, Numbers numbers){

        List<Cell> column = getColumn(index);
        int numbersIndex = 0;
        int cellIndex = 0;

        while(cellIndex < column.size() - 1) {

            while (column.get(cellIndex).getStatus() != 0 && cellIndex < column.size()) {
                cellIndex++;
            }

            //IMPORTANT
            if(cellIndex == column.size()){
                return;
            }

            //first entry
            for (int i = cellIndex; i < numbers.getAtIndex(numbersIndex); i++) {
                //setCell(cellIndex, index, 1);
                cellIndex++;
            }
            //after this
            //if not the last entry
            if (cellIndex < column.size()) {
                System.out.println("CALLED");
                //setCell(cellIndex, index, -1);
                cellIndex++;
                numbersIndex++;
            }
        }
    }

    public void fillRow(int index, Numbers numbers){
        List<Cell> row = getRow(index);
        int numbersIndex = 0;
        int cellIndex = 0;
        //searching for the first empty entry

        //while not at the end of the row
        while(cellIndex < row.size() - 1) {

            //search for the first index that is zero
            while (row.get(cellIndex).getStatus() != 0 && cellIndex < row.size()) {
//                if(cellIndex > 0 && row.get(cellIndex - 1).getStatus() == -1){
//                    numbersIndex++;
//                }
                cellIndex++;
            }

            //IMPORTANT
            if(cellIndex == row.size()){
                return;
            }

            //first entry
            for (int i = 0; i < numbers.getAtIndex(numbersIndex); i++) {
                //setCell(index, cellIndex, 1);
                cellIndex++;
            }
            //after this
            //if not the last entry
            if (cellIndex < row.size()) {
                System.out.println("CALLED");
                //setCell(index, cellIndex, -1);
                cellIndex++;
                numbersIndex++;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grid grid = (Grid) o;

        if (grid.getAmountRows() != this.getAmountRows() || grid.getAmountColumns() != this.getAmountColumns())
            return false;

        for (int index = 0; index < grid.getSize(); index++) {
            //all cells statuses should be the same
            if (this.getCell(index).getStatus() != grid.getCell(index).getStatus()) {
                return false;
            }

        }
        return true;
    }


    public void setCell(int index, int status) {
        cells.get(index).setStatus(status);
    }

    // TODO: change the unsolved algorithm
    public int getCellsUnsolvedColumn(int index){
        int result = 0;

        for(Cell cell: getColumn(index)){
            if(cell.getStatus() == 0) result++;
        }

        return result;
    }

    public int getCellsUnsolvedRow(int index){
        int result = 0;

        for(Cell cell: getRow(index)){
            if(cell.getStatus() == 0) result++;
        }

        return result;
    }

    public Cell getCell(int index) {
        return cells.get(index);
    }

    public List<Cell> getRow(int index) {
        List<Cell> result = new ArrayList<>();
        for (Cell c : cells) {
            if (c.getRowIndex() == index) {
                result.add(c);
            }
        }
        return result;
    }

    public List<Cell> getColumn(int index){
        List<Cell> result = new ArrayList<>();

        for (Cell c : cells) {
            if (c.getColumnIndex() == index) {
                result.add(c);
            }
        }

        return result;
    }

    //TODO: What does the getAmountRows and getAmountOfColumns say?

    public int getAmountRows() {
        return amountRows;
    }

    public int getAmountColumns() {
        return amountColumns;
    }

    public int getSize() {
        return amountRows * amountColumns;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        //TODO: change the toString
        for (Cell c : cells) {
            result.append(c.getStatus()).append(", ");
            result.append("\n");
        }

        return "Grid: \n" + result.toString();
    }
}



