package sda.javaadvanced.basic.carRepairShopNew;

import java.math.BigDecimal;

public class ServicePerformed {
    private BigDecimal price;
    private ServiceList service;

    public ServicePerformed(double price, ServiceList service) {
        this.price = BigDecimal.valueOf(price);
        this.service = service;
    }

    public double getPrice() {
        return price.doubleValue();
    }

    public ServiceList getService() {
        return service;
    }

    @Override
    public String toString() {
        return "Service Performed{" +
                "Service = " + service.getPlName() +
                 " at price = " + price +
        '}';
    }
}
