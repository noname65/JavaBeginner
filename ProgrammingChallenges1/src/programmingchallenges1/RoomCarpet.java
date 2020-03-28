package programmingchallenges1;
/**
 * @author noname
 */
class RoomCarpet {

    RoomCarpet(RoomDimension a, double b) {
        size = a;
        cost = b;
    }

    double getTotalCost() {
        return size.getArea() * cost;
    }

    @Override
    public String toString() {
        return "[cost=" + cost + ",size=" + size + "]";
    }
    private final RoomDimension size;
    private final double cost;
}
