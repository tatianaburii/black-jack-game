package dto;

public class Player {
    private String name;
    private int lost = 0;
    private int win = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }
}
