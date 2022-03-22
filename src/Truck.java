import javax.swing.*;

public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;

  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate()
  {
    if (hasTrailer)
    {
      return (getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX") && axles > 4) || (getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX") && axles <= 4);
    }
    else
    {
      return true;
    }
  }

  @Override
  public double calculateTollPrice()
  {
    if (hasTrailer)
    {
      return (getTollFee() * axles) * 2;
    }
    else
    {
      return getTollFee() * axles;
    }
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Number of axles: " + axles);
    System.out.println("Has trailer? " + hasTrailer);
  }
}
