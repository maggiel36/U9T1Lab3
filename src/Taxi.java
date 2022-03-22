public class Taxi extends Car
{
    private double totalFare;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double totalFare)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.totalFare = totalFare;
    }

    public double getFareCollected()
    {
        return totalFare;
    }

    public boolean chargeAndDropOffRiders(double farePerRider)
    {
        totalFare += (getPassengers() - 1) * farePerRider;
        return super.dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Total fare collected: " + totalFare);
    }
}
