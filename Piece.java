import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public abstract class Piece
{
    private int x;
    private int y;
    private final String color;
    private ImageView imageView;
    private Board board;
    public Scene scene;

    public Piece(int x, int y, String color, Board board)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.board = board;
    }

    public abstract void setMovablePoints(Board board);

    public void setImageView(String src)
    {
        imageView = new ImageView(new Image(src));

        imageView.setOnMouseEntered(e ->
        {
            imageView.getScene().setCursor(Cursor.HAND);
        });

        imageView.setOnMouseExited(e ->
        {
            imageView.getScene().setCursor(Cursor.DEFAULT);
        });

        imageView.setOnMouseClicked(e ->
        {
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    if (board.getTile(i, j).getIsToggled())
                    {
                        board.getTile(i, j).toggle();
                    }
                }
            }
            setMovablePoints(board);
        });
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getY()
    {
        return y;
    }

    public ImageView getImageView()
    {
        return imageView;
    }
}
