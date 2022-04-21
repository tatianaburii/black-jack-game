package dto;

import service.GameController;

import java.util.Locale;
import java.util.ResourceBundle;

public class Matrix {
    ResourceBundle bundle = GameController.bundle;
    private final String[][] result = {
            {bundle.getString("computerRock") + "\n" + bundle.getString("playerRock") + "\n" + bundle.getString("computerEqualsPlayer"),
                    bundle.getString("computerPaper") + " \n" + bundle.getString("playerRock") + "\n" + bundle.getString("playerWin"),
                    bundle.getString("computerScissors") + " \n" + bundle.getString("playerRock") + "\n" + bundle.getString("playerWin")},

            {bundle.getString("computerRock") + "\n" + bundle.getString("playerPaper") + "\n" + bundle.getString("computerWin"),
                    bundle.getString("computerRock") + "\n" + bundle.getString("playerRock") + "\n" + bundle.getString("computerEqualsPlayer"),
                    bundle.getString("computerScissors") + "\n" + bundle.getString("playerPaper") + "\n" + bundle.getString("computerWin")},

            {bundle.getString("computerRock") + "\n" + bundle.getString("playerScissors") + "\n" + bundle.getString("computerWin"),
                    bundle.getString("computerPaper") + "\n" + bundle.getString("playerScissors") + "\n" + bundle.getString("playerWin"),
                    bundle.getString("computerRock") + "\n" + bundle.getString("playerRock") + "\n" + bundle.getString("computerEqualsPlayer")}
    };


    public String[][] getResult() {
        return result;
    }
}
