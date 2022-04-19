package case_study_module2.service.impl;

import case_study_module2.model.Facility;
import case_study_module2.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private  static Map<Facility,Integer> facilityIntegerMap=new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

    }

    @Override
    public void displayMaintain() {

//
//        String idFacility,
//        String nameService,
//        double areaUse,
//        int rentalPrice,
//        int rentalPeopleMax,
//        String styleRental,
//        String standardVilla,
//        double areaPool,
//        int floor
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
        String rentalPrice = scanner.nextLine();


        System.out.println("nhập số lượng người cho thuê tối đa ");
        String rentalPeopleMax = scanner.nextLine();

        System.out.println("nhập loại phòng cho thuê ");
        String email = scanner.nextLine();


    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
