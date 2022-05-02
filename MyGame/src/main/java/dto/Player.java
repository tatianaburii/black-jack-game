package dto;

import service.GameController;

import java.util.ResourceBundle;

public class Player {
    private String name;
    private int lost = 0;
    private int win = 0;
    private int draw = 0;
    ResourceBundle bundle = GameController.bundle;

    @Override
    public String toString() {
        return
                "\n" + bundle.getString("statistics") + name +
                        "\n" + bundle.getString("lost") + lost +
                        "\n" + bundle.getString("win") + win +
                        "\n" + bundle.getString("equals") + draw +
                        "\n============================================";
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

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
