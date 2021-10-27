package Chess;

public abstract class Piece {

    protected int value;
    protected boolean isWhite;

    Piece(int value, boolean isWhite) {
        setValue(value);
        setIsWhite(isWhite);
    }




    abstract void move();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        value = value;
    }

    public void  setIsWhite(int isWhite){
        isWhite = isWhite;
    }

    public boolean getIsWhite(){
        return isWhite;
    }

    public boolean equals(Piece piece) {

        return piece.getIsWhite() == this.getIsWhite() &&
                 piece.getValue() == this.getValue();

    }

    @Override
    public String toString() {
        return "Piece{Value=" + value + "}";
    }

}
