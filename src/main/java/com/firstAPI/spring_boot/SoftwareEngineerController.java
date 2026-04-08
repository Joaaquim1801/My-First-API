package com.firstAPI.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Anything that accepts request from the clients or exposes rest endpoints it's a controller
@RestController
@RequestMapping("api/v1/software-engineers") // <- This creates the endpoint
public class SoftwareEngineerController {

    @GetMapping // GET request
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        List.of("Js","node","React", "Tailwindcss")
                ),
                new SoftwareEngineer(
                        1,
                        "Jamila",
                        List.of("Java", "Springboot", "Spring")
                )
        );
    }

}
