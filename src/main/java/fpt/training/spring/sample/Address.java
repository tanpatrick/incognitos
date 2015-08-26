package fpt.training.spring.sample;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String address;
    private String zipCode;

    public Address() {
        System.out.println(" ... init address");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
