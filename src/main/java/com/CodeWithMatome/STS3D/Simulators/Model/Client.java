package com.CodeWithMatome.STS3D.Simulators.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue

    private Long id;
    private String  Name;
    private Long Num;
    private String Location;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Long getNum() {
        return Num;
    }
    public void setNum(Long num) {
        Num = num;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
}
