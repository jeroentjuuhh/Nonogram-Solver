public class Solver {

    static Nonogram nonogram;

    public static void solve(Nonogram nonogramIn){
        nonogram = nonogramIn;

        int attemps = 0;

        while(attemps < 3) {
            //columns
            for (int i = 0; i < getGrid().sizeColumns(); i++) {
                //if the unsolved is equal to sum of numbers + amount of numbers - 1 -> fill them
                System.out.println(nonogram.toString());
                if (nonogram.getColumns().get(i).getMagicNumber() >= getGrid().getCellsUnsolvedColumn(i)) {
                    getGrid().fillColumn(i, nonogram.getColumns().get(i));
                    System.out.println("filled column at index: " + i);
                    System.out.println(nonogram.toString());

                } else{
                    System.out.println("magicnumber: " + nonogram.getColumns().get(i).getMagicNumber());

                }
            }

            System.out.println(" --------- END OF COLUMNS ------------------");

            //rows
            for (int i = 0; i < getGrid().sizeRows(); i++) {
                System.out.println(nonogram.toString());

                if (nonogram.getRows().get(i).getMagicNumber() >= getGrid().getCellsUnsolvedRow(i)) {
                    getGrid().fillRow(i, nonogram.getRows().get(i));
                    System.out.println("Filled row at index: " + i);
                    System.out.println(nonogram.toString());

                }else{
                    System.out.println("magicnumber: " + nonogram.getColumns().get(i).getMagicNumber());

                }
            }

            attemps++;
            System.out.println("---------------------------------------------");
        }
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
