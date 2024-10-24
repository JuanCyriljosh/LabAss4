public class HouseKeeping implements HotelService {

    private int roomNumber;

    public HouseKeeping(int roomNumber) {

        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {

        System.out.println("Room cleaning on: " + roomNumber);
    }

    @Override
    public void doThis() {

        cleanRoom();
    }
}