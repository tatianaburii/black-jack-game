package service;

import dto.Matrix;
import dto.Player;

import java.io.*;

import static java.lang.System.*;

public class GameController {
    private Player player;
    private Matrix matrix;
    private ComputerTurn computerTurn;
    private int numberOfGames = 0;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    public void GameRun() throws IOException {
        matrix = new Matrix();
        computerTurn = new ComputerTurn();

        out.println("Добрый день. Веедите ваше имя: ");
        player = new Player(reader.readLine());

        out.println("Сколько игор желаете сигрить?");
        int input = Integer.parseInt(reader.readLine());


        try {
            while (numberOfGames++ != input) {
                int computerScore = computerTurn.getComputerScore();
                out.println(" Choose: \n [0] - Rock,\n [1] - Paper,\n [2] - Scissors");
                int playerScore = Integer.parseInt(reader.readLine());
                out.println(matrix.getResult()[playerScore][computerScore]);
                upDateStatistics(playerScore, computerScore);
                out.println("\n Продолжаем? \n [x] + [enter] - выход, \n [enter] - продолжить.");
                if (reader.readLine().equalsIgnoreCase("X")) exit(-1);
            }

        } catch (Exception e) {
            out.println(e.getMessage());
        } finally {
            printStatistics();
            createFileAndWriteResult();
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
        out.println(player);
    }

    public void createFileAndWriteResult() throws IOException {
        PrintWriter writer = new PrintWriter((new FileWriter("/Users/tetyanaburii/Desktop/MyFirstProject/MyGame/src/main/java/result.txt", true)));
        writer.println(player);
        writer.close();
    }

}
