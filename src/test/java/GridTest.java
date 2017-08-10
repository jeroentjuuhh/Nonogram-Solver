import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class GridTest {

    @Test
    void gridTestIndexesSquare() {
        int size = 4;
        Grid grid = new Grid(size, size);

        for (int i = 0; i < size * size; i++) {
            assertThat(grid.getCell(i).getIndex()).isEqualTo(i);
        }
    }

    @Test
    void gridTestIndexes() {
        int columnSize = 4;
        int rowSize = 6;
        Grid grid = new Grid(columnSize, rowSize);

        for (int i = 0; i < columnSize * rowSize; i++) {
            assertThat(grid.getCell(i).getIndex()).isEqualTo(i);
        }
    }

    @Test
    void testStatus() {
        Grid grid = new Grid(10, 10);

        for (int i = 0; i < grid.getSize(); i++) {
            assertThat(grid.getCell(i).getStatus()).isEqualTo(0);
        }
    }

    @Test
    void testColumnIndexes() {
        Grid grid = new Grid(5, 6);
        for (int i = 0; i < grid.getAmountColumns(); i++) {
            List<Cell> column = grid.getColumn(i);
            assertThat(column.size()).isEqualTo(grid.getAmountRows());

            //check that the column indexes are correctly assigned
            for (int j = 0; j < column.size(); j++) {
                assertThat(column.get(j).getColumnIndex()).isEqualTo(i);
            }
        }
    }

    @Test
    void testRowIndexes() {
        Grid grid = new Grid(5, 6);
        for (int i = 0; i < grid.getAmountRows(); i++) {
            List<Cell> row = grid.getRow(i);
            assertThat(row.size()).isEqualTo(grid.getAmountColumns());

            //check that the column indexes are correctly assigned
            for (int j = 0; j < row.size(); j++) {
                assertThat(row.get(j).getRowIndex()).isEqualTo(i);
            }
        }
    }

}

