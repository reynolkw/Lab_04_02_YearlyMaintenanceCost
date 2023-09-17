public class Main
{
    public static void main(String[] args)
    {
        // simulating user input
        double winterCost = 400.00;
        double springCost = 300.00;
        double summerCost = 600.00;
        double fallCost = 300.00;

        double yearlyCost = 0.0;
        yearlyCost = winterCost + springCost + summerCost + fallCost;

        System.out.println("Winter cost: $" + winterCost);
        System.out.println("Spring cost: $" + springCost);
        System.out.println("Summer cost: $" + summerCost);
        System.out.println("Fall cost: $" + fallCost);
        System.out.println("The total yearly maintenance cost is $" + yearlyCost);
    }
}