package case_study_module2.model;

public class Room extends Facility {
    private String typeOfRoom ;

    public Room() {
    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax,
                String styleRental, String typeOfRoom) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.typeOfRoom = typeOfRoom;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "typeOfRoom='" + typeOfRoom + '\'' +
                '}';
    }
}
