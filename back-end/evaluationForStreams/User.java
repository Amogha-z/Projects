package evaluationForStreams;


import java.util.Scanner;

public class User {
    DBStorage DBobject = new DBStorage();
    FileStorage fileObject = new FileStorage();
    private Scanner scanner;
    private String data;

    public User(){
        
    }

    public void choose(){
        scanner = new Scanner(System.in);
        System.out.println("Hello user, do you want to write data into the file 'data.txt' or to the database or in both? ");
        System.out.println("type 1 for file, 2 for database and 3 for both.");
        System.out.println("if you want to delete from database choose 4. To delete from the file choose 5");
        System.out.println("to read the file, choose 6. to get data from database choose 7.");
        System.out.println();
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                System.out.println("Write your data: ");
                data = scanner.nextLine();
                if(data!=""){
                    fileObject.writeIntoFile(data);
                    System.out.println("data added to file"+"\n");
                }else{
                    System.out.println("data cant be empty");
                }
                break;
            case 2:
                System.out.println("Write your data: ");
                data = scanner.nextLine();
                if(data!=""){
                    DBobject.insertIntoTable(data);
                System.out.println("data added to database."+"\n");
                }else{
                    System.out.println("data cant be empty");
                }
                break;
            case 3:
                System.out.println("Write your data: ");
                data = scanner.nextLine();
                if(data!=""){
                    fileObject.writeIntoFile(data);
                    DBobject.insertIntoTable(data);
                    System.out.println("data added to both."+"\n");
                }else{
                    System.out.println("data cant be empty");
                }
                break;
            case 4:
                System.out.println("what is your data: ");
                data = scanner.nextLine();
                if(data!=""){
                    DBobject.deleteFromTable(data);
                }else{
                    System.out.println("data cant be empty");
                }break;
            case 5:
                System.out.println("what is your data: ");
                data = scanner.nextLine();
                if(data!=""){
                    fileObject.deleteFromFile(data);
                }else{
                    System.out.println("data cant be empty");
                }break;
            case 6:
                fileObject.readFromFile();
                break;
            case 7:
                DBobject.readData();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {

        DBStorage obj = new DBStorage();
        obj.createTable();
        Scanner scan = new Scanner(System.in);
        String action;

        while (true) {
            System.out.print("Enter your action (type 'work' to work, 'enough' to exit): ");
            action = scan.nextLine();

            if ("enough".equalsIgnoreCase(action)) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            if ("work".equalsIgnoreCase(action)){
                User object = new User();
                object.choose();
            }else{
                System.out.println("not valid");
            }
        }
    }
}
