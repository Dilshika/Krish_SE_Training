package com.dil.cafecloud.configconsumer.contoller;

import com.dil.cafecloud.configconsumer.model.CustomerProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CustomerProfileController {

    @Autowired
    CustomerProfileConfiguration customerProfileConfiguration;

    @RequestMapping("/profile")
    public String getConfig(Model model){
        model.addAttribute("type",customerProfileConfiguration.getCustomerType());
        model.addAttribute("discount",customerProfileConfiguration.getDiscountPrice());
        return "customerprofile";
    }
}
