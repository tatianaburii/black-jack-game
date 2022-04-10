package dto;

import java.util.Date;

public class Player {
    private String name;
    private int lost = 0;
    private int win = 0;
    private int draw = 0;
//    private Date date = new Date();

    @Override
    public String toString() {
        return
                "\nИгровая статистика для игрока : " + name +
                "\nПроигранно : " + lost  +
                "\nВыиграно   : " + win +
                "\nНичья      : " + draw +
//                "\n\n........" + date + "........" +
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
