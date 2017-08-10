import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    static Stage mainWindow;
    static Parent nonogramRoot;
    static Nonogram nonogram;

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("CALLED");
        mainWindow = primaryStage;

        FXMLLoader loaderNonogram = new FXMLLoader(getClass().getResource("nonogramView.fxml"));
        nonogramRoot = loaderNonogram.load();

        mainWindow.setTitle("Nonogram solver");
        mainWindow.setScene(new Scene(nonogramRoot, 600, 600));
        mainWindow.show();
    }

    public static void main(String[] args){
        int[][] columns = {{1,2},{1,3}, {2,2}, {0}};
        int[][] rows = {{4,3},{4,3}, {0}, {0}};

        nonogram = new Nonogram(columns, rows, 4, 4);
        Solver.solve(nonogram);

        //System.out.println(nonogram.toString());
        //launch(args);
    }
}
