public class BonusMilesService {
    public int calculate(int amountTickets) {

        int milesProgram = 20;
        int bonus = amountTickets / milesProgram;

        return bonus;
    }
}
