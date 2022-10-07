package dto;

public class Matrix {
    private final String[][] result = {
            {"computerEqualsPlayer", "playerWin", "playerWin"},

            {"computerWin", "computerEqualsPlayer", "computerWin"},

            {"computerWin", "playerWin", "computerEqualsPlayer"}
    };
    private final String[] playerScore = {"playerRock", "playerPaper", "playerScissors"};
    private final String[] computerScore = {"computerRock", "computerPaper", "computerScissors"};

    public String[][] getResult() {
        return result;
    }
    public String[] getPlayerScore() {
        return playerScore;
    }
    public String[] getComputerScore() {
        return computerScore;
    }

}
