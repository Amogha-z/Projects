package a22Chessboard;
import java.util.Scanner;
public class ChessBoard{
    static final int dimension = 8;
    String[][] chessBoard = new String[dimension][dimension];
    String[] whites = {"♖","♘","♗","♔","♕","♗","♘","♖"};
    String[] blacks ={"♜","♞","♝","♚","♛","♝","♞","♜"};
    String[] color_schemes = {ConsoleColors.BLACK_BACKGROUND,ConsoleColors.YELLOW_BACKGROUND,ConsoleColors.CYAN_BACKGROUND,ConsoleColors.GREEN_BACKGROUND};
    String color1 = ConsoleColors.BLACK_BACKGROUND;
    String color2 = ConsoleColors.WHITE_BACKGROUND;
    public ChessBoard(){
        chessBoard = new String[dimension][dimension]; 
    }
    public ChessBoard(String[][] val){
        chessBoard = val;
    }
    public void setColorScheme(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("There are 4 color schemes available,\n1.Black and White\n2.Yellow and White\n3.Cyan and white\n4.Green and white\nGive input as their respective numbers.");
        num = sc.nextInt();
        if(num>=0 && num<=color_schemes.length){
            color1 = color_schemes[num-1];
        }
    }
    public ChessBoard chooseChessBoard(){
        ChessBoard c = new ChessBoard();
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want a,\n1.Regular board\n2.Flipped Board\n3.Empty Board\nGive input as their respective numbers : ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                ChessBoard c1 = c.positions(false);
                c1.setColorScheme(num);
                return c1;
            case 2:
                ChessBoard c2 = c.positions(true);
                c2.setColorScheme(num);
                return c2;
            case 3:
                ChessBoard c3 = c.resetBoard();
                c3.setColorScheme(num);
                return c3;
            default:
                c.setColorScheme(0);
                return c;
        }
    }    
    public ChessBoard resetBoard(){
        String[][] newChess = new String[dimension][dimension];
        for(int i=0;i<newChess.length;i++){
            for(int j=0;j<newChess[0].length;j++){
                newChess[i][j]=" ";
            }
        }
        return new ChessBoard(newChess);
    }
    public ChessBoard positions(boolean flipped){
        String[][] newChess = new String[dimension][dimension];
        String[] whitePieces= flipped ? blacks : whites;
        String[] blackPieces = flipped ? whites : blacks;
        for (int i=0; i<newChess.length; i++){
            for(int j=0;j<newChess[0].length; j++){
                if(i==0){
                    newChess[i][j]=blackPieces[j];
                }
                else if(i==1){
                    newChess[i][j]= flipped ? "♙":"♟";
                }
                else if(i==6){
                    newChess[i][j]=whitePieces[j];
                }
                else if(i==7){
                    newChess[i][j]= flipped ? "♟":"♙";
                }
                else{
                    newChess[i][j]=" ";
                }
            }
        }
        return new ChessBoard(newChess);
    }
    public String toString(){
        String str="";
        for(int i=0;i<chessBoard.length;i++){
            str+="";
            for(int j=0;j<chessBoard[i].length;j++){
                if((i+j)%2==0){
                    str+= color1+" "+chessBoard[i][j]+ " "+ConsoleColors.RESET;
                }
                else{
                    str+= color2+" "+chessBoard[i][j]+ " "+ConsoleColors.RESET;
                }
                if (j<chessBoard[0].length-1){
                    str+="";
                } 
            }
            str+="\n";
        }
        return str;
    }
    public static void main(String[] args){
        ChessBoard obj = new ChessBoard();
        System.out.println(obj.chooseChessBoard());

    }
}
