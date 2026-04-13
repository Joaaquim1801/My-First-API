package com.firstAPI.spring_boot;

import org.springframework.stereotype.Service;

import java.util.List;

// This class will handle everything that has to do with Business Logic
@Service //This annotation make this class available as a bean( Spring instantiates it and make available to use within other classes )
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getSoftwaresEngineers(){
        //DTO -> data transfer object
        //return softwareEngineerRepository.findAll().stream().map();
        return softwareEngineerRepository.findAll();
    }
}
