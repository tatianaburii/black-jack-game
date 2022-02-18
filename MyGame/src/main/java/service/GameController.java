package service;

import dto.Matrix;
import dto.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameController {
    private Player player;
    private Matrix matrix;
    private ComputerTurn computerTurn;
    private int numberOfGames = 0;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void GameRun() throws IOException {
        matrix = new Matrix();
        computerTurn = new ComputerTurn();

        System.out.println("Добрый день. Веедите ваше имя: ");
        player = new Player(reader.readLine());

        System.out.println("Сколько игор желаете сигрить?");
        int input = Integer.parseInt(reader.readLine());


        try {
            while (numberOfGames++ != input) {
                int computerScore = computerTurn.getComputerScore();
                System.out.println(" Choose: \n [0] - Rock,\n [1] - Paper,\n [2] - Scissors");
                int playerScore = Integer.parseInt(reader.readLine());
                System.out.println(matrix.getResult()[playerScore][computerScore]);
                upDateStatistics(playerScore, computerScore);
                System.out.println("\n Продолжаем? \n [x] + [enter] - выход, \n [enter] - продолжить.");
                if(reader.readLine().equalsIgnoreCase("X")) System.exit(-1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            printStatistics();
        }
    }

    public void upDateStatistics(int playerScore, int computerScore) {
        if (playerScore == 0 && computerScore == 1 || playerScore == 0 && computerScore == 2 || playerScore == 2 && computerScore == 1) {
            player.setWin(player.getWin() + 1);
        } else if (playerScore == 1 && computerScore == 0 || playerScore == 1 && computerScore == 2 || playerScore == 2 && computerScore == 0) {
            player.setLost(player.getLost() + 1);
        } else {
            player.setDraw(player.getDraw() + 1);
        }
    }

    public void printStatistics() {
        System.out.println();
        System.out.println("===============================================");
        System.out.println("Игровая статистика для игрока : " + player.getName());
        System.out.println("Выиграно   : " + player.getWin());
        System.out.println("Проигранно : " + player.getLost());
        System.out.println("Ничья      : " + player.getDraw());
        System.out.println("===============================================");
    }

}
