import java.util.ArrayList;
import java.util.List;

public class Grid {

    //list of lists of statuses
    List<List<Cell>> cells;


    /**
     *
     * @param rows number of entries horizontal
     * @param columns number of entries vertical
     */
    public Grid(int rows, int columns){
        cells = new ArrayList<List<Cell>>();
        //horizontal
        for(int i = 0; i < rows; i++){
            cells.add(i, new ArrayList<Cell>());

            //vertical
            for(int j = 0; j < columns; j++) {
                cells.get(i).add(j, new Cell());
            }
        }
    }

    public void fillColumn(int index, Numbers numbers){
        if(getCellsUnsolvedColumn(index) == 0) return;
        List<Cell> column = getColumn(index);
        int numbersIndex = 0;
        int cellIndex = 0;

        while(cellIndex < column.size() - 1) {

            while (column.get(cellIndex).getStatus() != 0 && cellIndex < column.size()) {
                cellIndex++;
            }

            //IMPORTANT
            if(cellIndex == column.size() - 1){
                return;
            }

            //first entry
            for (int i = cellIndex; i < numbers.getAtIndex(numbersIndex); i++) {
                setCell(cellIndex, index, 1);
                cellIndex++;
            }
            //after this
            //if not the last entry
            if (cellIndex < column.size()) {
                System.out.println("CALLED");
                setCell(cellIndex, index, -1);
                cellIndex++;
            }
        }
    }

    public void fillRow(int index, Numbers numbers){
        if(getCellsUnsolvedRow(index) == 0) return;
        List<Cell> row = getRow(index);
        int numbersIndex = 0;
        int cellIndex = 0;
        //searching for the first empty entry

        //while not at the end of the row
        while(cellIndex < row.size()) {

            //search for the first index that is zero
            while (row.get(cellIndex).getStatus() != 0 && cellIndex < row.size()) {
                cellIndex++;
            }

            //IMPORTANT
            if(cellIndex == row.size() - 1){
                return;
            }

            //first entry
            for (int i = cellIndex; i < numbers.getAtIndex(numbersIndex); i++) {
                setCell(index, cellIndex, 1);
                cellIndex++;
            }
            //after this
            //if not the last entry
            if (cellIndex < row.size()) {
                System.out.println("CALLED");
                setCell(index, cellIndex, -1);
                cellIndex++;
            }
        }
    }

    public int sizeRows(){
        return cells.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grid grid = (Grid) o;

        if(grid.sizeRows() != this.sizeRows() || grid.sizeColumns() != this.sizeColumns()) return false;

        for(int rowIndex = 0; rowIndex < sizeRows(); rowIndex++){
            for(int columnIndex = 0; columnIndex< sizeColumns(); columnIndex++){
                //all cells statuses should be the same
                if(this.getCell(rowIndex, columnIndex).getStatus() != grid.getCell(rowIndex, columnIndex).getStatus()){
                    return false;
                }

            }
        }
        return true;
        //return cells != null ? cells.equals(grid.cells) : grid.cells == null;
    }

    @Override
    public int hashCode() {
        return cells != null ? cells.hashCode() : 0;
    }

    public int sizeColumns(){
        return cells.get(0).size();
    }

    public void setCell(int row, int column, int status){
        cells.get(row).get(column).setStatus(status);
    }

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

        public Cell getCell(int row, int col){
        return cells.get(row).get(col);
    }

    public List<Cell> getRow(int index){
        return cells.get(index);
    }

    public List<Cell> getColumn(int index){
        List<Cell> result = new ArrayList<Cell>();

        for(int i = 0; i < cells.size(); i++){
            result.add(i, cells.get(i).get(index));
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (List<Cell> cell : cells) {

            for (Cell c : cell) {
                //append the status of the cell:
                result.append(c.getStatus()).append(", ");
            }

            result.append("\n");

        }
        return "Grid: \n" + result;
    }
}



