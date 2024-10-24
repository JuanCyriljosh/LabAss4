public class Valet implements HotelService {
    
    private String plateNumber;

    public Valet(String plateNumber) {

        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        
        System.out.println("Valet pick up and park vehicle with plate number: " + plateNumber);
    }

    @Override
    public void doThis() {

        pickUpVehicle();
    }
}