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
    public void setMovablePoints(Board board)
    {

    }

}
