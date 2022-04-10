package sda.javaadvanced.basic.carRepairShopNew;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WorkshopRecorsd {
    private List<ClientNew> clients = new ArrayList<ClientNew>();
    private List<ServicePerformed> servicePerformedList = new ArrayList<>();

    public List<ClientNew> getClients() {
        return clients;
    }

    public List<ServicePerformed> getServicePerformedList() {
        return servicePerformedList;
    }
    public boolean addingClientToWr(ClientNew client) {
        return clients.add(client);
    }
    public boolean addingServiceToWr(ServicePerformed servicePerformed) {
        return servicePerformedList.add(servicePerformed);
    }
    public  void customersRecors(){
        System.out.println("Customer records:");
        clients.stream()
                .forEach(System.out::println);
    }
    public void serviceRecors(){
        System.out.println("Service records:");
        servicePerformedList.stream()
                .forEach(System.out::println);
    }

    public void specificServiceRecord(ServiceList service ){
        System.out.println("Specyfic records");
        int size = servicePerformedList.stream()
                .filter(servicePerformed -> service.equals(servicePerformed.getService()))
                .collect(Collectors.toList())
                .size();
        double price = servicePerformedList.stream()
                .filter(servicePerformed -> service.equals(servicePerformed.getService()))
                .map(servicePerformed-> servicePerformed.getPrice())
                .reduce(0.0,(price1, price2)-> price1 + price2);
        String finalPrice;
        if (size == 0){
            finalPrice = new StringBuilder("Service: ").append(service.getPlName())
                    .append("\nService has not yet been performed")
                    .toString();
        } else if(size==1){
            finalPrice = new StringBuilder("Service: ").append(service.getPlName())
                    .append("\nDone ").append(size).append(" time,")
                    .append("\nMoney earned: ").append(price)
                    .toString();

        }else {
            finalPrice = new StringBuilder("Service: ").append(service.getPlName())
                    .append("\nDone ").append(size).append(" times,")
                    .append("\nMoney earned: ").append(price)
                    .toString();
        }

        System.out.println(finalPrice);
    }
    public String clientRecords(ClientNew client){
        int howManyCars = client.getCarsList().size();
        String name = client.getName();
        String surname = client.getSurname();
        String howManyCarsClientServiced;
        if(howManyCars==1){
            howManyCarsClientServiced = new StringBuilder("Client:\n").append(name).append(" ").append(surname)
                    .append("\n").append(howManyCars).append(" car has been serviced.").toString();
        }else {
            howManyCarsClientServiced = new StringBuilder("Client:\n").append(name).append(" ").append(surname)
                    .append("\n").append(howManyCars).append(" cars were serviced.").toString();
        }
        return howManyCarsClientServiced;
    }
}
