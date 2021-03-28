public class King extends Piece
{
    public King(int x, int y, String color, Board board)
    {
        super(x, y, color, board);
        setType("King");

        if (color.equals("White"))
        {
            setImageView("assets/w_king_png_128px.png");
        }
        else
        {
            setImageView("assets/b_king_png_128px.png");
        }
    }

    @Override
    public void setMovablePoints(Board board)
    {

    }
}
