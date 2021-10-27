package Chess;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Pawn extends Piece {

    protected boolean promoted;
    protected Piece newPiece;


    Pawn() {
        super(1, false);
    }

    Pawn(boolean isWhite) {
        super(1, true);
    }
    @Override
    void move() {
        System.out.println("Forward 1");

    }

    @Override
    public String toString(){
        return "Pawn{value=‘" + value + "’}";
    }
}
