package com.csi.model;

public class Customer {

    private long custAccNo;
    private String custPassword;

    public Customer(long custAccNo, String custPassword) {
        this.custAccNo = custAccNo;
        this.custPassword = custPassword;
    }

    public long getCustAccNo() {
        return custAccNo;
    }

    public void setCustAccNo(long custAccNo) {
        this.custAccNo = custAccNo;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setPassword(String custPassword) {
        this.custPassword = custPassword;
    }
}
