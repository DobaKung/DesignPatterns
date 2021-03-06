package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage homeBrew = new HomeBrew();
        homeBrew = new Whip(homeBrew);
        homeBrew = new Cinnamon(homeBrew);
        System.out.print(homeBrew.getDescription() + " costs ");
        System.out.println(homeBrew.getCost());

        Beverage espresso = new Espresso();
        espresso = new Whip(espresso);
        System.out.print(espresso.getDescription() + " costs ");
        System.out.println(espresso.getCost());
    }
}
