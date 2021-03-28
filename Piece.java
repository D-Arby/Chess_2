import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public abstract class Piece
{
    private int x;
    private int y;
    private final String color;
    private ImageView imageView;
    private final Board board;
    private String type;
    private boolean isFirstMove;

    public Piece(int x, int y, String color, Board board)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.board = board;
        isFirstMove = true;
    }

    public abstract void setMovablePoints(Board board);

    public void setImageView(String src)
    {
        imageView = new ImageView(new Image(src));
        if (type.equals("Pawn"))
        {
            imageView.setFitHeight(40);
            imageView.setFitWidth(32);
            GridPane.setMargin(imageView, new Insets(0, 0, 0, 15));
        }
        else
        {
            imageView.setFitWidth(40);
            imageView.setFitHeight(45);
            GridPane.setMargin(imageView, new Insets(2, 0, 0, 12));
        }

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

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public Board getBoard()
    {
        return board;
    }

    public String getColor()
    {
        return color;
    }

    public void move(int x, int y)
    {
        board.getTile(x, y).setPiece(null);
        GridPane.setRowIndex(imageView, x);
        GridPane.setColumnIndex(imageView, y);
        setX(x);
        setY(y);
        board.getTile(getX(), getY()).setPiece(null);
        isFirstMove = false;
    }

    public boolean getFirstMove()
    {
        return isFirstMove;
    }
}
