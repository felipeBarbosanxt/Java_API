package com.api.rest_demo.controller;

import com.api.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService 
{
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
    }
}
