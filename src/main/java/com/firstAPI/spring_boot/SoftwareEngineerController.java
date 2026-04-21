package com.firstAPI.spring_boot;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping // Post request
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    } // @RequestBody map the JSON into a java class

    @GetMapping("{id}") // GET request
    public SoftwareEngineer getEngineersById(@PathVariable Integer id){
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @DeleteMapping("{id}")
    public void deleteEngineersById(@PathVariable Integer id){
        softwareEngineerService.deleteSoftwareEngineerByid(id);
    }

    @PutMapping("{id}")
    public void updateEngineerById(@PathVariable Integer id, @RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.updateSoftwareEngineerById(id,softwareEngineer);
    }

}
