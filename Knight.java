
import static java.lang.Math.abs;

public class Knight extends Piece
{
    public Knight(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("Knight");

        if (color.equals("White"))
        {
            setImageView("assets/w_knight_png_128px.png");
        }
        else
        {
            setImageView("assets/b_knight_png_128px.png");
        }
    }

    @Override
    public void toggleMovableTiles() {
       for(int i = 0 ; i < 8 ; i++)
        {
            for(int j = 0 ; j < 8 ; j++)
            {
                if(((abs(getBoard().getTile(i, j).getX() - this.getX()) == 2) & (abs(getBoard().getTile(i,j).getY() - this.getY())==1))
                        | ((abs(getBoard().getTile(i, j).getX() - this.getX()) == 1) & (abs(getBoard().getTile(i,j).getY() - this.getY())==2))             
                        )
                {
                    
                    if(getColor().equals("White")){
                        if(getBoard().getTile(i, j).getPiece() != null &&
                    getBoard().getTile(i, j).getPiece().getColor().equals("Black")){
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        if(getBoard().getTile(i, j).getPiece() == null )
                        {
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                    }
                    else
                    {
                        if(getBoard().getTile(i, j).getPiece() != null &&
                    getBoard().getTile(i, j).getPiece().getColor().equals("White")){
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        if(getBoard().getTile(i, j).getPiece() == null )
                        {
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                    }

                }
            }
        }

    }
}
