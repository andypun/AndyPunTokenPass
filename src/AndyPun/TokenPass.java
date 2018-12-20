package AndyPun;

public class TokenPass {
    private int playerCount;
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for (int x = 0; x < board.length; x++) {
            board[x] = (int) (Math.random() * playerCount);
        }
    }


    public void distributeCurrentPlayerTokens() {
        int temp = board[currentPlayer], x = 1, n = currentPlayer + 1;
        board[currentPlayer] = 0;
        while (x <= temp) {
            if (n < board.length) {
                board[n]++;
                n++;
                x++;
            } else {
                n = 0;
                board[n]++;
                x++;
            }
        }

    }

    public int getCurrentPlayer(){
        return currentPlayer;
    }

    public int[] getBoard(){
        return board;
    }
}