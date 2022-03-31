public class Mouse {
    private int x;
    private int y;
    private boolean isLive;

    public Mouse(int x, int y, boolean isLive) {
        this.x = x;
        this.y = y;
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

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}
