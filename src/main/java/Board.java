public class Board {

    public String init() {
        char[][] memory = new char[3][3];
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

    public static void initStore(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '-';
            }
        }
    }

}
