import java.util.*;

public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    // public UberVan(String license, Account driver, Map<String, Map<String,
    // Integer>> typeCarAccepted,
    // ArrayList<String> seatsMaterial) {
    // super(license, driver);
    // this.typeCarAccepted = typeCarAccepted;
    // this.seatsMaterial = seatsMaterial;
    // }

    public UberVan(String licence, Account driver) {
        super(licence, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}