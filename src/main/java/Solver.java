public class Solver {

    static Nonogram nonogram;

    public static void solve(Nonogram nonogramIn){
        nonogram = nonogramIn;

        System.out.println(nonogram.toString());

        //getGrid().setCell(1, 1,1);
        //getGrid().setCell(1, 2,1);

        //while unsolved
        //columns
        for(int i = 0; i < getGrid().sizeColumns(); i++){
            //if the unsolved is equal to sum of numbers + amount of numbers - 1 -> fill them
            //if(getGrid().getCellsUnsolvedColumn(i) == ){
            System.out.println(nonogram.getColumns().get(i).getMagicNumber());
            //}
            //System.out.println(getGrid().getCellsUnsolvedColumn(i) + "\n");
        }


        //rows
        for(int i = 0; i < getGrid().sizeRows(); i++){
          //  System.out.println(getGrid().getCellsUnsolvedRow(i) + "\n");
        }

        System.out.println(nonogram.toString());
    }

    private static Grid getGrid(){
        return nonogram.getGrid();
    }

    public static void main(String[] args){
        //Grid grid = new Grid(4, 4);

        int[][] columns = {{1,2},{1,3}, {2,2}, {0}};
        int[][] rows = {{4,3},{4,3}, {0}, {0}};

        Nonogram nonogram = new Nonogram(columns, rows, 4, 4);
        Solver.solve(nonogram);
    }

}
