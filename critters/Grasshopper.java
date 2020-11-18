public class Grasshopper extends Critter {
    private int hop;
    private int move;
    private int fights;
    
    public Direction getMove() {
        move++;
        hop++;
        if (move <= fights) {
            return Direction.NORTH;
        } else if (move <= 2 * fights) {
            return Direction.SOUTH;
        } else if (move == 2 * fights + 1 && move != 1) {
            return Direction.WEST;
        } else {
            hop = 0;
            return Direction.CENTER;
        }
    }
    
    public Attack fight(String opponent) {
        if (hop == 0) {
            fights++;
            move = 0;
            return Attack.ROAR;
        } else {
            return Attack.FORFEIT;
        }
    }
}