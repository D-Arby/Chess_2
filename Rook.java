public class Rook extends Piece {
    public Rook(int x, int y, String color, Board board) {
        super(x, y, color, board);
        setType("Rook");

        if (color.equals("White")) {
            setImageView("assets/w_rook_png_128px.png");
        } else {
            setImageView("assets/b_rook_png_128px.png");
        }
    }

    @Override
    public void toggleMovableTiles() {
        for (int i = this.getX(), j = (this.getY() + 1); j < 8; j++) {
            if (getBoard().getTile(i, j).getPiece() != null &&
                    !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())) {
                getBoard().getTile(i, j).toggle();
                getBoard().getTile(i, j).setMovablePiece(this);
            }
            if (getBoard().getTile(i, j).getPiece() == null) {
                getBoard().getTile(i, j).toggle();
                getBoard().getTile(i, j).setMovablePiece(this);
            } else {
                break;
            }
        }

        for (int i = this.getX(), j = (this.getY() - 1); j >= 0; j--) {
            if (getBoard().getTile(i, j).getPiece() != null &&
                    !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())) {
                getBoard().getTile(i, j).toggle();
                getBoard().getTile(i, j).setMovablePiece(this);
            }
            if (getBoard().getTile(i, j).getPiece() == null) {
                getBoard().getTile(i, j).toggle();
                getBoard().getTile(i, j).setMovablePiece(this);
            } else {
                break;
            }
        }

        for (int i = (this.getX() + 1), j = this.getY(); i < 8; i++) {
            if (getBoard().getTile(i, j).getPiece() != null &&
                    !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())) {
                getBoard().getTile(i, j).toggle();
                getBoard().getTile(i, j).setMovablePiece(this);
            }
            if (getBoard().getTile(i, j).getPiece() == null) {
                getBoard().getTile(i, j).toggle();
                getBoard().getTile(i, j).setMovablePiece(this);
            } else {
                break;
            }
        }

        for (int i = (this.getX() - 1), j = this.getY(); i >= 0; i--) {
            {
                if (getBoard().getTile(i, j).getPiece() != null &&
                        !getBoard().getTile(i, j).getPiece().getColor().equals(this.getColor())) {
                    getBoard().getTile(i, j).toggle();
                    getBoard().getTile(i, j).setMovablePiece(this);
                }
                if (getBoard().getTile(i, j).getPiece() == null) {
                    getBoard().getTile(i, j).toggle();
                    getBoard().getTile(i, j).setMovablePiece(this);
                } else {
                    break;
                }
            }
        }
    }
}
