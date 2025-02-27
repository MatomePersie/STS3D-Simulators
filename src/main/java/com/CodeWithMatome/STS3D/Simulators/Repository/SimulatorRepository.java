package com.CodeWithMatome.STS3D.Simulators.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CodeWithMatome.STS3D.Simulators.Model.Simulators;

public interface SimulatorRepository extends JpaRepository<Simulators, Long> {

}
