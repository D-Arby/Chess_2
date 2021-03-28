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
    public void setMovablePoints(Board board)
    {

    }
}
