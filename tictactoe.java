import java.util.ArrayList;
import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            board.add(" ");
        }   
        Scanner s = new Scanner(System.in);
        String player1 = "X";
        String player2 = "O";
        String currentPlayer = player1;
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            int move = s.nextInt() - 1;
            if (board.get(move).equals(" ")) {
                board.set(move, currentPlayer);
                if (checkWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOver = true;
                } else if (checkDraw(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer.equals(player1)) ? player2 : player1;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        s.close();
    }
    
    public static void printBoard(ArrayList<String> board) {
        System.out.println("-------------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + board.get(i) + " | " + board.get(i+1) + " | " + board.get(i+2) + " |");
            System.out.println("-------------");
        }
    }
    
    public static boolean checkWin(ArrayList<String> board, String player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board.get(i * 3).equals(player) && board.get(i * 3 + 1).equals(player) && board.get(i * 3 + 2).equals(player)) {
                return true;
            }
            // Check columns
            if (board.get(i).equals(player) && board.get(i + 3).equals(player) && board.get(i + 6).equals(player)) {
                return true;
            }
        }
        // Check diagonals
        if (board.get(0).equals(player) && board.get(4).equals(player) && board.get(8).equals(player)) {
            return true;
        }
        if (board.get(2).equals(player) && board.get(4).equals(player) && board.get(6).equals(player)) {
            return true;
        }
        return false;
    }
    
    public static boolean checkDraw(ArrayList<String> board) {
        for (String spot : board) {
            if (spot.equals(" ")) {
                return false; // If there is at least one empty spot, it's not a draw
            }
        }
        return true; // No empty spots, it's a draw
    }
}
