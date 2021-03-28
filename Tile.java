import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Tile
{
    private final int x;
    private final int y;
    private final String color;
    private Piece piece;
    private Piece movablePiece;
    private Board board;
    private final Image image;
    private ImageView imageView;
    private boolean isToggled;

    public Tile(int x, int y, String color, Board board)
    {
        this.x = x;
        this.y = y;
        this.color = color;

        if (color.equals("White"))
        {
            image = new Image("assets/square brown light_png_128px.png");
        }
        else
        {
            image = new Image("assets/square brown dark_png_128px.png");
        }
        imageView = new ImageView(image);
        imageView.setFitWidth(64);
        imageView.setFitHeight(64);

        imageView.setOnMouseEntered(e ->
        {
            if (isToggled)
            {
                imageView.getScene().setCursor(Cursor.HAND);
            }
        });

        imageView.setOnMouseExited(e ->
        {
            imageView.getScene().setCursor(Cursor.DEFAULT);
        });

        imageView.setOnMouseClicked(e ->
        {
            if (isToggled && movablePiece != null)
            {
                GridPane.setRowIndex(movablePiece.getImageView(), x);
                GridPane.setColumnIndex(movablePiece.getImageView(), y);
                movablePiece.setX(x);
                movablePiece.setY(y);
                board.getTile(movablePiece.getX(), movablePiece.getY()).setPiece(null);
                this.toggle();
            }
        });
    }

    public void toggle()
    {
        if(!isToggled)
        {
            if (color.equals("White"))
            {
                imageView.setImage(new Image("assets/square gray light _png_128px.png"));
            }
            else
            {
                imageView.setImage(new Image("assets/square gray dark _png_128px.png"));
            }

            isToggled = true;
        }
        else
        {
            imageView.setImage(image);

            isToggled = false;
        }
    }

    public Piece getPiece()
    {
        return piece;
    }

    public ImageView getImageView()
    {
        return imageView;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }

    public boolean getIsToggled()
    {
        return isToggled;
    }

    public void setMovablePiece(Piece piece)
    {
        movablePiece = piece;
    }
}
