import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.mock;

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
    SIMPLE:
    2 x 2
        | 1 | 1
    _ _ | _ | _
    2   | X | X
    0   | . | .
     */
    private Nonogram nonogram;

    @BeforeEach
    void setUp(){
//        int[][] columnOptions = {{1,1}, {0}, {3}, {4}};
//        int[][] rowOptions = {{1,2}, {2}, {4}, {1}};

        int[][] columnOptions = {{1}, {1}};
        int[][] rowOptions = {{2}, {0}};

        nonogram = new Nonogram(columnOptions, rowOptions, 2,2);
    }

    @Test
    public void SimpleSove(){
        //SIMPLE
        Solver.solve(nonogram);

        //creating the answer
        Grid expected = new Grid(2,2);
        expected.setCell(0,0, 1);
        expected.setCell(0,1, 1);

        assertThat(nonogram.getGrid()).isEqualTo(expected);

    }

}
