
import static java.lang.Math.abs;

public class Bishop extends Piece
{
    public Bishop(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("Bishop");

        if (color.equals("White"))
        {
            setImageView("assets/w_bishop_png_128px.png");
        }
        else
        {
            setImageView("assets/b_bishop_png_128px.png");
        }
    }
    
    @Override
    public void toggleMovableTiles() {
       //Bishop can Move diagonally in all 4 direction (NW,NE,SW,SE)
        //This function defines that logic
        boolean lastMove = false;
        for(int i = this.getX() ; i < 8 ; i++)
        {
            for(int j = this.getY() ; j < 8 ; j++)
            {
                if(i == this.getX() & j == this.getY())
                    continue;
                
                if(abs(getBoard().getTile(i, j).getX() - this.getX()) == abs(getBoard().getTile(i,j).getY() - this.getY()))
                {
                        if(getBoard().getTile(i, j).getPiece() != null &&
                    !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())){
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        if(getBoard().getTile(i, j).getPiece() == null )
                        {
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        else
                        {
                            lastMove = true;
                            break;
                        }
                }
            }
            if(lastMove){
                lastMove= false;
                break;}
        }

        for(int i = this.getX() ; i >= 0 ; i--)
        {
            for(int j = this.getY() ; j >= 0 ; j--)
            {
                if(i == this.getX() & j == this.getY())
                    continue;
                
                if(abs(getBoard().getTile(i, j).getX() - this.getX()) == abs(getBoard().getTile(i,j).getY() - this.getY()))
                {
                        if(getBoard().getTile(i, j).getPiece() != null &&
                    !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())){
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        if(getBoard().getTile(i, j).getPiece() == null )
                        {
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        else
                        {
                            lastMove = true;
                            break;
                        }
                }
            }
            if(lastMove){
                lastMove= false;
                break;}
        }
        for(int i = this.getX() ; i >= 0 ; i--)
        {
            for(int j = this.getY() ; j < 8 ; j++)
            {
                if(i == this.getX() & j == this.getY())
                    continue;
                
                if(abs(getBoard().getTile(i, j).getX() - this.getX()) == abs(getBoard().getTile(i,j).getY() - this.getY()))
                {
                        if(getBoard().getTile(i, j).getPiece() != null &&
                    !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())){
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        if(getBoard().getTile(i, j).getPiece() == null )
                        {
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        else
                        {
                            lastMove = true;
                            break;
                        }
                }
            }
            if(lastMove){
                lastMove= false;
                break;}
        }
        for(int i = this.getX() ; i < 8 ; i++)
        {
            for(int j = this.getY() ; j >= 0 ; j--)
            {
                if(i == this.getX() & j == this.getY())
                    continue;
                
                if(abs(getBoard().getTile(i, j).getX() - this.getX()) == abs(getBoard().getTile(i,j).getY() - this.getY()))
                {
                        if(getBoard().getTile(i, j).getPiece() != null &&
                    !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())){
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        if(getBoard().getTile(i, j).getPiece() == null )
                        {
                        getBoard().getTile(i, j).toggle();
                        getBoard().getTile(i, j).setMovablePiece(this);
                        }
                        else
                        {
                            lastMove = true;
                            break;
                        }
                }
            }
            if(lastMove){
                lastMove= false;
                break;}
        }
    }
}
