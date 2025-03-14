package com.api.rest_demo.model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVendor(){}
    
    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber){
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    //Getters

    public String getVendorId(){
        return vendorId;
    }
    public String getVendorName(){
        return vendorName;
    }
    public String getVendorAdreess(){
        return vendorAddress;
    }
    public String getVendorPhoneNumber(){
        return vendorPhoneNumber;
    }

    //setters

    public void setVendorId(String vendorId){
        this.vendorId = vendorId;
    }

    public void setVendorName(String vendorName){
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress){
        this.vendorAddress = vendorAddress;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber){
        this.vendorPhoneNumber = vendorPhoneNumber;     
    }
}
