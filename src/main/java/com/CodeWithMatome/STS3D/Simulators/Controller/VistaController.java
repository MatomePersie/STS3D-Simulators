// package com.CodeWithMatome.STS3D.Simulators.Controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.CodeWithMatome.STS3D.Simulators.Exception.VistaNotFoundException;
// import com.CodeWithMatome.STS3D.Simulators.Model.Vista;
// import com.CodeWithMatome.STS3D.Simulators.Repository.VistaRepository;


// @RestController
// public class VistaController {

//     @Autowired
//     private VistaRepository VistaRepo;

//     @PostMapping("/PostVista")
//     Vista newVista(@RequestBody Vista newVista){
//         return  VistaRepo.save(newVista);
//     }

//     @GetMapping("/GetVista")
//     List<Vista> getAllVistas(){
//         return VistaRepo.findAll();
//     }
//     @GetMapping("Vista/{id}")
//      Vista geVistaByid(@PathVariable Long id){
//         return VistaRepo.findById(id)
//         .orElseThrow(() -> new VistaNotFoundException(id));
//      }

// }
