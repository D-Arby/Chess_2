import javafx.scene.layout.GridPane;

public class Pawn extends Piece
{
    public Pawn(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("Pawn");

        if (color.equals("White"))
        {
            setImageView("assets/w_pawn_png_128px.png");
        }
        else
        {
            setImageView("assets/b_pawn_png_128px.png");
        }
    }

    @Override
    public void setMovablePoints(Board board)
    {
        if (getFirstMove() && board.getTile(getX() - 2, getY()).getPiece() == null)
        {
            board.getTile(getX() - 2, getY()).toggle();
            board.getTile(getX() - 2, getY()).setMovablePiece(this);
        }
    }
}
