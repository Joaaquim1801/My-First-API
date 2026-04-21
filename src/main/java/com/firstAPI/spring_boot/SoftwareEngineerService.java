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
    // no futuro tem que fazer verificações e um DAO
    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer){
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id){
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id+" not found"));
    }

    public void deleteSoftwareEngineerByid(Integer id){
        softwareEngineerRepository.deleteById(id);
    }

    public void updateSoftwareEngineerById(Integer id,SoftwareEngineer NewSoftwareEngineer){
        SoftwareEngineer engineer = getSoftwareEngineerById(id);

        engineer.setName(NewSoftwareEngineer.getName());
        engineer.setTechStack(NewSoftwareEngineer.getTechStack());

        softwareEngineerRepository.save(engineer);
    }
}
