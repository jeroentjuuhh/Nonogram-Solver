import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.assertj.core.api.Java6Assertions.assertThat;

class NonogramNumbersTest {

    /*
    4 x 4
            | 1 | 0 | 3 | 4
            | 1 |   |   |
        1 2 | X | . | X | X
        2   | . | . | X | X
        4   | X | . | X | X
        1   | . | . | . | X
    */
    private Nonogram nonogram;

    @BeforeEach
    void setUp(){
        int[][] columnOptions = {{1,1}, {0}, {3}, {4}};
        int[][] rowOptions = {{1,2}, {2}, {4}, {1}};

        nonogram = new Nonogram(columnOptions, rowOptions, 4, 4);
    }


    @Test
    void firstColumn(){
        ArrayList<Integer> firstColumn = new ArrayList<>();
        firstColumn.add(0, 1);
        firstColumn.add(1, 1);

        Numbers numbersFirstColumn = new Numbers(firstColumn);
        // getting the first column and checking that numbers are copied correctly
        assertThat(nonogram.getColumns().get(0)).isEqualTo(numbersFirstColumn);
    }

    @Test
    void Rows(){
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(0, 1);
        firstRow.add(1, 2);

        Numbers numbersFirstRow = new Numbers(firstRow);

        assertThat(nonogram.getRows().get(0)).isEqualTo(numbersFirstRow);
    }




}
