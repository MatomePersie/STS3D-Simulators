// package com.CodeWithMatome.STS3D.Simulators.Controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.CodeWithMatome.STS3D.Simulators.Exception.DeBrochenNotFoundException;
// import com.CodeWithMatome.STS3D.Simulators.Model.DeBrochen;
// import com.CodeWithMatome.STS3D.Simulators.Repository.DeBrochenRepository;

// @RestController
// public class DeBrochenController {

//     @Autowired
//     private DeBrochenRepository deBrochenRepo;

//     @PostMapping("/PostDebrochen")
//     DeBrochen newDeBrochen(@RequestBody DeBrochen newDeBrochen){
//         return deBrochenRepo.save(newDeBrochen);
//     }
//     @GetMapping("/GetDebrochen")
//     List<DeBrochen> getAllDeBrochens(){
//         return deBrochenRepo.findAll();
//     }
//     @GetMapping("DeBrochen/{id}")
//         DeBrochen getBrochenByid(@PathVariable Long id){
//             return deBrochenRepo.findById(id)
//             .orElseThrow(()-> new DeBrochenNotFoundException(id));
//         }
// }
