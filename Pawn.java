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

    //Pawn has a maximum of four possible moves: One tile ahead, Two tiles ahead if it's the first move,
    //right and left diagonals if there's a piece of the opposite color

    @Override
    public void toggleMovableTiles()
    {
        //Check for color
        if (getColor().equals("White"))
        {
            if (getFirstMove() && getBoard().getTile(getX() - 2, getY()).getPiece() == null)
            {
                getBoard().getTile(getX() - 2, getY()).toggle();
                getBoard().getTile(getX() - 2, getY()).setMovablePiece(this);
            }

            if (getX() > 0 && getBoard().getTile(getX() - 1, getY()).getPiece() == null)
            {
                getBoard().getTile(getX() - 1, getY()).toggle();
                getBoard().getTile(getX() - 1, getY()).setMovablePiece(this);
            }

            if (getX() > 0 && getY() < 7 && getBoard().getTile(getX() - 1, getY() + 1).getPiece() != null &&
                    getBoard().getTile(getX() - 1, getY() + 1).getPiece().getColor().equals("Black"))
            {
                getBoard().getTile(getX() - 1, getY() + 1).toggle();
                getBoard().getTile(getX() - 1, getY() + 1).setMovablePiece(this);
            }

            if (getX() > 0 && getY() > 0 && getBoard().getTile(getX() - 1, getY() - 1).getPiece() != null &&
                    getBoard().getTile(getX() - 1, getY() - 1).getPiece().getColor().equals("Black"))
            {
                getBoard().getTile(getX() - 1, getY() - 1).toggle();
                getBoard().getTile(getX() - 1, getY() - 1).setMovablePiece(this);
            }
        }

        else
        {
            if (getFirstMove() && getBoard().getTile(getX() + 2, getY()).getPiece() == null)
            {
                getBoard().getTile(getX() + 2, getY()).toggle();
                getBoard().getTile(getX() + 2, getY()).setMovablePiece(this);
            }

            if (getX() < 7 && getBoard().getTile(getX() + 1, getY()).getPiece() == null)
            {
                getBoard().getTile(getX() + 1, getY()).toggle();
                getBoard().getTile(getX() + 1, getY()).setMovablePiece(this);
            }

            if (getX() < 7 && getY() < 7 && getBoard().getTile(getX() + 1, getY() + 1).getPiece() != null &&
                    getBoard().getTile(getX() + 1, getY() + 1).getPiece().getColor().equals("White"))
            {
                getBoard().getTile(getX() + 1, getY() + 1).toggle();
                getBoard().getTile(getX() + 1, getY() + 1).setMovablePiece(this);
            }

            if (getX() < 7 && getY() > 0 && getBoard().getTile(getX() + 1, getY() - 1).getPiece() != null &&
                    getBoard().getTile(getX() + 1, getY() - 1).getPiece().getColor().equals("White"))
            {
                getBoard().getTile(getX() + 1, getY() - 1).toggle();
                getBoard().getTile(getX() + 1, getY() - 1).setMovablePiece(this);
            }
        }
    }
}
