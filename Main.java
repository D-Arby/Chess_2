import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        VBox menuLayout = new VBox();
        GridPane boardLayout = new GridPane();

        Scene menu = new Scene(menuLayout);
        menuLayout.setAlignment(Pos.TOP_CENTER);
        menuLayout.setPadding(new Insets(15, 0, 0, 0));

        Label chessLabel = new Label();
        chessLabel.setText("Chess");
        chessLabel.setTextFill(Color.BLACK);
        chessLabel.setFont(new Font("Times New Roman", 30));
        VBox.setMargin(chessLabel, new Insets(0, 0, 15, 0));

        ImageView logo = new ImageView(new Image("assets/b_knight_png_1024px.png"));
        logo.setFitWidth(228.75);
        logo.setPreserveRatio(true);

        Button startButton = new Button("Start Game");
        startButton.setFont(new Font("Times New Roman", 16));
        startButton.setPrefWidth(200);
        startButton.setPrefHeight(30);
        VBox.setMargin(startButton, new Insets(20, 0, 0, 0));

        Button exitButton = new Button("Exit Game");
        exitButton.setFont(new Font("Times New Roman", 16));
        exitButton.setPrefWidth(150);
        exitButton.setPrefHeight(30);
        VBox.setMargin(exitButton, new Insets(20, 0, 0, 0));

        menuLayout.getChildren().add(chessLabel);
        menuLayout.getChildren().add(logo);
        menuLayout.getChildren().add(startButton);
        menuLayout.getChildren().add(exitButton);

        Scene chessBoard = new Scene(boardLayout);
        Board board = new Board(boardLayout);

        startButton.setOnAction(e ->
        {
            primaryStage.setScene(chessBoard);
            board.initialize();
        });

        exitButton.setOnAction(e ->
        {
            primaryStage.close();
        });

        primaryStage.setScene(menu);
        primaryStage.getIcons().add(new Image("assets/b_knight_png_128px.png"));
        primaryStage.setTitle("Chess");
        primaryStage.setWidth(528);
        primaryStage.setHeight(550);
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}