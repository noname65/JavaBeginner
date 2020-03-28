package programmingchallenges1;

/**
 * @author noname
 */
public class PoliceOfficer {
    public PoliceOfficer(String name,String badge_number){
        this.name=name;
        this.badge_number=badge_number;
    }
    public ParkingTicket examine(ParkedCar a){
        return ParkingMeter.getTime(a)>0?new ParkingTicket(a,this):new ParkingTicket(a,this);
    }
    private final String name,badge_number;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the badge_number
     */
    public String getBadge_number() {
        return badge_number;
    }
}
