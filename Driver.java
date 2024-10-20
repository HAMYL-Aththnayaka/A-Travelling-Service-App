public class Driver extends Person{
    private String driverID;
    private double salary;
    
Driver(String name,char sex,int age,String driverID,double salary){
super(name,sex,age);
this.driverID=driverID;
this.salary=salary;
}
 public double getSalary(){
    return salary;
 }
 public String getDriverID(){
    return driverID;
 }

 public void setSalary(double salary){
    this.salary=salary;
 }

 public void driverDetails(){
 System.out.println("name : "+getName());
 System.out.println("sex : "+getSex());
 System.out.println("age : "+getAge());
 System.out.println("salary : "+salary);
 System.out.println("DriverID : "+driverID);
 }
}
    

