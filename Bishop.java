package Chess;

public class Bishop extends Piece{
    Bishop() {
        super(3, false);
    }
    Bishop(boolean isWhite) {
        super(3, true);
    }

    @Override
    void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString(){
        return "Bishop{value=‘" + value + "’}";
    }
}
