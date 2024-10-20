public class TravellingService {
    public static void main(String args[]){
       Driver driver1 = new Driver ("R.k Umar",'M',34,"DR0201",12000.00);
        Driver driver2 = new Driver("K.L.umar",'M',34,"DR0303",15000.00);
        Driver driver3 = new Driver("J.R.I.Reshma",'F',28,"DR0906",13000.00);
        Driver driver4 = new Driver("P.M. Ha,lath",'M',40,"DR0823",17500.00);
        Driver driver5 = new Driver("T.hasiny",'F',33,"DR0789",12500);
        
        Driver [] driver ={driver1,driver2,driver3,driver4,driver5};

        Vehicle vehicle1= new Vehicle("VC 4505","red","car",4,driver1);
        Vehicle vehicle2= new Vehicle("VC45078","Yellow","car",58,driver4);
        Vehicle vehicle3= new Vehicle("VV3423","Blue","Van",18,driver1);
        



    }
}
