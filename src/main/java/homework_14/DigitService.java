package homework_14;

public class DigitService {


    Digit[] digits = Digit.createDigital(
            "  ###      #     #####   #####  #       #######  #####  #######  #####   ##### ",
            " #   #    ##    #     # #     # #    #  #       #     # #    #  #     # #     #",
            "#     #  # #          #       # #    #  #       #           #   #     # #     #",
            "#     #    #     #####   #####  #    #  ######  ######     #     #####   ######",
            "#     #    #    #             # #######       # #     #   #     #     #       #",
            " #   #     #    #       #     #      #  #     # #     #   #     #     # #     #",
            "  ###    #####  #######  #####       #   #####   #####    #      #####   ##### "
    );
    public void print(int[] number){
        int height = digits[0].lines.length;
        for (int i = 0; i < height; i++) {
            for (int digit : number) {
                System.out.print(digits[digit].lines[i] + " ");
            }
            System.out.println();
        }
    }



}
