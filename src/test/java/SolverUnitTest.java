import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SolverUnitTest {

    /*
    COMPLEX:
4 x 4
        | 1 | 0 | 3 | 4
    _ _ | 1 | _ | _ | _
    1 2 | X | . | X | X
    2   | . | . | X | X
    4   | X | . | X | X
    1   | . | . | . | X
*/

    /*
    SIMPLE ROW:
    2 x 2
        | 1 | 1
    _ _ | _ | _
    2   | X | X
    0   | . | .
     */

    /*
    SIMPLE COLUMN:
    2 x 2

        | 2 | 0
    _ _ | _ | _
    1   | X | .
    1   | X | .
 */
    //TODO: change the setCells
    private Nonogram nonogram;

    @Test
    public void SimpleSove(){
        //SIMPLE
        //SIMPLE ROW
        int[][] columnOptions = {{1}, {1}};
        int[][] rowOptions = {{2}, {0}};

        nonogram = new Nonogram(columnOptions, rowOptions, 2,2);

        Solver.solve(nonogram);

        //creating the answer
        Grid expected = new Grid(2,2);
//        expected.setCell(0,0, 1);
//        expected.setCell(0,1, 1);
//        expected.setCell(1,0, -1);
//        expected.setCell(1,1, -1);
        assertThat(nonogram.getGrid()).isEqualTo(expected);
    }

    @Test
    public void complexSolve(){
        /*
        COMPLEX:
        4 x 4
            | 1 | 0 | 3 | 4
        _ _ | 1 | _ | _ | _
        1 2 | X | . | X | X
        2   | . | . | X | X
        1 2 | X | . | X | X
        1   | . | . | . | X
        */
        int[][] columnOptions = {{1,1}, {0}, {3}, {4}};
        int[][] rowOptions = {{1,2}, {2}, {1,2}, {1}};

        nonogram = new Nonogram(columnOptions, rowOptions, 4,4);

        Solver.solve(nonogram);

        Grid expected = new Grid(4,4);
        //row 0
//        expected.setCell(0,0, 1);
//        expected.setCell(0,1, -1);
//        expected.setCell(0,2, 1);
//        expected.setCell(0,3, 1);
//        row 1
//        expected.setCell(1,0, -1);
//        expected.setCell(1,1, -1);
//        expected.setCell(1,2, 1);
//        expected.setCell(1,3, 1);
//        row 2
//        expected.setCell(2,0, 1);
//        expected.setCell(2,1, -1);
//        expected.setCell(2,2, 1);
//        expected.setCell(2,3, 1);
//        row 3
//        expected.setCell(3,0, -1);
//        expected.setCell(3,1, -1);
//        expected.setCell(3,2, -1);
//        expected.setCell(3,3, 1);

        assertThat(nonogram.getGrid()).isEqualTo(expected);
    }

}
