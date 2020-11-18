import java.awt.*;

public class Butterfly extends Critter {
    private int move;
    
    public String toString() {
        if (move % 2 == 0) {
            return "x";
        } else {
            return "-";
        }
    }
    
    public Direction getMove() {
        move++;
        if (move > 4) {
            move -= 4;
        }
        if (move == 1) {
            return Direction.NORTH;
        } else if (move == 2) {
            return Direction.WEST;
        } else if (move == 3) {
            return Direction.NORTH;
        } else {
            return Direction.EAST;
        }
    }
    
    public Color getColor() {
        return Color.YELLOW;
    }    
}