// package com.CodeWithMatome.STS3D.Simulators.Controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.CodeWithMatome.STS3D.Simulators.Exception.UnkiNotFoundException;
// import com.CodeWithMatome.STS3D.Simulators.Model.Unki;
// import com.CodeWithMatome.STS3D.Simulators.Repository.UnkiRepository;

// @RestController
// public class UnkiController {

//     @Autowired
//     private UnkiRepository UnkiRepo;

//     @PostMapping("/PostUnki")
//     Unki newUnki(@RequestBody Unki newUnki){
//         return UnkiRepo.save(newUnki);
//     }

//     @GetMapping("/GetUnki")
//     List<Unki> getALUnki(){
//         return UnkiRepo.findAll();
//     }
//     @GetMapping("Unki/{id}")
//         Unki getUnkiByid(@PathVariable Long id){
//             return UnkiRepo.findById(id)
//             .orElseThrow(() -> new UnkiNotFoundException(id));
//         }

// }
