package org.lisy.spring.person.entity;

import java.util.Date;

public class Address extends Person {
    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", code=" + code +
                '}';
    }

    private String address1;
    private int code;
    public Address(String address1, int code) {
        this.address1 = address1;
        this.code = code;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }




    public Address() {
    }




}
