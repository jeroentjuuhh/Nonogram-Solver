import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

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

    @BeforeEach
    void setUp(){
        int[][] columnOptions = {{1,1}, {0}, {3}, {4}};
        int[][] rowOptions = {{1,2}, {2}, {4}, {1}};

        nonogram = new Nonogram(columnOptions, rowOptions, 4, 4);
    }

    @Test
    void sizeTest(){
        assertThat(nonogram.getRows().size()).isEqualTo(4);
        assertThat(nonogram.getColumns().size()).isEqualTo(4);
    }
}
