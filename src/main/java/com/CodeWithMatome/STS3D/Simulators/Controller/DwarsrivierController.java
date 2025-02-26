// package com.CodeWithMatome.STS3D.Simulators.Controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.CodeWithMatome.STS3D.Simulators.Exception.DwarsrivierNotFoundException;
// import com.CodeWithMatome.STS3D.Simulators.Model.Dwarsrivier;
// import com.CodeWithMatome.STS3D.Simulators.Repository.DwarsrivierRepository;

// @RestController
// public class DwarsrivierController {

//     @Autowired
//     private DwarsrivierRepository DwarsRepo;

//     @PostMapping("/PostDwars")
//     Dwarsrivier newDwars(@RequestBody Dwarsrivier newDwars){
//         return DwarsRepo.save(newDwars);
//     }

//     @GetMapping("/GetDwars")
//     List<Dwarsrivier> getAllDwarsriviers(){
//         return DwarsRepo.findAll();
//     }
//     @GetMapping("Dwarsrivier/{id}")
//         Dwarsrivier getDwarsrivierByid(@PathVariable Long id){
//             return DwarsRepo.findById(id)
//             .orElseThrow(()-> new DwarsrivierNotFoundException(id));
//         }

// }
