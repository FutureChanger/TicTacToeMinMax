import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static boolean loop = true;

    public static void main(String[] args) {
        Board y = new Board();
        y.init();
        while (loop) {
            input();
            y.drawAfterMove();
            AI.inputPc();
            y.drawAfterMove();
            Board.checkWinner();
            Board.checkWinnerHorizontal();
            Board.checkWinnerVertical();
        }
    }


    public static void input() {

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a >= 1 && a <= 3) && (b >= 1 && b <= 3)) {
            if (Board.memory[a - 1][b - 1] == 'x' || Board.memory[a - 1][b - 1] == 'o') {
                System.out.println("Try another field!");
                input();
            } else {
                Board.memory[a - 1][b - 1] = 'x';
            }
        } else {
            System.out.println("The value for each number must be between 1 and 3! Please try again!");
            input();
        }
    }
}
