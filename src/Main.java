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
            System.out.println();
            printBoard(board);
            System.out.println();
            
            System.out.print("Player " + player + " enter: ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            if(row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(player,board);

                if(gameOver){
                    System.out.println("Player " + player + " has won!");
                }
                else{
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            else{
                System.out.println("Invalid move. Try Again");
            }
        }
    }

    public static void printBoard(char[][] board){
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    System.out.print(board[row][col] + "|");
                }
                System.out.println();
            }
        }

        public static boolean haveWon(char player, char[][] board){
            for (int i = 0; i < board.length; i++) {
                if(board[i][0]==player && board[i][1]==player && board[i][2]==player){
                    return true;
                }
            }

            for (int i = 0; i < board.length; i++) {
                if(board[0][i]==player && board[1][i]==player && board[2][i]==player){
                    return true;
                }
            }

            if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
                return true;
            }

            if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
                return true;
            }            

            return false;
        }
}