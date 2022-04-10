package sda.javaadvanced.basic.carRepairShopNew;

import java.util.ArrayList;
import java.util.List;

public class ClientNew {
    private String name;
    private String surname;
    private List<ClientCar> carsList;
    private List<ServicePerformed> serviceList;


    public ClientNew(String name, String surname) {
        this.name = name;
        this.surname = surname;
        carsList = new ArrayList<>();
        serviceList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<ClientCar> getCarsList() {
        return carsList;
    }

    public List<ServicePerformed> getServiceList() {
        return serviceList;
    }

    @Override
    public String toString() {
        String cars = carsList.toString();
        return  new StringBuilder("Client ")
                .append("name= " ).append(name)
                .append(", surname= " ).append(surname)
                .append(", cars=").append(cars).toString();

    }


    public boolean addingCar(ClientCar car) {
        return carsList.add(car);
    }

    public boolean addingService(ServicePerformed servicePerformed) {
        return serviceList.add(servicePerformed);
    }

    public void showCarList(){
        System.out.println(surname + " cars list:");
        carsList.stream()
                .forEach(System.out::println);
    }
    public void showServisList(){
        System.out.println(surname + " service list:");
        serviceList.stream()
                .forEach(System.out::println);
    }
    public  String clientExpenses(){
        double expenses = getServiceList().stream()
                .map(servicePerformed -> servicePerformed.getPrice())
                .reduce(0.0,(price1, price2)-> price1 + price2);

        return new StringBuilder("Client ").append(name).append(" ").append(surname)
                .append(" spend ").append(expenses).append(" $ at the repair shop.").toString();

    }

}
