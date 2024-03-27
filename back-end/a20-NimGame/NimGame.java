import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class NimGame{
    private String user1;
    private int[] game;
    public NimGame(){
        this.user1 = "Maha";
        this.game = new int[]{5,10,15,20,25,30,35,40,45,50};
    }
    public NimGame(String name,int[] arr){
        user1=name;
        game=arr;
    }
    public NimGame inputGet(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player's name: ");
        String user1 = scan.nextLine();
        int gamelen = (int)(Math.random()*25);
        int[] game = new int[gamelen];
        return new NimGame(user1,game);
    }
    public NimGame remover(int n){
        int newLength = Math.max(0, game.length - n);
        game = new int[newLength];
        return new NimGame(user1, game);
    }    
    public int values(){
        int min=1;
        int max=2;
        int ran = new Random().nextInt((max-min) + 1) + min;
        return ran;
    }
    public void display(){
        String res="";
        if (game!=null && game.length>0){
            res="[";
            for (int i=0; i<game.length; i++){
                if(i!=game.length-1){
                    res=res+game[i]+ ", ";
                }
                else {
                    res = res + game[i] + "]";
                }
            }
        }
        System.out.println(res);
    }
    public void mainPlay(){
        Scanner newscan = new Scanner(System.in);
        NimGame ano = inputGet();
        System.out.println();
        NimGame nrem;
        display();
        System.out.println();
        int v=0;
        while(game.length!=0){
            try{
                System.out.print("Player: enter 1 or 2: ");
                v = newscan.nextInt();
            }
            catch(InputMismatchException e){
                newscan.nextLine();
                System.out.println("give only 1 or 2!");
                continue;
            }
            if (v != 1 && v != 2) {
                System.out.print("Invalid input. Enter 1 or 2.");
                // continue;
            }
            if(game.length==1 && v==2){
                nrem=remover(1);
            }
            System.out.println();
            nrem=remover(v);
            // display();
            // System.out.println();
            if (game.length==0){
                System.out.println(user1+" wins.");
                break;
            }
            int compnum = values();
            System.out.println("Computer's turn: " + compnum);
            System.out.println();
            if(game.length==1 && v==2){
                nrem=remover(1);
            }
            nrem=remover(compnum);
            // display();
            // System.out.println();
            if (game.length==0){
                System.out.println("Computer wins.");
                break;
            }
        }
    }
    public static void main(String[] args){
        NimGame obj = new NimGame();
        obj.mainPlay();
    }
}