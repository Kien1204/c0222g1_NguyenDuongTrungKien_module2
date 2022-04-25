package case_study_module2.service.impl;

import case_study_module2.model.Facility;
import case_study_module2.model.House;
import case_study_module2.model.Room;
import case_study_module2.model.Villa;
import case_study_module2.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> data : facilityIntegerMap.entrySet()){
            System.out.println("service"+data.getKey()+ "số lần đã thuê" + data.getValue());
        }
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void addNewVilla() {
        System.out.println("nhập id Facility ");
        String id = scanner.nextLine();

        System.out.println("nhập tên dịch vụ ");
        String nameService = scanner.nextLine();

        System.out.println("nhập diện tích  ");
        double areaUse = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập giá cho thuê ");
        int price = Integer.parseInt(scanner.nextLine());


        System.out.println("nhập số lượng người cho thuê tối đa ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập loại phòng cho thuê ");
        String style = scanner.nextLine();

        System.out.println("nhập villa  tiêu chuẩn :");
        String standardVilla = scanner.nextLine();

        System.out.println("nhập diện tích hồ bơi ");
        double areaPool = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập số tầng ");
        int floor = scanner.nextInt();
        Villa villa = new Villa(id, nameService, areaUse, price, rentalPeopleMax, style, standardVilla, areaUse, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("đã thêm mới thành công");
    }


    @Override
    public void addNewHouse() {
        System.out.println("nhập id Facility ");
        String id = scanner.nextLine();

        System.out.println("nhập tên dịch vụ ");
        String nameService = scanner.nextLine();

        System.out.println("nhập diện tích  ");
        double areaUse = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập giá cho thuê ");
        int price = Integer.parseInt(scanner.nextLine());


        System.out.println("nhập số lượng người cho thuê tối đa ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập loại phòng cho thuê ");
        String style = scanner.nextLine();

        System.out.println("nhập villa  tiêu chuẩn :");
        String standardVilla = scanner.nextLine();

        System.out.println("nhập diện tích hồ bơi ");
        double areaPool = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập số tầng ");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(id, nameService, areaUse, price, rentalPeopleMax, style, standardVilla, areaUse, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("đã thêm mới thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.println("nhập id Facility ");
        String id = scanner.nextLine();

        System.out.println("nhập tên dịch vụ ");
        String nameService = scanner.nextLine();

        System.out.println("nhập diện tích  ");
        double areaUse = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập giá cho thuê ");
        int price = Integer.parseInt(scanner.nextLine());


        System.out.println("nhập số lượng người cho thuê tối đa ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập cỡ phòng cho thuê ");
        String style = scanner.nextLine();

        System.out.println("nhập room  tiêu chuẩn :");
        String standardVilla = scanner.nextLine();

        System.out.println("nhập lại phòng cho  thuê");
        String styleRoom = scanner.nextLine();
        Room room = new Room(id,nameService,areaUse,price,rentalPeopleMax,style,styleRoom);
        facilityIntegerMap.put(room, 0);
        System.out.println("đã thêm mới thành công");
    }
}
