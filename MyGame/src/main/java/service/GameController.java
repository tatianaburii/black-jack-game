package service;

import dto.Bundle;
import dto.Languages;
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

    public void GameRun(){

        try {
            loggerDebug.debug("Start -->");
            out.println("You should choose and input language: \nUK - українська, \nEN - English, \nDE - Deutsch.");
            String inputLanguage = reader.readLine().toUpperCase();
            bundle = chooseLanguage(Languages.valueOf(inputLanguage));
            Matrix matrix = new Matrix();
            ComputerTurn computerTurn = new ComputerTurn();
            out.println(bundle.getString("inputName"));
            player = new Player(reader.readLine());

            out.println(bundle.getString("numberOfGames"));
            int input = Integer.parseInt(reader.readLine());
            loggerDebug.debug("Number of games: " + input);

            while (numberOfGames++ != input) {
                out.println(bundle.getString("choiceMove"));
                int playerScore = Integer.parseInt(reader.readLine());
                loggerDebug.debug("Player: " + playerScore);
                int computerScore = computerTurn.getComputerScore();
                loggerDebug.debug("Computer: " + computerScore);
                out.println(matrix.getResult()[playerScore][computerScore]);
                upDateStatistics(playerScore, computerScore);

                if (input - numberOfGames > 0) {
                    loggerDebug.debug("Game: " + numberOfGames + "/" + input);
                } else loggerDebug.debug(" --> Finish!");

                out.println( "\n" + bundle.getString("choice"));

                if (reader.readLine().equalsIgnoreCase("X")) {
                    loggerDebug.debug("Player left the game  -->Finish!");
                    loggerResult.info(player.toString());
                    exit(-1);
                }
            }

        } catch (Exception e) {
            loggerDebug.error("Exception: " + e.getMessage());
        } finally {
            loggerResult.info(player.toString());
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
    public static ResourceBundle chooseLanguage(Languages language){
        ResourceBundle bundle = null;
        switch (language){
            case EN: bundle = Bundle.getBundle(new Locale("en"));
            break;
            case DE: bundle = Bundle.getBundle(new Locale("de"));
                break;
            case UK: bundle = Bundle.getBundle(new Locale("uk"));
                break;
        }
        return bundle;
    }

}
