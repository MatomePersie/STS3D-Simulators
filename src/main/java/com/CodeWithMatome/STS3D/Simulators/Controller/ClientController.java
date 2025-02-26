package com.CodeWithMatome.STS3D.Simulators.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CodeWithMatome.STS3D.Simulators.Exception.ClientNotFoundException;
import com.CodeWithMatome.STS3D.Simulators.Model.Client;
import com.CodeWithMatome.STS3D.Simulators.Repository.ClientRepository;
import  java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ClientController {

    @Autowired
    private ClientRepository  clientrepo;
    
    @PostMapping("/PostClient")
     Client newClient(@RequestBody Client newClient){

         return clientrepo.save(newClient);

     }

     @GetMapping("/GetClient")
      List<Client> getAllClients(){
        return clientrepo.findAll();
      }
      @GetMapping("/Client/{id}")
        Client getClientById(@PathVariable Long id){
          return clientrepo.findById(id)
          .orElseThrow(()-> new ClientNotFoundException(id));
        }

      @PutMapping("/Client/{id}")
        Client updaClient(@RequestBody Client newClient ,@PathVariable Long id){
          return clientrepo.findById(id)
          .map(client-> {
            client.setName(newClient.getName());
            client.setNum(newClient.getNum());
            client.setLocation(newClient.getLocation());
            return clientrepo.save(client);
          }).orElseThrow(()-> new ClientNotFoundException(id));
        }

        @DeleteMapping("/Client/{id}")
          String  deleteClient(@PathVariable Long id){
            if(!clientrepo.existsById(id)){
              throw new ClientNotFoundException(id);
            }
            clientrepo.deleteById(id);
            return "client with id "+ id  + " has been deleted succesfully ";
          }

}
