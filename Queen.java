package Chess;

public class Queen extends Piece{
    Queen() {
        super(9, false);
    }
    Queen(boolean isWhite) {
        super(9, true);
    }

    @Override
    void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString(){
        return "Queen{value=‘" + value + "’}";
    }
}