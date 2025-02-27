package com.CodeWithMatome.STS3D.Simulators.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Simulators {
    public Long getSimId() {
        return SimId;
    }
    public void setSimId(Long simId) {
        SimId = simId;
    }
    public String getSimName() {
        return SimName;
    }
    public void setSimName(String simName) {
        SimName = simName;
    }
    public String getSiteName() {
        return SiteName;
    }
    public void setSiteName(String siteName) {
        SiteName = siteName;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    @Id
    @GeneratedValue

    private Long SimId;
    private  String SimName;
    private String SiteName;
    private String Status;
}
