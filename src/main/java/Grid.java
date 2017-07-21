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

    public int sizeRows(){
        return cells.size();
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



