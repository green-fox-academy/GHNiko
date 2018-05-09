public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstackles");

        Thing standUp = new Thing("Stand up!");
        standUp.complete();
        Thing eat = new Thing("Eat lunch");
        eat.complete();

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(standUp);
        fleet.add(eat);

        System.out.println(fleet);
    }
}
