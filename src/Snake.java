public class Snake {
    private int x;
    private int y;
    private int length;
    private int speed;
    private boolean isLive;

    public Snake(int x, int y, int length, int speed, boolean isLive) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.speed = speed;
        this.isLive = isLive;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
