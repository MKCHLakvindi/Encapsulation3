public class Car {
    private String Car_Number;
    private String model_name;
    private String Chasis_Number;
    private double Mileage;

    public Car(String carNumber, String modelName, String chasisNumber, double mileage) {
        this.Car_Number = carNumber;
        this.model_name = modelName;
        this.Chasis_Number = chasisNumber;
        this.Mileage = mileage;
    }
    public String getCarNumber() {
        return Car_Number;
    }
    public String getModelName() {
        return model_name;
    }
    public String getChasisNumber() {
        return Chasis_Number;
    }
    public double getMileage() {
        return Mileage;
    }
    public void setCarNumber(String carNumber) {
        this.Car_Number = carNumber;
    }
    public void setModelName(String modelName) {
        this.model_name = modelName;
    }

    public void setChasisNumber(String chasisNumber) {
        this.Chasis_Number = chasisNumber;
    }

    public void displayCarInfo() {
        System.out.println("Car Number: " + Car_Number);
        System.out.println("Model Name: " + model_name);
        System.out.println("Chasis Number: " + Chasis_Number);
        System.out.println("Mileage: " + Mileage);
    }

    public static void main(String[] args) {

        Car car = new Car("ABC123", "Sedan", "123456789", 30.5);

        System.out.println("Initial Car Information:");
        car.displayCarInfo();

        car.setCarNumber("XYZ789");
        car.setModelName("SUV");
        car.setChasisNumber("987654321");

        System.out.println("\nUpdated Car Information:");
        car.displayCarInfo();

        System.out.println("\nMileage: " + car.getMileage());
    }
}

