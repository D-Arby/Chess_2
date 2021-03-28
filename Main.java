import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage chessBoard)
    {
        GridPane board = new GridPane();
        board.setAlignment(Pos.CENTER);
        chessBoard.setScene(new Scene(board));

        Board myBoard = new Board();
        myBoard.initialize(board);

        chessBoard.setWidth(530);
        chessBoard.setHeight(540);
        chessBoard.setResizable(false);

        chessBoard.show();
    }
}