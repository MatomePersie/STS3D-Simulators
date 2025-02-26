// package com.CodeWithMatome.STS3D.Simulators.Controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.CodeWithMatome.STS3D.Simulators.Exception.ThorncliffNotFoundException;
// import com.CodeWithMatome.STS3D.Simulators.Model.Thorncliff;
// import com.CodeWithMatome.STS3D.Simulators.Repository.ThorncliffRepository;

// @RestController
// public class ThorncliffController {
//     @Autowired
//     private ThorncliffRepository ThorncliffRepo;

//     @PostMapping("/PostThorncliff")
//     Thorncliff newThorncliff(@RequestBody Thorncliff newThorncliff){
//         return ThorncliffRepo.save(newThorncliff);
//     }

//     @GetMapping("/GetThorncliff")
//     List<Thorncliff> getAllThorncliff(){
//         return ThorncliffRepo.findAll();
//     }
//     @GetMapping("Thorncliff/{id}")
//         Thorncliff geThorncliffByid(@PathVariable Long id){
//             return ThorncliffRepo.findById(id)
//             .orElseThrow(()-> new ThorncliffNotFoundException(id));
//         }

// }
