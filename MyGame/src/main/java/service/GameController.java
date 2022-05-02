package service;

import dto.Bundle;
import dto.Matrix;
import dto.Player;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.*;

import static java.lang.System.*;

public class GameController {
    private Player player;
    private int numberOfGames = 0;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.result");
    public static ResourceBundle bundle;

    public void GameRun() {

        try {
            bundle = chooseLanguage();
            loggerDebug.debug(bundle.getString("start"));
            Matrix matrix = new Matrix();
            ComputerTurn computerTurn = new ComputerTurn();
            loggerDebug.debug(bundle.getString("inputName"));
            player = new Player(reader.readLine());

            loggerDebug.debug(bundle.getString("numberOfGamesQuestion"));
            int input = Integer.parseInt(reader.readLine());
            while (numberOfGames++ != input) {
                out.println(bundle.getString("choiceMove"));
                int playerScore = Integer.parseInt(reader.readLine());
                int computerScore = computerTurn.getComputerScore();
                printAction(playerScore, computerScore, matrix);
                upDateStatistics(playerScore, computerScore);

                if (input - numberOfGames > 0) {
                    loggerDebug.debug(bundle.getString("game") + numberOfGames + "/" + input);
                } else loggerDebug.debug(bundle.getString("finish"));

                out.println("\n" + bundle.getString("choice"));

                if (reader.readLine().equalsIgnoreCase("X")) {
                    loggerDebug.debug("Player left the game  -->Finish!");
                    loggerResult.info(player.toString());
                    exit(-1);
                }
            }

        } catch (Exception e) {
            loggerDebug.error("Exception: " + e.getMessage());
        } finally {
            loggerResult.debug(player.toString());
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
        out.println(player);
    }
    public void printAction(int playerScore, int computerScore, Matrix matrix){
        loggerDebug.debug(bundle.getString(matrix.getPlayerScore()[playerScore]));
        loggerDebug.debug(bundle.getString(matrix.getComputerScore()[computerScore]));
        loggerDebug.debug(bundle.getString(matrix.getResult()[playerScore][computerScore]));

    }

    public static ResourceBundle chooseLanguage() throws IOException {
        ResourceBundle bundle = null;
        out.println("You should choose and input language: \n[1] - українська, \n[2] - English, \n[3] - Deutsch.");

        switch (reader.readLine()) {
            case "1":
                bundle = Bundle.getBundle(new Locale("uk"));
                break;
            case "2":
                bundle = Bundle.getBundle(new Locale("en"));
                break;
            case "3":
                bundle = Bundle.getBundle(new Locale("de"));
                break;
            default:
                out.println("Try again.");
                chooseLanguage();
        }
        return bundle;
    }

}
