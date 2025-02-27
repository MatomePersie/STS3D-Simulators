package com.CodeWithMatome.STS3D.Simulators.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CodeWithMatome.STS3D.Simulators.Model.Simulators;
import com.CodeWithMatome.STS3D.Simulators.Repository.SimulatorRepository;

@RestController
@CrossOrigin
public class SimulatorsController {

    @Autowired
    private SimulatorRepository simRepo;
    

    @PostMapping("/PostSim")
    Simulators newSimulators(@RequestBody Simulators newSimulators){

        return simRepo.save(newSimulators);
    }
}
