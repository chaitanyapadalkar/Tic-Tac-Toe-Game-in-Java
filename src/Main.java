import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        char[][] board = new char[3][3];
        for(int row = 0; row<board.length; row++){
            for(int col = 0; col<board[row].length; col++){
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            printBoard();
            
            System.out.println("Player " + player + " enter: ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(player,board);

                if(gameOver){
                    System.out.println("Player " + player + "has won!");
                }
                else{
                    player = player == 'X' ? 'X' : 'Y';
                }
            }
            else{
                System.out.println("Invalid move. Try Again");
            }

            printBoard();
        }

        public static void printBoard(){
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    System.out.print(board[row][col] + "|");
                }
                System.out.println();
            }
        }

        public static boolean haveWon(char player, char[][] board){
            for (int i = 0; i < board.length; i++) {
                if(board[i][col]==)
            }
        }
    }
}