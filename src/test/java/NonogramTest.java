import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NonogramTest {

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
    private int sizeRows, sizeColumns;

    @BeforeEach
    void setUp(){
        int[][] columnOptions = {{1,1}, {0}, {3}, {4}};
        int[][] rowOptions = {{1,2}, {2}, {4}, {1}};

        sizeRows = 4;
        sizeColumns = 5;

        nonogram = new Nonogram(columnOptions, rowOptions, sizeRows, sizeColumns);
    }

    //TODO: The sizes should be well defined, so make sure that the definition is correct of what you are trying to compare

    @Test
    void sizeTest(){
        assertThat(nonogram.getRows().size()).isEqualTo(sizeRows);
        //the amount of columns should be equal to the size of the rows
        assertThat(nonogram.getColumns().size()).isEqualTo(sizeColumns);
    }

    @Test
    void sizeTest2() {
        assertThat(nonogram.getGrid().getAmountColumns()).isEqualTo(sizeColumns);
        assertThat(nonogram.getGrid().getAmountRows()).isEqualTo(sizeRows);
    }
}
