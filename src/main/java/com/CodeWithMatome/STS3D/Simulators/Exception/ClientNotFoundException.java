package com.CodeWithMatome.STS3D.Simulators.Exception;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(Long id){
        super("error " + id);
    }

}
