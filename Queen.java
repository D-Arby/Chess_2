public class Queen extends Piece
{
    public Queen(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("Queen");

        if (color.equals("White"))
        {
            setImageView("assets/w_queen_png_128px.png");
        }
        else
        {
            setImageView("assets/b_queen_png_128px.png");
        }
    }

    @Override
    public void toggleMovableTiles() {
        for (int i = getX(); i > 0; i--) {
            if (getBoard().getTile(i - 1, getY()).getPiece() == null) {
                getBoard().getTile(i - 1, getY()).toggle();
                getBoard().getTile(i - 1, getY()).setMovablePiece(this);
            } else {
                if (!getBoard().getTile(i - 1, getY()).getPiece().getColor().equals(getColor())) {
                    getBoard().getTile(i - 1, getY()).toggle();
                    getBoard().getTile(i - 1, getY()).setMovablePiece(this);
                }
                break;
            }
        }

        for (int i = getX(); i < 7; i++) {
            if (getBoard().getTile(i + 1, getY()).getPiece() == null) {
                getBoard().getTile(i + 1, getY()).toggle();
                getBoard().getTile(i + 1, getY()).setMovablePiece(this);
            } else {
                if (!getBoard().getTile(i + 1, getY()).getPiece().getColor().equals(getColor())) {
                    getBoard().getTile(i + 1, getY()).toggle();
                    getBoard().getTile(i + 1, getY()).setMovablePiece(this);
                }
                break;
            }
        }

        for (int i = getY(); i > 0; i--) {
            if (getBoard().getTile(getX(), i - 1).getPiece() == null) {
                getBoard().getTile(getX(), i - 1).toggle();
                getBoard().getTile(getX(), i - 1).setMovablePiece(this);
            } else {
                if (!getBoard().getTile(getX(), i - 1).getPiece().getColor().equals(getColor())) {
                    getBoard().getTile(getX(), i - 1).toggle();
                    getBoard().getTile(getX(), i - 1).setMovablePiece(this);
                }
                break;
            }
        }

        for (int i = getY(); i < 7; i++) {
            if (getBoard().getTile(getX(), i + 1).getPiece() == null) {
                getBoard().getTile(getX(), i + 1).toggle();
                getBoard().getTile(getX(), i + 1).setMovablePiece(this);
            } else {
                if (!getBoard().getTile(getX(), i + 1).getPiece().getColor().equals(getColor())) {
                    getBoard().getTile(getX(), i + 1).toggle();
                    getBoard().getTile(getX(), i + 1).setMovablePiece(this);
                }
                break;
            }
        }

        int i = getX();
        int j = getY();

        while (i > 0 && j < 7)
        {
            if (getBoard().getTile(i - 1, j + 1).getPiece() == null)
            {
                getBoard().getTile(i - 1, j + 1).toggle();
                getBoard().getTile(i - 1, j + 1).setMovablePiece(this);
            }
            else
            {
                if (!getBoard().getTile(i - 1, j + 1).getPiece().getColor().equals(getColor()))
                {
                    getBoard().getTile(i - 1, j + 1).toggle();
                    getBoard().getTile(i - 1, j + 1).setMovablePiece(this);
                }
                break;
            }
            i--;
            j++;
        }

        i = getX();
        j = getY();

        while (i > 0 && j > 0)
        {
            if (getBoard().getTile(i - 1, j - 1).getPiece() == null)
            {
                getBoard().getTile(i - 1, j - 1).toggle();
                getBoard().getTile(i - 1, j - 1).setMovablePiece(this);
            }
            else
            {
                if (!getBoard().getTile(i - 1, j - 1).getPiece().getColor().equals(getColor()))
                {
                    getBoard().getTile(i - 1, j - 1).toggle();
                    getBoard().getTile(i - 1, j - 1).setMovablePiece(this);
                }
                break;
            }
            i--;
            j--;
        }

        i = getX();
        j = getY();

        while (i < 7 && j < 7)
        {
            if (getBoard().getTile(i + 1, j + 1).getPiece() == null)
            {
                getBoard().getTile(i + 1, j + 1).toggle();
                getBoard().getTile(i + 1, j + 1).setMovablePiece(this);
            }
            else
            {
                if (!getBoard().getTile(i + 1, j + 1).getPiece().getColor().equals(getColor()))
                {
                    getBoard().getTile(i + 1, j + 1).toggle();
                    getBoard().getTile(i + 1, j + 1).setMovablePiece(this);
                }
                break;
            }
            i++;
            j++;
        }

        i = getX();
        j = getY();

        while (i < 7 && j > 0)
        {
            if (getBoard().getTile(i + 1, j - 1).getPiece() == null)
            {
                getBoard().getTile(i + 1, j - 1).toggle();
                getBoard().getTile(i + 1, j - 1).setMovablePiece(this);
            }
            else
            {
                if (!getBoard().getTile(i + 1, j - 1).getPiece().getColor().equals(getColor()))
                {
                    getBoard().getTile(i + 1, j - 1).toggle();
                    getBoard().getTile(i + 1, j - 1).setMovablePiece(this);
                }
                break;
            }
            i++;
            j--;
        }
    }
}
