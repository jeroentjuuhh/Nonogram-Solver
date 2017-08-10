public class Solver {

    static Nonogram nonogram;

    public static void solve(Nonogram nonogramIn){
        nonogram = nonogramIn;

        int attemps = 0;

        while(attemps < 3) {
            //columns
            for (int i = 0; i < getGrid().getAmountColumns(); i++) {
                //if the unsolved is equal to sum of numbers + amount of numbers - 1 -> fill them
                System.out.println(nonogram.toString());

                Numbers column = nonogram.getColumns().get(i);

                if (column.getMagicNumber() >= getGrid().getCellsUnsolvedColumn(i) && getGrid().getCellsUnsolvedColumn(i) != 0) {
                    getGrid().fillColumn(i, nonogram.getColumns().get(i));
                    System.out.println("filled column at index: " + i);
                    System.out.println(nonogram.toString());

                } else{
                    System.out.println("magicnumber: " + nonogram.getColumns().get(i).getMagicNumber());

                }
            }

            System.out.println(" --------- END OF COLUMNS ------------------");

            //rows
            for (int i = 0; i < getGrid().getAmountRows(); i++) {
                System.out.println(nonogram.toString());

                Numbers row = nonogram.getRows().get(i);

                if (row.getMagicNumber() >= getGrid().getCellsUnsolvedRow(i) && getGrid().getCellsUnsolvedRow(i) != 0) {
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

}
