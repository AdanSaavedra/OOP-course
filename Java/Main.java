class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        UberX uberx = new UberX("AMQ123", new Account(null, "Andres Herrera", "AWE232", null, null), "Chevrolet",
                "Picanto");
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan uberVan = new UberVan("FGH234", new Account(null, "Andres Herrera", "AWE232", null, null));
        uberVan.setPassenger(3);
        uberVan.printDataCar();

        // Car car2 = new Car("QWE567", new Account(null, "Adan Saavedra", "a542as",
        // null, null));
        // car2.passenger = 3;
        // car2.printDataCar();
    }
}