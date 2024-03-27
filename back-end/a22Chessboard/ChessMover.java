package a22Chessboard;
import java.util.Scanner;
public class ChessMover extends ChessBoard{
    String piece = "";
    public static void main(String[] args){
        ChessMover obj = new ChessMover();
        obj.Rook();
    }
    public void Rook(){
        ChessBoard c = resetBoard();
        piece="♜";
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the X coordinate: ");
        int x = scan.nextInt();
        System.out.println("enter the Y coordinate: ");
        int y = scan.nextInt();
        c.chessBoard[x][y]=piece;
        for (int i=0;i<c.chessBoard.length;i++){
            if(i!=x){
                c.chessBoard[i][y]="@";
            }
        }
        for(int j=0;j<c.chessBoard[y].length;j++){
            if(j!=y){
                c.chessBoard[x][j]="@";
            }
        }
        System.out.println(c);
    }
    public void Knight(){
        piece="♞";
        int xMove = 2;
        int yMove = 1;
        ChessBoard c = resetBoard();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the X coordinate: ");
        int x = scan.nextInt();
        System.out.println("enter the Y coordinate: ");
        int y = scan.nextInt();
        c.chessBoard[x][y]=piece;
    }
}
