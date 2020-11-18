public class Bumblebee extends Critter {
    private int move;
    private int step;
      
    public Direction getMove() {
        move++;
        if (move <= step*4+1) {
            return Direction.WEST;
        } else if (move <= step*8 + 3) {
            return Direction.SOUTH;
        } else if (move <= step*12 +6) {
            return Direction.EAST;
        } else {
            if (move == step*16 + 10) {
                move = 0;
                step++;
            }
            return Direction.NORTH;
        }
    }
}