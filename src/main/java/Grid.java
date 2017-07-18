import java.util.ArrayList;
import java.util.List;

public class Grid {

    //list of lists of statuses
    List<List<Cell>> cells;


    /**
     *
     * @param hor number of entries horizontal
     * @param ver number of entries vertical
     */
    public Grid(int hor, int ver){
        cells = new ArrayList<List<Cell>>();
        //horizontal
        for(int i = 0; i < hor; i++){
            cells.add(i, new ArrayList<Cell>());

            //vertical
            for(int j = 0; j < ver; j++) {
                cells.get(i).add(j, new Cell());
            }
        }
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

    public Cell getCell(int row, int col){
        return cells.get(row).get(col);
    }

    public static void main(String[] args){
        Grid grid = new Grid(4, 4);
//        System.out.println(grid.toString());
        System.out.println(grid.getCell(3,3).getStatus());
    }
}



