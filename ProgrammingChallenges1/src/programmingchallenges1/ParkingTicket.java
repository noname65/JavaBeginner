package programmingchallenges1;

/**
 * @author noname
 */
public class ParkingTicket {

    ParkingTicket(ParkedCar a,PoliceOfficer b) {
        asd=a;
        dsa=b;
    }

    public void output() {
        System.out.println("make:"+asd.getMake()
                +"\nModel:"+asd.getModel()
                +"\nColor:"+asd.getColor()
                +"\nLicense number of the illegally parked car:"+asd.getLicense_number()
                +"\nFines:"+(ParkingMeter.getTime(asd)<60?25:ParkingMeter.getTime(asd)/6+15)
                +"\nPolice officer's name:"+dsa.getName()
                +"\nPolice officer's badge number:"+dsa.getBadge_number());
    }
    private volatile ParkedCar asd;
    private volatile PoliceOfficer dsa;
}
