public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int amountTickets = 2000;
        int bonus = service.calculate(amountTickets);
        System.out.println("Your bonus is: " + bonus + " miles");
    }
}

