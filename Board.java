import javafx.scene.layout.GridPane;

public class Board
{
    private Tile[][] grid = new Tile[8][8];

    public Board()
    {

    }

    public void initialize(GridPane layout)
    {
        String color;
        Piece piece;
        char[] pieces = {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'};

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    color = "White";
                }
                else
                {
                    color = "Black";
                }

                grid[i][j] = new Tile(i, j, color,this);
                layout.add(grid[i][j].getImageView(), j, i);
            }
        }

        for (int i = 0; i < 8; i++)
        {
            piece = new Pawn(1, i, "Black", this);
            grid[1][i].setPiece(piece);
            layout.add(piece.getImageView(), i, 1);
        }

        for (int i = 0; i < 8; i++)
        {
            piece = new Pawn(6, i, "White", this);
            grid[6][i].setPiece(piece);
            layout.add(piece.getImageView(), i, 6);
        }

        for (int i = 0; i < 8; i++)
        {
            if (pieces[i] == 'r')
            {
                piece = new Rook(0, i, "Black", this);
            }
            else if (pieces[i] == 'n')
            {
                piece = new Knight(0, i, "Black", this);
            }
            else if (pieces[i] == 'b')
            {
                piece = new Bishop(0, i, "Black", this);
            }
            else if (pieces[i] == 'q')
            {
                piece = new Queen(0, i, "Black", this);
            }
            else
            {
                piece = new King(0, i, "Black", this);
            }

            grid[0][i].setPiece(piece);
            layout.add(piece.getImageView(), i, 0);
        }

        for (int i = 0; i < 8; i++)
        {
            if (pieces[i] == 'r')
            {
                piece = new Rook(7, i, "White", this);
            }
            else if (pieces[i] == 'n')
            {
                piece = new Knight(7, i, "White", this);
            }
            else if (pieces[i] == 'b')
            {
                piece = new Bishop(7, i, "White", this);
            }
            else if (pieces[i] == 'q')
            {
                piece = new Queen(7, i, "White", this);
            }
            else
            {
                piece = new King(7, i, "White", this);
            }

            grid[7][i].setPiece(piece);
            layout.add(piece.getImageView(), i, 7);
        }
    }

    public Tile getTile(int x, int y)
    {
        return grid[x][y];
    }
}
