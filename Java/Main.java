class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        System.out.println("Car licence: " + car.license);
    }
}