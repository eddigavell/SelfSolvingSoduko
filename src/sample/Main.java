package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Box box1 = new Box();
    Box box2 = new Box();
    Box box3 = new Box();
    Box box4 = new Box();
    Box box5 = new Box();
    Box box6 = new Box();
    Box box7 = new Box();
    Box box8 = new Box();
    Box box9 = new Box();

    public Main() {
        //initiateSudoko();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Sudoku.fxml"));
        primaryStage.setTitle("SelfSolving Soduko");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public void initiateSudoko() {
        while (!checkIfSudokoBoardIsReady()) {
            box1.randomizeValues();
            box2.randomizeValues();
            box3.randomizeValues();
            box4.randomizeValues();
            box5.randomizeValues();
            box6.randomizeValues();
            box7.randomizeValues();
            box8.randomizeValues();
            box9.randomizeValues();
        }
    }

    public boolean checkIfSudokoBoardIsReady() {
        return checkAllHorizontalRows() &&
                 checkAllVerticalRows() &&
                 box1.checkIfComplete() &&
                 box2.checkIfComplete() &&
                 box3.checkIfComplete() &&
                 box4.checkIfComplete() &&
                 box5.checkIfComplete() &&
                 box6.checkIfComplete() &&
                 box7.checkIfComplete() &&
                 box8.checkIfComplete() &&
                 box9.checkIfComplete();
    }

    public void setAllNumbersToGraphic() {
        int[] cell1 = box1.getBoxArray();
        int[] cell2 = box2.getBoxArray();
        int[] cell3 = box3.getBoxArray();
        int[] cell4 = box4.getBoxArray();
        int[] cell5 = box5.getBoxArray();
        int[] cell6 = box6.getBoxArray();
        int[] cell7 = box7.getBoxArray();
        int[] cell8 = box8.getBoxArray();
        int[] cell9 = box9.getBoxArray();

    }

    public boolean checkAllHorizontalRows() {
        if (box1.getValue(0) + box1.getValue(1) + box2.getValue(0) + box2.getValue(1) != 10) {
            return false;
        } else if (box1.getValue(2) + box1.getValue(3) + box2.getValue(2) + box2.getValue(3) != 10) {
            return false;
        } else if (box3.getValue(0) + box3.getValue(1) + box4.getValue(0) + box4.getValue(1) != 10) {
            return false;
        } else return box3.getValue(2) + box3.getValue(3) + box4.getValue(2) + box4.getValue(3) == 10;
    }

    public boolean checkAllVerticalRows() {
        if (box1.getValue(0) + box1.getValue(2) + box3.getValue(0) + box3.getValue(2) != 10) {
            return false;
        } else if (box1.getValue(1) + box1.getValue(3) + box3.getValue(1) + box3.getValue(3) != 10) {
            return false;
        } else if (box2.getValue(0) + box2.getValue(2) + box4.getValue(0) + box4.getValue(2) != 10) {
            return false;
        } else return box2.getValue(1) + box2.getValue(3) + box4.getValue(1) + box4.getValue(3) == 10;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
