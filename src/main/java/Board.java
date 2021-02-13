public class Board {

    public static char[][] memory = new char[3][3];


    public String init() {
        Board.initStore(memory);
        StringBuilder board = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            board.append("------------\n");
            for (int j = 0; j < 3; j++) {
                board.append("| ").append(memory[i][j]).append(" ");
            }
            board.append("|").append("\n");

        }
        board.append("------------");
        System.out.println(board.toString());
        return board.toString();
    }

    public String drawAfterMove() {
        StringBuilder board = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            board.append("------------\n");
            for (int j = 0; j < 3; j++) {
                board.append("| ").append(memory[i][j]).append(" ");
            }
            board.append("|").append("\n");

        }
        board.append("------------");
        System.out.println(board.toString());
        return board.toString();
    }

    public static void initStore(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '-';
            }
        }
    }

    public static boolean checkWinner() {
        int counterDiagForO = 0;
        int counterDiagForX = 0;
        for (int k = 0; k < 3; k++) {
            if (memory[k][k] == 'o') {
                counterDiagForO++;
            } else if (memory[k][k] == 'x') {
                counterDiagForX++;
            }
        }
        if (counterDiagForO == 3) {
            System.out.println("O won diagonal");
            return Main.loop = false;
        } else if (counterDiagForX == 3) {
            System.out.println("X won diagonal");
            return Main.loop = false;
        }
        System.out.println("No diagonal winner");
        return Main.loop = true;
    }

    public static Boolean checkWinnerHorizontal() {
        int counterForO;
        int counterForX;
        for (int i = 0; i < 3; i++) {
            counterForX = 0;
            counterForO = 0;
            for (int j = 0; j < 3; j++) {
                if (memory[i][j] == 'o') {
                    counterForO++;
                } else if (memory[i][j] == 'x') {
                    counterForX++;
                }
            }
            if (counterForO == 3) {
                System.out.println("Winner is O");
                return Main.loop = false;
            } else if (counterForX == 3) {
                System.out.println("Winner is X");
                return Main.loop = false;
            }
        }
        System.out.println("No horizontal winner");
        return Main.loop = true;
    }

    public static Boolean checkWinnerVertical() {
        int counterForO;
        int counterForX;
        for (int i = 0; i < 3; i++) {
            counterForX = 0;
            counterForO = 0;
            for (int j = 0; j < 3; j++) {
                if (memory[j][i] == 'o') {
                    counterForO++;
                } else if (memory[j][i] == 'x') {
                    counterForX++;
                }
            }
            if (counterForO == 3) {
                System.out.println("Winner is O");
                return Main.loop = false;
            } else if (counterForX == 3) {
                System.out.println("Winner is X");
                return Main.loop = false;
            }
        }
        System.out.println("No horizontal winner");
        return Main.loop = true;
    }
}
