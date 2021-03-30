import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox
{
    public static void display(int x, int y, String color, Board board)
    {
        Stage alert = new Stage();
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setTitle("Promotion");
        alert.setWidth(400);
        alert.setHeight(100);

        Button bishopButton = new Button();
        Button rookButton = new Button();
        Button knightButton = new Button();
        Button queenButton = new Button();

        ImageView bishopImage = new ImageView();
        ImageView rookImage = new ImageView();
        ImageView knightImage = new ImageView();
        ImageView queenImage = new ImageView();

        bishopImage.setFitWidth(40);
        bishopImage.setPreserveRatio(true);
        rookImage.setFitWidth(40);
        rookImage.setPreserveRatio(true);
        knightImage.setFitWidth(40);
        knightImage.setPreserveRatio(true);
        queenImage.setFitWidth(40);
        queenImage.setPreserveRatio(true);

        if (color.equals("White"))
        {
            alert.getIcons().add(new Image("assets/w_pawn_png_128px.png"));

            bishopImage.setImage(new Image("assets/w_bishop_png_128px.png"));
            rookImage.setImage(new Image("assets/w_rook_png_128px.png"));
            knightImage.setImage(new Image("assets/w_knight_png_128px.png"));
            queenImage.setImage(new Image("assets/w_queen_png_128px.png"));

            bishopButton.setGraphic(bishopImage);
            rookButton.setGraphic(rookImage);
            knightButton.setGraphic(knightImage);
            queenButton.setGraphic(queenImage);

            bishopButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Bishop(x, y, "White", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });

            rookButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Rook(x, y, "White", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });

            knightButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Knight(x, y, "White", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });

            queenButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Queen(x, y, "White", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });
        }

        else
        {
            alert.getIcons().add(new Image("assets/b_pawn_png_128px.png"));

            bishopImage.setImage(new Image("assets/b_bishop_png_128px.png"));
            rookImage.setImage(new Image("assets/b_rook_png_128px.png"));
            knightImage.setImage(new Image("assets/b_knight_png_128px.png"));
            queenImage.setImage(new Image("assets/b_queen_png_128px.png"));

            bishopButton.setGraphic(bishopImage);
            rookButton.setGraphic(rookImage);
            knightButton.setGraphic(knightImage);
            queenButton.setGraphic(queenImage);

            bishopButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Bishop(x, y, "Black", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });

            rookButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Rook(x, y, "Black", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });

            knightButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Knight(x, y, "Black", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });

            queenButton.setOnAction(e ->
            {
                board.getTile(x, y).getPiece().getImageView().setImage(null);
                Piece newPiece = new Queen(x, y, "Black", board);
                board.getTile(x, y).setPiece(newPiece);
                board.getLayout().add(newPiece.getImageView(), y, x);
                alert.close();
            });
        }

        layout.add(bishopButton, 100, 50);
        layout.add(rookButton, 200, 50);
        layout.add(knightButton, 300, 50);
        layout.add(queenButton, 400, 50);

        Scene alertScene = new Scene(layout);
        alert.setScene(alertScene);

        alert.show();
    }
}
