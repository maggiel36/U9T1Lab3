public class VehicleTests
{
  public static void main(String[] args)
  {
    // -------------- LAB PART 1 -----------------
    // a. write code to create a Vehicle object with license "MC56WQ",
    //    toll fee of 10.75, and 5 passengers.
    //    Print out the calculated toll TollPrice.
    Vehicle vehicle = new Vehicle("MC56WQ", 10.75, 5);
    System.out.println(vehicle.calculateTollPrice());

    // b. write code to create an electric Car with license "KXN73F",
    //    toll fee of 8.50, and 2 passengers.
    //    Print out the calculated toll price
    Car car = new Car("KXN73F", 8.50, 2, true);
    System.out.println(car.calculateTollPrice());

    // c. add a printCar() void method to the Car class that prints the
    //    Car's license plate, toll fee, number of passengers, whether it is electric,
    //    and whether a discount has been applied.
    //    Add getter methods as necessary to the Vehicle superclass.
    //
    // d. call the method on the Car you made in b to test it.

    // e. write code to create a Truck with license "3K9JMX",
    //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
    //    Print out the calculated toll price
    Truck truck = new Truck("3K9JMX", 24.75, 4, 6, true);
    System.out.println(truck.calculateTollPrice());

    // f. add a printTruck() void method to the Truck class that prints the
    //    Truck's license plate, toll fee, number of passengers, number of axles,
    //    and whether it has a trailer.
    //    Add getter methods as necessary to the Vehicle superclass.
    //
    // g. call the method on the Truck you made in e to test it.

    // ------------ LAB PART 2 ---------------
    // ----- instructions in lab sheet -------
    Taxi taxi = new Taxi("8KM23Z", 9.25, 3, true, 5);

    // ------------ LAB PART 3 ---------------
    // ----- instructions in lab sheet -------
    System.out.println(taxi.isDiscountApplied());
    System.out.println(taxi.calculateTollPrice());
    System.out.println(taxi.getLicensePlate());
    System.out.println(taxi.getPassengers());
    System.out.println(taxi.getTollFee());
    System.out.println(taxi.isElectric());

    System.out.println(taxi instanceof Taxi);
    System.out.println(taxi instanceof Vehicle);
    System.out.println(taxi instanceof Car);

    System.out.println("--- Testing method on Truck objects ---");
    Truck testTruck1 = new Truck("7645MX", 10.50, 3, 7, true);
    boolean validLicensePlate = testTruck1.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck2 = new Truck("7645PX", 10.50, 3, 7, true);
    validLicensePlate = testTruck2.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck3 = new Truck("7645LX", 10.50, 3, 4, true);
    validLicensePlate = testTruck3.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck4 = new Truck("7645L9", 10.50, 3, 4, true);
    validLicensePlate = testTruck4.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck5 = new Truck("7645L9", 10.50, 3, 4, false);
    validLicensePlate = testTruck5.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck6 = new Truck("7645PX", 10.50, 3, 7, false);
    validLicensePlate = testTruck6.validateLicensePlate();
    System.out.println(validLicensePlate);

    Car myCar = new Car("MK4567", 10.0, 3, true);
    System.out.println(myCar.calculateTollPrice());

    Car myCar2 = new Car("FJ8731", 10.0, 6, true);
    System.out.println(myCar2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
    System.out.println(myVehicle.calculateTollPrice());

    Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
    System.out.println(myTruck.calculateTollPrice());

    Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
    System.out.println(myTruck2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
    System.out.println(myVehicle2.calculateTollPrice());

    Taxi taxi1 = new Taxi("NY8432", 10.0, 5, true, 6);
    System.out.println(taxi1.calculateTollPrice());

    Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
    System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

    // now let's drop off the 5 riders, charging 3.50 per rider
    boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
    System.out.println(success); // should be true
    System.out.println(myTaxi3.getPassengers()); // should now be 1
    System.out.println(myTaxi3.getFareCollected()); // should be 17.50

    Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
    myVehicle3.printInfo();

    Car myCar3 = new Car("MK4567", 6.75, 4, true);
    myCar3.printInfo();

    Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
    myTruck3.printInfo();

    Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
    myTaxi4.printInfo();
  }
}