package com.firstAPI.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Anything that accepts request from the clients or exposes rest endpoints it's a controller
@RestController
@RequestMapping("api/v1/software-engineers") // <- This creates the endpoint
public class SoftwareEngineerController {
    private SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping // GET request
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getSoftwaresEngineers();
    }

}
