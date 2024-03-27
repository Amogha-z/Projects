package injava.AOPS21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class EmployeeOperations {

    ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
    
    public void addEmployee(String employeeName, int employeeAge, int employeeId, String employeeRole, String employeeTeam){
        for(Employee employee : listOfEmployees){
            if(employee.getEmployeeId() == employeeId){
                System.out.println("Employee with the ID "+employeeId+" already exists");
                return;
            }
        }
        listOfEmployees.add(new Employee(employeeName,employeeAge,employeeId,employeeRole,employeeTeam));
        System.out.println("details added for the new employee with ID "+employeeId);
    } 
    public void removeEmployee(int employeeId) {
        Iterator<Employee> iterator = listOfEmployees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmployeeId() == employeeId) {
                iterator.remove();
                System.out.println("Details of the employee with ID " + employeeId + " removed.");
                return;
            }
        }
        System.out.println("No employee found with the given ID " + employeeId);
    }
    public void updateEmployeeDetails(int employeeId, String updateValue, String whereTo){
        boolean found = false;
        for(Employee employee : listOfEmployees){
            if(employee.getEmployeeId()==employeeId){
                found=true;
                switch(whereTo.toLowerCase()){
                    case "name":
                        employee.setEmployeeName(updateValue);
                        System.out.println("Name changed.");
                        break;
                    case "age":
                        employee.setEmployeeAge(Integer.parseInt(updateValue));
                        System.out.println("Age changed.");
                        break;
                    case "id":
                        employee.setEmployeeId(Integer.parseInt(updateValue));
                        System.out.println("ID changed.");
                        break;
                    case "role":
                        employee.setEmployeeRole(updateValue);
                        System.out.println("Role details changed.");
                        break;
                    case "team":
                        employee.setEmployeeTeam(updateValue);
                        System.out.println("Team details changed.");
                        break;
                    default:
                        break;
                }break;
            }
        }
        if(!found){
            System.out.println("Employee details not found.");
        }
    }
    public void searchForEmployees(String basedOn){
        Scanner scanner = new Scanner(System.in);
        switch(basedOn.toLowerCase()){
            case "name":
                System.out.println("Enter thy Name: ");
                String name = scanner.nextLine();
                for(Employee employee : listOfEmployees){
                    try{
                        if (name.equals(employee.getEmployeeName())) {
                            System.out.println(employee);
                            return;
                        }
                    }catch(Exception e){
                        System.out.println("Enter Name as a String");
                    }
                }
                System.err.println("No such employee");
                break;
            case "id":
                System.out.println("Enter thy Id: ");
                int id = scanner.nextInt();
                for(Employee employee : listOfEmployees){
                    try{
                        if(id == employee.getEmployeeId()){
                            System.out.println(employee);
                            return;
                        }
                    }catch(Exception e){
                        System.out.println("Enter ID in Numeric form.");
                    }
                }
                System.err.println("No such employee");
                break;
            case "role":
                System.out.println("Enter thy Role: ");
                String role = scanner.nextLine();
                for(Employee employee : listOfEmployees){
                    try{
                        if (role.equals(employee.getEmployeeRole())) {
                            System.out.println(employee);
                            return;
                        }
                    }catch(Exception e){
                        System.out.println("Enter Role as a String");
                    }
                }
                System.err.println("No such employee");
                break; 
            case "team":
                System.out.println("Enter thy Team: ");
                String team = scanner.nextLine();
                for(Employee employee : listOfEmployees){
                    try{
                        if (team.equals(employee.getEmployeeTeam())) {
                            System.out.println(employee);
                            return;
                        }
                    }catch(Exception e){
                        System.out.println("Enter Team as a String");
                    }
                }
                System.err.println("No such employee");
                break;
            default:
                break;
        }
    }
    public void workingWithTheMethods(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("1.Add details of new employee\n2.Delete details of an employee\n3.Update some details of an employee\n4.Search for an employee\n5.View all.");
        System.out.println("type (add) for 1, (del) for 2, (upd) for 3, (sea) for 4, (view) for 5,(exit) to exit.");
        
        while(true){
            System.out.println("What do you wanna do?");
            String userChoice = userInput.nextLine();
            switch(userChoice.toLowerCase()){
                case "exit":
                    System.out.println("Thank You");
                    // System.out.println(listOfEmployees.toString());
                    System.exit(0);
                case "add":
                    System.out.println("Enter thy name: ");
                    String name = userInput.nextLine();
                    System.out.println("Enter thy age: ");
                    int age = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter thy id: ");
                    int id = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter thy role: ");
                    String role = userInput.nextLine();
                    System.out.println("Enter thy team: ");
                    String team = userInput.nextLine();
                    addEmployee(name, age, id, role, team);
                    // System.out.println(listOfEmployees.toString());
                    break;
                case "del":
                    System.out.println("Enter thy id: ");
                    int ID = Integer.parseInt(userInput.nextLine());
                    removeEmployee(ID);
                    // System.out.println(listOfEmployees.toString());
                    break;
                case "upd":
                    System.out.println("Enter thy id: ");
                    int iD = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter which detail has to be changed: ");
                    String place = userInput.nextLine();
                    System.out.println("Enter change of detail: ");
                    String value = userInput.nextLine();
                    updateEmployeeDetails(iD, value, place);
                    // System.out.println(listOfEmployees.toString());
                    break;
                case "sea":
                    System.out.println("Enter the criteria for the search: ");
                    String criteria = userInput.nextLine();
                    searchForEmployees(criteria);
                    // System.out.println(listOfEmployees.toString());
                    break;
                case "view":
                    if(listOfEmployees.isEmpty()){
                        System.out.println("Add details before printing. its empty.");
                    }
                    for(Employee employee : listOfEmployees){
                        System.out.println("Employee Details:");
                        System.out.println("Name: " + employee.getEmployeeName());
                        System.out.println("Age: " + employee.getEmployeeAge());
                        System.out.println("ID: " + employee.getEmployeeId());
                        System.out.println("Role: " + employee.getEmployeeRole());
                        System.out.println("Team: " + employee.getEmployeeTeam());
                        System.out.println("------------------------");
                    }
                    break;
                default:
                    System.out.println("Invalid.");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        EmployeeOperations object = new EmployeeOperations();
        object.workingWithTheMethods();
    }
}
