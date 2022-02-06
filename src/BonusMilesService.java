public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusAmount = 20;
        int miles = ticketPrice / bonusAmount;
        return miles;
    }
}