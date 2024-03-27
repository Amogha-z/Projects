package injava.AOPS21;

class Employee {

    private String employeeName;
    private int employeeId;
    private String employeeRole;
    private String employeeTeam;
    private int employeeAge;

    public Employee(String employeeName, int employeeAge, int employeeId, String employeeRole, String employeeTeam){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeRole = employeeRole;
        this.employeeTeam = employeeTeam;
        this.employeeAge = employeeAge;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    
    public String getEmployeeRole(){
        return employeeRole;
    }
    public void setEmployeeRole(String employeeRole){
        this.employeeRole = employeeRole;
    }
    
    public String getEmployeeTeam(){
        return employeeTeam;
    }
    public void setEmployeeTeam(String employeeTeam){
        this.employeeTeam = employeeTeam;
    }

    public int getEmployeeAge(){
        return employeeAge;
    }
    public void setEmployeeAge(int employeeAge){
        this.employeeAge = employeeAge;
    }
    public String toString(){
        String output = "Name: "+getEmployeeName() +", Age: "+getEmployeeAge() + ", ID: "+getEmployeeId()+ 
    ", Role: "+getEmployeeRole()+", Team: "+getEmployeeTeam();
        return output;  
    }
}
