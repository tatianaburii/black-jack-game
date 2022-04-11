package service;

import dto.Matrix;
import dto.Player;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;

import static java.lang.System.*;

public class GameController {
    private Player player;
    private int numberOfGames = 0;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.result");

    private static final String MESSAGE_PATTERN = "Example log from {}";

    public void GameRun() throws IOException {
        try {
            loggerDebug.debug("Start -->");
            Matrix matrix = new Matrix();
            ComputerTurn computerTurn = new ComputerTurn();
            out.println("Добрый день. Веедите ваше имя: ");
            player = new Player(reader.readLine());

            out.println("Сколько игор желаете сигрить?");
            int input = Integer.parseInt(reader.readLine());
            loggerDebug.debug(" Количевсиво игор: " + input);

            while (numberOfGames++ != input) {
                out.println(" Choose: \n [0] - Rock,\n [1] - Paper,\n [2] - Scissors");
                int playerScore = Integer.parseInt(reader.readLine());
                loggerDebug.debug("Player: " + playerScore);
                int computerScore = computerTurn.getComputerScore();
                loggerDebug.debug("Computer: " + computerScore);
                out.println(matrix.getResult()[playerScore][computerScore]);
                upDateStatistics(playerScore, computerScore);

                if (input - numberOfGames > 0) {
                    loggerDebug.debug("Осталось игор: " + (input - numberOfGames));
                } else loggerDebug.debug(" --> Finish!");

                out.println("\n Продолжаем? \n [x] + [enter] - выход, \n [enter] - продолжить.");

                if (reader.readLine().equalsIgnoreCase("X")) {
                    loggerDebug.debug("Пользователь вышел с игры  -->Finish!");
                    loggerResult.info(player.toString());
                    exit(-1);
                }
            }

        } catch (Exception e) {
            loggerDebug.error("Exception: " + e.getMessage());
        } finally {
//            createFileAndWriteResult();
            loggerResult.info(player.toString());

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


//    public void createFileAndWriteResult() throws IOException {
//        String folder = File.separator + "Users";
//        folder = folder.concat(File.separator).concat("tetyanaburii")
//                .concat(File.separator)
//                .concat("Desktop").concat(File.separator)
//                .concat("MyFirstProject").concat(File.separator)
//                .concat("MyGame").concat(File.separator)
//                .concat("target").concat(File.separator).concat("result.txt");
//        PrintWriter writer = new PrintWriter((new FileWriter(folder, true)));
//        writer.println(player);
//        writer.close();
//    }

}
