package com.CodeWithMatome.STS3D.Simulators.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CodeWithMatome.STS3D.Simulators.Model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
