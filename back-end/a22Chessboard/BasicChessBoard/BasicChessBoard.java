package a22Chessboard.BasicChessBoard;

public class BasicChessBoard{
    static final int dimension = 8;
    String[][] chessBoard = new String[dimension][dimension];
    public BasicChessBoard(){
        chessBoard = new String[dimension][dimension]; 
    }
    public BasicChessBoard(String[][] val){
        chessBoard = val;
    }
    public BasicChessBoard positions(){
        String[][] newChess = new String[dimension][dimension];
        newChess[0][0]="♖";
        newChess[0][1]="♘";
        newChess[0][2]="♗";
        newChess[0][3]="♔";
        newChess[0][4]="♕";
        newChess[0][5]="♗";
        newChess[0][6]="♘";
        newChess[0][7]="♖";

        for(int j=0;j<newChess[0].length;j++){
            newChess[1][j]="♙";
        }
        for(int i=2;i<newChess.length-2;i++){
            for(int j=0;j<newChess.length;j++){
                newChess[i][j]="-";
            }
        }
        for(int j=0;j<newChess[0].length;j++){
            newChess[6][j]="♟";
        }
        newChess[7][0]="♜";
        newChess[7][1]="♞";
        newChess[7][2]="♝";
        newChess[7][3]="♚";
        newChess[7][4]="♛";
        newChess[7][5]="♝";
        newChess[7][6]="♞";
        newChess[7][7]="♜";
        return new BasicChessBoard(newChess);
    }
    public String toString(){
        String str="";
        for(int i=0;i<chessBoard.length;i++){
            str+="";
            for(int j=0;j<chessBoard[i].length;j++){
                if((i+j)%2==0){
                    str+= ConsoleColors.BLACK_BACKGROUND+" "+chessBoard[i][j]+ " "+ConsoleColors.RESET;
                }
                else{
                    str+= ConsoleColors.WHITE_BACKGROUND+" "+chessBoard[i][j]+ " "+ConsoleColors.RESET;
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
        BasicChessBoard obj = new BasicChessBoard();
        BasicChessBoard board = obj.positions();
        System.out.println(board);
    }
}
