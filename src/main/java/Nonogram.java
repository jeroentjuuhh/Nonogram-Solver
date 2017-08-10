import java.util.ArrayList;
import java.util.List;

public class Nonogram {

    //List horizontal
    private List<Numbers> columns;

    //List vertically
    private List<Numbers> rows;

    //Grid
    private Grid grid;

    //TODO: Add more javadoc

    /**
     * a Nonogram containing all the numbers.
     * Makes a grid and number objects
     * @param columnOptions the numbers of the columns
     * @param rowOptions the numbers of the rows
     * @param sizeRows amount of rows
     * @param sizeColumns amount of columns
     */
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
        //HARDCODED:
        int amountNumbers = 2;
        for(int i = 0; i < amountNumbers; i++){
            for(int j = 0; j < columns.size(); j++){
                // CHECK something like this
                if( i < columns.get(j).getSize()) {
                    if(j == 0) result.append("\t");
                    result.append(columns.get(j).getAtIndex(i)).append("\t");
                }
            }

            result.append("\n");
        }

        /*
        // columns
        for (Numbers aHorizontal : columns) {
            result.append(aHorizontal.toString()).append("\t");
        }
        */
        //rows
        for(int rowIndex = 0; rowIndex < rows.size(); rowIndex++){
            result.append(rows.get(rowIndex).toString()).append("\t");
            result.append(grid.getRow(rowIndex).toString());
            result.append("\n");
        }

        return result.toString();
    }

    //TODO: What does the getColumns and the getRows calculate you? DEFINE IT

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


}
