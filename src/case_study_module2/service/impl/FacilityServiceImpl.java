package case_study_module2.service.impl;

import case_study_module2.model.facility.Facility;
import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;
import case_study_module2.service.FacilityService;
import case_study_module2.service.regex.FacilityRegex;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService, Serializable {

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> data : facilityIntegerMap.entrySet()) {
            System.out.println("service" + data.getKey() + "số lần đã thuê" + data.getValue());
        }
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void addNewVilla() {
        System.out.println("nhập tên dịch vụ ");
        String name = FacilityRegex.name();

        System.out.println("nhập id :");
        String id = FacilityRegex.id();

        System.out.println("nhập diện tích sử dụng");
        double areaUse = FacilityRegex.areaUse();

        System.out.println("nhập diện tích hồ bơi");
        double areaPool = FacilityRegex.areaPool();

        System.out.println("nhập giá thuê");
        int price = FacilityRegex.price();

        System.out.println("nhập số lượng người tối đa");
        int rentalPeopleMax = FacilityRegex.rentalPeopleMax();

        System.out.println("nhập số tầng");
        int floor = FacilityRegex.floor();

        System.out.println("nhập kiểu thuê");
        String styleRental = FacilityRegex.styleRental();

        System.out.println("nhập phòng tiêu chuẩn");
        String standardVilla = FacilityRegex.standardVilla();

        Villa villa = new Villa(name, id, areaUse, price, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("đã thêm mới thành công");
    }


    @Override
    public void addNewHouse() {
        System.out.println("nhập tên dịch vụ ");
        String name = FacilityRegex.name();

        System.out.println("nhập id :");
        String id = FacilityRegex.id();

        System.out.println("nhập diện tích sử dụng");
        double areaUse = FacilityRegex.areaUse();

        System.out.println("nhập giá thuê");
        int price = FacilityRegex.price();

        System.out.println("nhập số lượng người tối đa");
        int rentalPeopleMax = FacilityRegex.rentalPeopleMax();

        System.out.println("nhập số tầng");
        int floor = FacilityRegex.floor();

        System.out.println("nhập kiểu thuê");
        String styleRental = FacilityRegex.styleRental();

        System.out.println("nhập phòng tiêu chuẩn");
        String standardVilla = FacilityRegex.standardVilla();

        House house = new House(name, id, areaUse, price, rentalPeopleMax, styleRental, standardVilla, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("đã thêm mới thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.println("nhập tên dịch vụ ");
        String name = FacilityRegex.name();

        System.out.println("nhập id :");
        String id = FacilityRegex.id();

        System.out.println("nhập diện tích sử dụng");
        double areaUse = FacilityRegex.areaUse();

        System.out.println("nhập giá thuê");
        int price = FacilityRegex.price();

        System.out.println("nhập số lượng người tối đa");
        int rentalPeopleMax = FacilityRegex.rentalPeopleMax();

        System.out.println("nhập kiểu thuê");
        String styleRental = FacilityRegex.styleRental();

        System.out.println("nhập phòng tiêu chuẩn");
        String standardVilla = FacilityRegex.standardVilla();

        System.out.println("nhập các dịch vụ miễn phí ");
        String freeService = FacilityRegex.freeService();

        Room room = new Room(name,id,areaUse,price,rentalPeopleMax,styleRental,freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("đã thêm mới thành công");
    }
}
