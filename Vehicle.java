public class Vehicle {
    private String vehicleId;
    private String color;
    private String type;
    private int noOfSeats;
    Driver driver;

Vehicle(String vehcleId,String color,String type,int noOfSeats,Driver driver){
    this.vehicleId=vehcleId;
    this.color=color;
    this.type=type;
    this.noOfSeats=noOfSeats;       
    this.driver=driver;
}
 public String getVehicleId(){
    return vehicleId;
 }
 public String getColor(){
    return color;
 }
 public String getType(){
    return type;
 }
 public int noOfSeats(){
    return noOfSeats;
 }
 public Driver getDriver(){
    return driver;
 }
 public void setColor(String color){
    this.color=color;
 }
 public void setnoOFSeats(int noOfSeats){
this.noOfSeats=noOfSeats;
 }

 public void vehicleDetails(){
    System.out.println(vehicleId);
    System.out.println(color);
    System.out.println(type);
    System.out.println(noOfSeats);
    driver.driverDetails();
 }
}
