import java.util.ArrayList;
import java.util.List;

public class Nonogram {

    //List horizontal
    private List<Numbers> columns;

    //List vertically
    private List<Numbers> rows;

    //Grid
    private Grid grid;

    public Nonogram(int[][] columnOptions, int[][] rowOptions, int sizeRows, int sizeColumns){
        columns = new ArrayList<Numbers>(columnOptions.length);
        rows = new ArrayList<Numbers>(rowOptions.length);
        //Horizontal
        for(int i = 0; i < columnOptions.length; i++){
            columns.add(i, new Numbers(columnOptions[i]));
        }

        //Vertical
        for(int i = 0; i < rowOptions.length; i++){
            rows.add(i, new Numbers(rowOptions[i]));
        }

        grid = new Grid(sizeRows, sizeColumns);
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        //get all the numbers of the columns
        for (Numbers aHorizontal : columns) {
            result.append(aHorizontal.toString()).append("\t");
        }
        result.append("\n");

        for(int rowIndex = 0; rowIndex < rows.size(); rowIndex++){
            result.append(rows.get(rowIndex).toString());
            result.append(grid.getRow(rowIndex).toString());
            result.append("\n");
        }

        return result.toString();
    }


    public List<Numbers> getColumns() {
        return columns;
    }

    public void setColumns(List<Numbers> horizontal) {
        this.columns = horizontal;
    }

    public List<Numbers> getRows() {
        return rows;
    }

    public void setRows(List<Numbers> rows) {
        this.rows = rows;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public static void main(String[] args){
        //Grid grid = new Grid(4, 4);

        int[][] columns = {{1,2},{1,3}};
        int[][] rows = {{4},{4}, {0}, {0}};

        Nonogram nonogram = new Nonogram(columns, rows, 4, 2);
        nonogram.getGrid().setCell(0,1,"Something");
        nonogram.getGrid().setCell(1,1,"dot");
        nonogram.getGrid().setCell(2,1,"else");
        nonogram.getGrid().setCell(3,1,"Something else");

        System.out.println(nonogram.toString());

    }
}
