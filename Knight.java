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
    public void setMovablePoints(Board board)
    {

    }
}
