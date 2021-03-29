public class Rook extends Piece
{
    public Rook(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("Rook");

        if (color.equals("White"))
        {
            setImageView("assets/w_rook_png_128px.png");
        }
        else
        {
            setImageView("assets/b_rook_png_128px.png");
        }
    }

    @Override
    public void toggleMovableTiles()
    {
        for (int i = getX() - 1; i > 0; i--)
        {
            if (getBoard().getTile(i, getY()).getPiece() == null)
            {
                getBoard().getTile(i, getY()).toggle();
                getBoard().getTile(i, getY()).setMovablePiece(this);
            }

            else if (getBoard().getTile(i, getY()).getPiece() != null && !(getBoard().getTile(i, getY()).getPiece().getColor().equals(getColor())))
            {
                getBoard().getTile(i, getY()).toggle();
                getBoard().getTile(i, getY()).setMovablePiece(this);
                break;
            }
        }
    }
}
