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
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void GameRun() throws IOException {
        matrix = new Matrix();
        computerTurn = new ComputerTurn();
        System.out.println("Добрый день. Веедите ваше имя: ");
        player = new Player(reader.readLine());
        try {
            do {
                int computerScore = computerTurn.getComputerScore();
                System.out.println(" Choose: \n [0] - Rock,\n [1] - Paper,\n [2] - Scissors");

                int playerScore = Integer.parseInt(reader.readLine());

                System.out.println(matrix.getResult()[playerScore][computerScore]);
                upDateStatistics(playerScore, computerScore);

                System.out.println("\n Введите [x] - для выхода с игры" +
                        "\n Нажмите [enter] - для продолжения");

            } while ((!(reader.readLine().equalsIgnoreCase("x"))));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            printStatistics();
        }



    }
    public void upDateStatistics(int playerScore, int computerScore){
        if (playerScore == 0 && computerScore == 1 || playerScore == 0 && computerScore == 2
                || playerScore == 2 && computerScore == 1) {
            player.setWin(player.getWin() + 1);
        }
        if (playerScore == 1 && computerScore == 0 || playerScore == 1 && computerScore == 2
                || playerScore == 2 && computerScore == 0) {
            player.setLost(player.getLost() + 1);
        }

    }
    public void printStatistics(){
        System.out.println();
        System.out.println("===============================================");
        System.out.println("Игровая статистика для игрока : " + player.getName());
        System.out.println("Выиграно   : " + player.getWin());
        System.out.println("Проигранно : " + player.getLost());
        System.out.println("===============================================");
    }

}
