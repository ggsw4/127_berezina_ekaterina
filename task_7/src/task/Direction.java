package task;

public enum Direction {
    North(0, -1),
    West(-1, 0),
    South(0, 1),
    East(1, 0);
    private int x;
    private int y;

    Direction(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Vector2 move(Vector2 start, double distance){
        return new Vector2(start.getX() + distance * x, start.getY() + distance * y);
    }
}
