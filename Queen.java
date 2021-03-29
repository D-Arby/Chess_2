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

    }
}
