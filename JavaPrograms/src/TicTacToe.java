import java.util.Scanner;

public class TicTacToe {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char player1Symbol;
        char player2Symbol;

        char[] symbols = chooseSymbols(sc);

        player1Symbol = symbols[0];
        player2Symbol = symbols[1];

        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

        printBoard(board);

        while (true) {
			player1Turn(sc, board, player1Symbol);
			if (isGameFinished(board, player1Symbol, player2Symbol)){
				break;
			}
			printBoard(board);
			
			player2Turn(sc, board, player2Symbol);
			if (isGameFinished(board, player1Symbol, player2Symbol)){
				break;
			}
			printBoard(board);
		}
		sc.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] );
    }

    public static char[] chooseSymbols(Scanner sc) {
        System.out.println("Player 1: Enter your preferred symbol: (X or O)");
        char player1Symbol = sc.next().charAt(0);
        char player2Symbol = (player1Symbol == 'X') ? 'O' : 'X';

        return new char[]{player1Symbol, player2Symbol};
    }

    public static void player1Turn(Scanner sc, char[][] board, char playerSymbol) {
        String player1Move;

        while (true) {
            System.out.println("Player 1: Enter your move: (1-9)");
            player1Move = sc.next();
            if (isValidMove(board, player1Move)) {
                break;
            } else {
                System.out.println(player1Move + " is not valid.");
            }
        }
        
        placeMove(board, player1Move, playerSymbol);
        
    }

    public static void player2Turn(Scanner sc, char[][] board, char player2Symbol) {
        String player2Move;

        while (true) {
            System.out.println("Player 2: Enter your move: (1-9)");
            player2Move = sc.next();
            if (isValidMove(board, player2Move)) {
                break;
            } else {
                System.out.println(player2Move + "is not valid.");
            }
        }
        
        placeMove(board, player2Move, player2Symbol);
    }

    public static void placeMove(char[][] board, String position, char symbol) {
         switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
        }
    }

    public static boolean isValidMove(char[][] board, String position) {
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    public static boolean didAnyoneWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    public static boolean isGameFinished(char[][] board, char player1Symbol, char player2Symbol) {
        if (didAnyoneWin(board, player1Symbol)) {	
            printBoard(board);
            System.out.println("Player 1 wins!");
            return true;
        }

        if (didAnyoneWin(board, player2Symbol)) {	
            printBoard(board);
            System.out.println("Player 2 wins!");
            return true;
        }

        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }

        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }

    
}
