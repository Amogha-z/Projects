import java.util.Scanner;

public class AdjacentBinaryZero {
    public void checker(int n){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            int binary = scanner.nextInt();
            int last = -1;
            while(binary>0){
                int current = binary%10;
                if(last == 0 && current == 0){
                    System.out.println("yes");
                    break;
                }
                binary = Math.floorDiv(binary,10);
                last = current;
                System.out.println("last: "+last+" current: "+current);
            }if(last != 0){
                    System.out.println("no");
                }
        }
    }
    public static void main(String[] args) {
        AdjacentBinaryZero object = new AdjacentBinaryZero();
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number of inputs: ");
        int range = scan.nextInt();
        object.checker(range);
    }
}
