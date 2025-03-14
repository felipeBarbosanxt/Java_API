package com.api.rest_demo.controller;

import com.api.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService 
{

    CloudVendor cloudVendor; 

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){; 
        return cloudVendor; 

        // new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor Deleated Successfully";
    }
}
