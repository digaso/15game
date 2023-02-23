import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //i want the number of inversions of an N*N-1 tile sliding game
        int  [] board = new int[16]; 
        int inversions = 0;
        int numEstranho = 0;   
        for (int k = 0; k < 5; k++){        
        for(int i = 0; i < board.length; i++) {
            board[i] = in.nextInt();
            if (board[i] == 0){
                numEstranho = i/4 + 1;
                if (i / 4 < 3)
                    inversions += numEstranho;
            }
        }
        boolean resposta = Solvable(board, inversions);
        System.out.println("Board " + (k+1) + " is solvable: " + resposta + "\n");
        }
    }
    
    public static boolean Solvable(int[] board, int inversions) {
        for(int i = 0; i < board.length; i++) {
            for(int j = i+1; j < board.length-1; j++) {
                if(board[i] != 0 && board[j] != 0 && board[i] > board[j] )
                    inversions++;
            }
        }
        System.out.println(inversions);
        return inversions % 2 == 0;
    }
}
