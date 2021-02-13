public class AI {

    public static void inputPc() {
        int a = 1 + (int) (Math.random() * ((3 - 1) + 1));
        int b = 1 + (int) (Math.random() * ((3 - 1) + 1));

        if (Board.memory[a - 1][b - 1] == 'x' || Board.memory[a - 1][b - 1] == 'o') {
            System.out.println("Try another field!");
            inputPc();
        } else {
            Board.memory[a - 1][b - 1] = 'o';
        }
    }
}
