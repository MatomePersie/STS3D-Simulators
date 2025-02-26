// package com.CodeWithMatome.STS3D.Simulators.Controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.CodeWithMatome.STS3D.Simulators.Exception.MarulaNotFoundException;
// import com.CodeWithMatome.STS3D.Simulators.Model.Marula;
// import com.CodeWithMatome.STS3D.Simulators.Repository.MarulaRepository;

// @RestController
// public class MarulaController {

//     @Autowired

//     private MarulaRepository RepoMarula;

//     @PostMapping("/PostMarula")
//     Marula MarulaNew(@RequestBody Marula MarulaNew){
//         return RepoMarula.save(MarulaNew);
//     }

//     @GetMapping("/GetMarula")
//     List<Marula> getAllMarulas(){
//         return RepoMarula.findAll();
//     }
//     @GetMapping("Marula/{id}")
//         Marula getMarulaByid(@PathVariable Long id){
//             return RepoMarula.findById(id)
//             .orElseThrow(()-> new MarulaNotFoundException(id));

//         }
          

// }
