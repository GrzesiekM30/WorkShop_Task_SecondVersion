package sda.javaadvanced.basic.carRepairShopNew;


import static sda.javaadvanced.basic.carRepairShopNew.ServiceList.*;

public class MainNew {
    public static void main(String[] args) {
        WorkshopRecorsd workshopRecorsd = new WorkshopRecorsd();
        ClientNew kowalskiJan = new ClientNew("Jan","Kowalski");
        ClientCar kowalskiFirstCar = new ClientCar("Ford",1.5,1999);
        ClientCar kowalskiSecondCar = new ClientCar("Skoda",1.6,1998);

        ServicePerformed service1ForKowalski = new ServicePerformed(55, BATTERY_REPLACENT);
        ServicePerformed service2ForKowalski = new ServicePerformed(40, OIL_CHANGE);
        ServicePerformed service3ForKowalski = new ServicePerformed(30, ENGINE_CHECK);

        kowalskiJan.addingCar(kowalskiFirstCar);
        kowalskiJan.addingCar(kowalskiSecondCar);

        kowalskiJan.addingService(service1ForKowalski);
        kowalskiJan.addingService(service2ForKowalski);
        kowalskiJan.addingService(service3ForKowalski);

        workshopRecorsd.addingClientToWr(kowalskiJan);
        workshopRecorsd.addingServiceToWr(service1ForKowalski);
        workshopRecorsd.addingServiceToWr(service2ForKowalski);
        workshopRecorsd.addingServiceToWr(service3ForKowalski);

        ClientNew wisniewskiMichal = new ClientNew("Michał","Wiśniewski");
        ClientCar wisniewskiFirstCar = new ClientCar("Porshe",2.2,2018);
        ClientCar wisniewskiSecondCar = new ClientCar("Mustang",3.0,2022);
        ClientCar wisniewskiThirdCar = new ClientCar("Lamborgini",2.8,2020);
        wisniewskiMichal.addingCar(wisniewskiFirstCar);
        wisniewskiMichal.addingCar(wisniewskiSecondCar);
        wisniewskiMichal.addingCar(wisniewskiThirdCar);

        ServicePerformed service1ForWisniewski = new ServicePerformed(150, BREAK_DISC_REPLACMENT);
        ServicePerformed service2ForWisniewski = new ServicePerformed(200, OIL_CHANGE);
        ServicePerformed service3ForWisniewski = new ServicePerformed(70, REPLACMENT_OF_BREAK_PADS);
        ServicePerformed service4ForWisniewski = new ServicePerformed(90, ENGINE_CHECK);
        ServicePerformed service5ForWisniewski = new ServicePerformed(300, BREAK_DISC_REPLACMENT);
        ServicePerformed service6ForWisniewski = new ServicePerformed(100, ENGINE_CHECK);

        wisniewskiMichal.addingService(service1ForWisniewski);
        wisniewskiMichal.addingService(service2ForWisniewski);
        wisniewskiMichal.addingService(service3ForWisniewski);
        wisniewskiMichal.addingService(service4ForWisniewski);
        wisniewskiMichal.addingService(service5ForWisniewski);
        wisniewskiMichal.addingService(service6ForWisniewski);

        workshopRecorsd.addingClientToWr(wisniewskiMichal);
        workshopRecorsd.addingServiceToWr(service1ForWisniewski);
        workshopRecorsd.addingServiceToWr(service2ForWisniewski);
        workshopRecorsd.addingServiceToWr(service3ForWisniewski);
        workshopRecorsd.addingServiceToWr(service4ForWisniewski);
        workshopRecorsd.addingServiceToWr(service5ForWisniewski);
        workshopRecorsd.addingServiceToWr(service6ForWisniewski);



        System.out.println("++++++++++");
        kowalskiJan.showCarList();
        System.out.println("++++++++++");
        kowalskiJan.showServisList();
        System.out.println("++++++++++");
        workshopRecorsd.customersRecors();
        System.out.println("++++++++++");
        workshopRecorsd.serviceRecors();
        System.out.println("++++++++++");
        workshopRecorsd.specificServiceRecord(BATTERY_REPLACENT);
        workshopRecorsd.specificServiceRecord(OIL_CHANGE);
        System.out.println("++++++++++");
        System.out.println(workshopRecorsd.clientRecords(kowalskiJan));
        System.out.println("++++++++++");
        System.out.println(kowalskiJan.clientExpenses());
        System.out.println("++++++++++");
        System.out.println(workshopRecorsd.clientRecords(wisniewskiMichal));
        System.out.println("++++++++++");
        System.out.println(wisniewskiMichal.clientExpenses());


    }


}
