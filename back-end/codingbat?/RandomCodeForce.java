import java.util.ArrayList;
import java.util.Scanner;

public class RandomCodeForce {
    public void findVariableX(){
        ArrayList<Integer> idiot = new ArrayList<>();
        ArrayList<Integer> idiot2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String operation;
        int n,m,l,r,x;
        int testCases = scanner.nextInt();
        for(int i=0; i<testCases; i++){
            n = scanner.nextInt();
            m = scanner.nextInt();
            scanner.nextLine();
            while(true){
                operation = scanner.nextLine(); 
                if(operation.length()==n){
                    break;
                }
            }
            for(int j=0; j<m; j++){
                l = scanner.nextInt();
                r = scanner.nextInt();
                if(l<=r && r<=operation.length()){
                    x=0;
                    idiot.clear();
                    idiot.add(x);
                    for(int indx=0; indx<operation.length(); indx++){
                        if(indx<l-1 || indx>r-1){
                            if (operation.charAt(indx)=='-'){
                                x--;
                            }
                            if(operation.charAt(indx)=='+'){
                                x++;
                            }
                        }     
                        if(!idiot.contains(x)){
                            idiot.add(x);
                        }
                    }
                    idiot2.add(idiot.size());
                }
            }
        }System.out.println(idiot2);
    }
    
    public static void main(String[] args) {
        RandomCodeForce obj = new RandomCodeForce();
        obj.findVariableX();
    }
}
