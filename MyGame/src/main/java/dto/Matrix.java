package dto;

import service.GameController;

import java.util.Locale;
import java.util.ResourceBundle;

public class Matrix {
    ResourceBundle bundle = GameController.bundle;
    private final String[][] result = {
            {"computerRock, \n playerRock, \n computerEqualsPlayer",
                    "computerPaper, \n playerRock, \n playerWin",
                    "computerScissors, \n playerRock, \n playerWin"},

            {"computerRock, \n playerPaper, \n computerWin",
                    "computerRock, \n playerRock, \n computerEqualsPlayer",
                   "computerScissors, \n playerPaper, \n computerWin"},

            {"computerRock, \n playerScissors, \n computerWin",
                    "computerPaper, \n playerScissors, \n playerWin",
                    "computerRock, \n playerRock, \ncomputerEqualsPlayer"}
    };


    public String[][] getResult() {
        return result;
    }

}
