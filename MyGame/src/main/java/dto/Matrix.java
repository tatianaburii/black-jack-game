package dto;

public class Matrix {
    private final String[][] result = {
            {" Computer --> rock, \n Player --> rock \n Computer == Player",
                    " Computer --> paper, \n Player --> rock \n Player win!",
                    " Computer --> scissors, \n Player --> rock \n Player win!"},
            {" Computer --> rock, \n Player --> paper \n Computer win!",
                    " Computer --> rock, \n Player --> rock \n Computer == Player",
                    " Computer --> scissors, \n Player --> paper \n Computer win!"},
            {" Computer --> rock, \n Player --> scissors \n Computer win!",
                    " Computer --> paper, \n Player --> scissors \n Player win!",
                    " Computer --> rock, \n Player --> rock \n Computer == Player"}
    };

    public String[][] getResult() {
        return result;
    }
}
