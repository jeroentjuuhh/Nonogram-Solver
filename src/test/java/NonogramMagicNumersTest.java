import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.assertj.core.api.Java6Assertions.assertThat;

class NonogramMagicNumersTest {

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
    void magicNumbersColumns(){
        List<Numbers> columns = nonogram.getColumns();
        // 1 + 1 + 1
        assertThat(columns.get(0).getMagicNumber()).isEqualTo(3);
        //0 + 0 = 0
        assertThat(columns.get(1).getMagicNumber()).isEqualTo(0);
        //3 + 0 = 3
        assertThat(columns.get(2).getMagicNumber()).isEqualTo(3);
        //4 + 0 = 4
        assertThat(columns.get(3).getMagicNumber()).isEqualTo(4);
    }

    @Test
    void magicNumbersRows(){
        List<Numbers> rows = nonogram.getRows();
        // 1 + 2 + 1 = 4
        assertThat(rows.get(0).getMagicNumber()).isEqualTo(4);
        // 2 + 0 = 2
        assertThat(rows.get(1).getMagicNumber()).isEqualTo(2);
        //4 + 0 = 4
        assertThat(rows.get(2).getMagicNumber()).isEqualTo(4);
        //1 + 0 = 1
        assertThat(rows.get(3).getMagicNumber()).isEqualTo(1);
    }
}
