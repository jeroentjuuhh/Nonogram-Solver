import java.util.ArrayList;
import java.util.List;

public class Nonogram {

    //List horizontal
    private List<Numbers> horizontal;

    //List vertically
    private List<Numbers> vertical;

    //Grid
    private Grid grid;

    public Nonogram(int[][] horizontalOptions, int[][] verticalOptions){
        horizontal = new ArrayList<Numbers>();
        vertical = new ArrayList<Numbers>();
        //Horizontal
        for(int i = 0; i < horizontalOptions.length; i++){
            horizontal.set(i, new Numbers(horizontalOptions[i]));
        }

        //Vertical
        for(int i = 0; i < verticalOptions.length; i++){
            vertical.set(i, new Numbers(verticalOptions[i]));
        }
    }


    public List<Numbers> getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(List<Numbers> horizontal) {
        this.horizontal = horizontal;
    }

    public List<Numbers> getVertical() {
        return vertical;
    }

    public void setVertical(List<Numbers> vertical) {
        this.vertical = vertical;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }
}
