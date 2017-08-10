import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

import java.util.List;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class NonogramController {

    @FXML
    GridPane gridPaneGrid;
    Font f;

    public void initialize(){
        f = new Font(30);
        //t.setFont(Font.font("Verdana", FontWeight.BOLD, 70));

        gridPaneGrid.getRowConstraints().clear();

        System.out.println(App.nonogram.getColumns().size());

        //row
        for(int i = 0 ; i < App.nonogram.getRows().size(); i++) {
            //column
            for (Cell cell : App.nonogram.getGrid().getColumn(i)){
                Label l = new Label("" + cell.getStatus());
                gridPaneGrid.add(l, cell.getColumnIndex(), cell.getRowIndex());
            }
        }


        //Grid of the solution
        for(int i = 0; i < App.nonogram.getColumns().size(); i++){
            ColumnConstraints columnConstraints = new ColumnConstraints(50, 100, USE_COMPUTED_SIZE);
            gridPaneGrid.getColumnConstraints().add(columnConstraints);
        }

        for(int i = 0; i < App.nonogram.getRows().size(); i++){
            RowConstraints row = new RowConstraints(50, 100, USE_COMPUTED_SIZE);
            gridPaneGrid.getRowConstraints().add(row);
        }

        //loadSudoku();
        gridPaneGrid.setGridLinesVisible(true);
        System.out.println("initialized");
    }
}
